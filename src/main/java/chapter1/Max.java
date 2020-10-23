package chapter1;

import java.util.Arrays;
import static utils.CommonsConstant.*;

public class Max {

    // 응용

    public static void main(String[] args) {
        maxNum();
        scanner.close();
    }

    // 연습문제 1. 숫자 4개 중 최댓값을 구하는 메서드를 구현하시오.
    // 기존 예제
    public static int max4(int a, int b, int c, int d) {
        int max = a;
        if (a < b) {
            max = b;
        }
        if (b < c) {
            max = c;
        }
        if (c < d) {
            max = d;
        }
        return max;
    }

    public static void maxNum() {
        System.out.println("몇개의 숫자를 비교 하실 건가요?");
        int count = scanner.nextInt();

        int[] counts = createIntArrays(count);

        addNum(counts);

        System.out.print("Maximum number : ");
        System.out.println(calculateMax(counts));

//        최솟값
//        System.out.print("Minimum number : ");
//        System.out.println(calculateMin(counts));
    }

    private static void addNum(int[] count) {
        for (int i = 0; i < count.length; i++) {
            System.out.print((i + 1) + "번째 숫자 : ");
            count[i] = scanner.nextInt();
        }
    }

    private static int[] createIntArrays(int count) {
        return new int[count];
    }

    public static int calculateMax(int[] count) {
        return Arrays.stream(count)
                .max()
                .getAsInt();
    }

//    private static int calculateMin(int[] count) {
//        return Arrays.stream(count)
//                .min()
//                .getAsInt();
//    }

}
