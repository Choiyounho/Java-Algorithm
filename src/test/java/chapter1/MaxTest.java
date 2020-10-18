package chapter1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    @DisplayName("최대값 계산 기능 - 응용한 코드")
    void calculateMax1() {
        int result = Max.calculateMax(new int[] {1, 2, 3, 4, 5});
        assertThat(result).isEqualTo(5);
    }

    @Test
    @DisplayName("최대값 계산 기능 - 기본 코드")
    void calculateMax2() {
        int result = Max.max4(1, 2, 3, 4);
        assertThat(result).isEqualTo(4);
    }

}