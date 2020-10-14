package chapter2;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        int a = 3;
        int[] b = {1, 2, 3};
        int[] c = new int[3];
        c[2] = 3;
        Integer bb = new Integer(3);

//      같은 주소값
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b[2]));
        System.out.println(System.identityHashCode(c[2]));
        System.out.println(System.identityHashCode(3));

//      다른 주소값
        System.out.println("\n" + System.identityHashCode(a));
        System.out.println(System.identityHashCode(bb));


        // 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드를 작성하라

        int[] d = new int[5];
        int[] e = {1, 2, 3, 4, 5};
        reverseArr(d, e);

        System.out.println(Arrays.toString(d));

    }

    private static void reverseArr(int[] c, int[] d) {
        for (int i = 0; i < d.length; i++) {
            c[i] = d[(d.length - 1) - i];
        }
    }

}



