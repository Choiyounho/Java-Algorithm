package swallow.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class StreamTest {

    private List<User> friends;
    private List<User> studyMembers;
    private List<List<User>> totals;

    @BeforeEach
    void setUp() {
        friends = new ArrayList<>();
        friends.add(new User(1, "최윤호", 27));
        friends.add(new User(2, "임한결", 26));
        friends.add(new User(3, "최우림", 26));
        friends.add(new User(4, "이찬준", 27));
        friends.add(new User(5, "김민현", 26));
        friends.add(new User(6, "최하림", 26));

        studyMembers = new ArrayList<>();
        studyMembers.add(new User(7, "혜원", 24));
        studyMembers.add(new User(8, "동헌", 24));
        studyMembers.add(new User(9, "용수", 24));

        totals = new ArrayList<>();
        totals.add(friends);
        totals.add(studyMembers);
    }

    @Test
    void getNames() {
        long names = friends.stream()
                .filter(user -> user.isContainsToName("최")) // 최윤호, 최우림, 최하림 : User
                .filter(user -> user.getAge() == 26)
                .map(User::getName) // String
                .count();

        assertThat(names).isEqualTo(2);
    }

    @Test
    void name() {
        long results = IntStream.range(1, 10)
                .boxed()
                .skip(4)
                .count();

        System.out.println(results);
    }

    @Test
    void flatMap() {
        List<String> results = totals.stream()
                .flatMap(Collection::stream)
                .map(User::getName)
                .collect(Collectors.toList());

        System.out.println(results);
    }

    @Test
    void name1() {
        IntStream.iterate(0, number -> number + 2)
                .forEach(System.out::println);
    }

    @Test
    void forEach() {
        for (User user : friends) {
            System.out.println(user.getName());
        }
        System.out.println();
        friends.stream()
                .filter(user -> user.getName().contains("최"))
                .filter(user -> user.getAge() > 20)
                .collect(Collectors.toList());
    }

    @Test
    void nullCase() {
        boolean result = friends.stream()
                .filter(user -> user.getName().contains("최윤호"))
                .map(User::getName)
                .anyMatch(name -> name.equals("최윤호"));
        assertThat(result).isTrue();
    }

    @Test
    void optional() {
        Optional<User> maybeUser = Optional.ofNullable(new User());

        maybeUser.ifPresent(user -> {
            user.addAdminPermission();
        });

        if (maybeUser.isPresent()) { // user != null
            throw new RuntimeException();
        }
    }
}
