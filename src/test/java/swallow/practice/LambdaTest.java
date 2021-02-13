package swallow.practice;

import org.junit.jupiter.api.Test;

import java.util.function.*;

public class LambdaTest {

    @Test
    void test() {
        AgeInterface ageInterface = age -> age + 10;

        AgeInterface ageInterface1 = number -> number + 10; // 인터페이스를 이용한 lambda 구현
        Function<Integer, Integer> function = number -> number + 10; // Function api를 이용한 lambda 구현. 매개변수 <T, R>
        UnaryOperator<Integer> unaryOperator = number -> number * 2; // UnaryOperator api를 이용한 lambda 구현. 매개변수의 인풋과 아웃풋의 타입이 같을 때 사용

        BiFunction<Integer, Integer, Integer> biFunction = Integer::sum; // BiFunction api를 이용한 lambda 구현. 매개변수가 두개일 때 <T, T, R>

        BinaryOperator<Integer> sum = Integer::sum;
        BinaryOperator<Integer> minus = (x, y) -> x - y;
        BinaryOperator<Integer> multiple = (x, y) -> x * y;
        BinaryOperator<Integer> division = (x, y) -> x / y;

        Supplier<Integer> supplier = () -> 10;

        Supplier<User> userSupplier = User::new;
        String name = userSupplier.get().getName();
        System.out.println(name);


        Consumer<Integer> consumer = System.out::println;

        Predicate<Integer> predicate = number -> number % 2 == 0;

//        System.out.println(ageInterface.increaseAge(1));
//        System.out.println(ageInterface1.increaseAge(1));
        System.out.println(function.compose(unaryOperator).apply(10));


//        System.out.println(unaryOperator.apply(1));
//        System.out.println(biFunction.apply(1, 2));
//        System.out.println(supplier.get());
//        consumer.accept(10);
//        System.out.println(predicate.test(10));
    }

}
