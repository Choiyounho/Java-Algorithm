package swallow.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {

    @Test
    @DisplayName("재귀 미사용 팩토리얼")
    void factorial() {
        int result = Factorial.factorial(1,5);
        assertThat(result).isEqualTo(120);
    }

}
