package chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StackTestTest {

    private Stack<Integer> stack;

    @BeforeEach
    void setUp() {
        stack = StackTest.init();
    }

    @Test
    void stackCapacity() {
        assertThat(stack.capacity()).isEqualTo(10);
    }

    @Test
    void stackSize() {
        assertThat(stack.size()).isEqualTo(6);
    }

    @Test
    void stackIndex() {
        assertThat(stack.indexOf(5)).isEqualTo(2);
    }

}