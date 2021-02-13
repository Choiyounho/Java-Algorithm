package swallow.chapter4;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack<Integer> integerStack = init();

        System.out.println(integerStack.capacity()); // 스택에 할당되는 용량
        System.out.println(integerStack.size()); // 현재 스택에 적재되어 있는 데이터의 개수
        System.out.println(integerStack.search(3)); // 스택의 자료 찾기, 없으면 -1 반환 있으면 index 반환
        System.out.println(integerStack); // 스택 출력
        System.out.println(integerStack.indexOf(5)); // 객체의 index 반환
        System.out.println(integerStack.peek()); // 스택의 마지막 index 출력
        System.out.println(integerStack.pop()); // 스택의 마지막 index 제거
        integerStack.clear(); // 스택 비우기
        System.out.println(integerStack);


    }

    public static Stack<Integer> init() {
        Stack<Integer> integerStack = new Stack<>(); // 스택 생성

        integerStack.push(3);  // 스택 값 대입
        integerStack.push(4);
        integerStack.push(5);
        integerStack.push(6);
        integerStack.push(7);
        integerStack.push(8);
        return integerStack;
    }
}
