package swallow.chapter5;

import static utils.CommonsConstant.*;

public class DirectRecursive {

    public static void main(String[] args) {
        // 직접 재귀
        System.out.print("구하실 팩토리얼 값을 입혁해주세요 : ");
        int input = scanner.nextInt();
        System.out.println(factorial(input));
    }

    public static int factorial(int number) {
        if (number < 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }

}
