package chapter5;

import java.util.Scanner;

public class DirectRecursive {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // 직접 재귀
        System.out.print("구하실 팩토리얼 값을 입혁해주세요 : ");
        int input = scanner.nextInt();
        System.out.println(factorial(input));

    }

    private static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

}
