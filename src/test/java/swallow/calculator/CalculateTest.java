package swallow.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateTest {

    private Calculate calculate;

    @BeforeEach
    void setUp() {
        calculate = new Calculate();
    }

    @ParameterizedTest
    @DisplayName("더하기 테스트")
    @CsvSource(value = {"1:2:3"}, delimiter = ':')
    void plus(int firstNumber, int secondNumber, int expected) {
        int result = calculate.add(firstNumber, secondNumber);
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @DisplayName("빼기 테스트")
    @CsvSource(value = {"3:2:1"}, delimiter = ':')
    void minus(int firstNumber, int secondNumber, int expected) {
        int result = calculate.minus(firstNumber, secondNumber);
        assertThat(result).isEqualTo(expected);
    }
    
}
