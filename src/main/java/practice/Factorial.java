package practice;

import java.util.Scanner;

public class Factorial {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        int fac = 1;
        int input;
        System.out.print("찾는 팩토리얼 값 : ");
        for (input = scanner.nextInt(); input > 0; input--) {
            fac *= input;
        }
        System.out.println("팩토리얼을 구하겠습니다.");
        for (int i = 0; i < 3; i++) {
            System.out.print(". ");
            Thread.sleep(400);
        }
        System.out.print("\n>>> ");
        System.out.println(fac);
    }

}
