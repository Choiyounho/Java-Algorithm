package chapter1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxOrMin {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg) {
        System.out.println("1 입력시 최댓값을 , 2 입력시 최솟값을 구합니다.");
        int input = scanner.nextInt();
        inputCase(input);

        scanner.close();
    }

    private static void inputCase(int input) {
        if (input == 1) {
            maxNum();
        }
        if (input == 2) {
            minNum();
        }
        throw new IllegalArgumentException("해당하지 않는 값입니다.");
    }

    private static void maxNum() {
        System.out.println("최댓값을 구하겠습니다. 숫자를 입력해주세요.");
        System.out.println("문자를 입력하면 자동종료됩니다.");

        List<Integer> intList = createIntList();

        addNum(intList);

        System.out.print("Maximum number : ");
        System.out.println(calculateMax(intList));
    }

    private static void minNum() {
        System.out.println("최솟값을 구하겠습니다. 숫자를 입력해주세요.");
        System.out.println("문자를 입력하면 자동종료됩니다.");

        List<Integer> intList = createIntList();

        addNum(intList);

        System.out.print("Minimum number : ");
        System.out.println(calculateMin(intList));
    }

    private static ArrayList<Integer> createIntList() {
        return new ArrayList<>();
    }

    private static void addNum(List<Integer> intList) {
        int i = 0;
        while (true) {
            String input = scanner.nextLine();
            int stringToInt = toInt(input);
            intList.add(stringToInt);
            System.out.println((i + 1) + "번째 숫자 : " + intList.get(i));
            i++;
        }
    }

    private static int toInt(String input) {
        try {
            return Integer.parseInt(String.valueOf(input));
        } catch (Exception e) {
            throw new NumberFormatException("프로그램이 종료되었습니다.");
        }
    }

    private static int calculateMax(List<Integer> intList) {
        return Collections.max(intList);
    }

    private static int calculateMin(List<Integer> intList) {
        return Collections.min(intList);
    }

}
