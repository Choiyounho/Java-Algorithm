package chapter3;

import java.util.Arrays;

import static utils.CommonsConstant.scanner;

public class Search{


    public static void main(String[] args) {

        int[] a = {5, 2, 3, 7, 5, 7};
        System.out.println("배열 : " + Arrays.toString(a));
        System.out.println("몇번째 인덱스에 *을 찍고 싶으신가요?");
        while (true) {
            int arrLength = scanner.nextInt();
            if (arrLength < 0 || arrLength > 5) {
                break;
            }
            System.out.println("   |  0  1  2  3  4  5");
            System.out.print("   | ");
            for (int i = 0; i < arrLength; i++) {
                System.out.print("   ");
            }
            System.out.println(" *");
            System.out.println(" " + arrLength + " |  " + a[0] + "  " + a[1] + "  " + a[2] + "  " + a[3] + "  " + a[4] + "  " + a[5]);
        }

    }

}
