package swallow.chapter5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DirectRecursiveTest {

    @Test
    @DisplayName("직접 재귀 팩토리얼 기능")
    void factorial() {
        assertThat(DirectRecursive.factorial(-10)).isEqualTo(1);
    }

}
