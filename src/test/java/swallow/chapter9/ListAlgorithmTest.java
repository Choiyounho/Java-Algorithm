package swallow.chapter9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class ListAlgorithmTest {

    List<Integer> list;

    @BeforeEach
    void setLinkedList() {
        list = new LinkedList<Integer>();
    }

    @Test
    @DisplayName("LinkedList removeLast")
    void linkedListRemoveTest() {

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        list.remove(list.size() -1 ); // 마지막 요소 제거
        System.out.println(list);
        System.out.println(list.indexOf(6));

        assertThat(list.indexOf(6)).isEqualTo(5);
    }

}
