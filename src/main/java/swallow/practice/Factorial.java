package swallow.practice;

import static utils.CommonsConstant.*;

public class Factorial {

    public static void main(String[] args) throws InterruptedException {
        int fac = 1;
        System.out.print("찾는 팩토리얼 값 : ");
        int input = scanner.nextInt();

        fac = factorial(fac, input);

        System.out.println("팩토리얼을 구하겠습니다.");
        for (int i = 0; i < 3; i++) {
            System.out.print(". ");
            Thread.sleep(400);
        }
        System.out.print("\n>>> ");
        System.out.println(fac);
    }

    public static int factorial(int fac, int input) {
        for (int i = input; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }

    // 비즈니스 로직을 작성하는 클래스
    // 서비스 == 뷰모델
    // 호출되는 클래스
    // 컨트롤러 == 액티비티


    // 회원가입 로직
    // 컨트롤러 & 액티비티
    // UserActivity {
    //
    // private UserViewModel userViewModel;

    // public void onCreate() {
    // userViewModel.register(String name);
    //    }
    // }

    // register()
    //

    // payment_amount_exceeded
    // user_register
    // @DisplayName("금액 초과에 대한 테스트")
    // paymentAmountExceeded
}
