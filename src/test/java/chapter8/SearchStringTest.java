package chapter8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SearchStringTest {

    private static final String testText = "AB자바CDE자바FG자바HIJ자바";
    public static final String ORIGINAL_TEXT = "ZABCABXACCADEFABCABD";
    public static final String PATTERN_TEXT = "ABCABD";

    @Test
    @DisplayName("브루트 포스 - testText 의 첫번째 자바 단어 탐색")
    void bruteForceSearchToIndexOf1() {
        assertThat(testText.indexOf("자바")).isEqualTo(2);
    }

    @Test
    @DisplayName("브루트 포스 - testText 의 마지막 자바 단어 탐색")
    void bruteForceSearchToLastIndexOf() {
        assertThat(testText.lastIndexOf("자바")).isEqualTo(16);
    }

    @Test
    @DisplayName("브루트 포스 - testText 의 자바 단어 탐색 위치 설정")
    void bruteForceSearchToIndexOf2() {
        assertThat(testText.indexOf("자바", 9)).isEqualTo(11);
    }

    @Test
    @DisplayName("KMP - testText 의 문장 패턴 찾기")
    void kmpMatch() {
        int index = SearchString.kmpMatch(ORIGINAL_TEXT, PATTERN_TEXT);
        assertThat(SearchString.printMatch(ORIGINAL_TEXT, PATTERN_TEXT, index)).isEqualTo((index + 1) + "번째 문자와 일치합니다.");
    }

    @Test
    @DisplayName("Boyer-More - KMP 법 보완한 방법")
    void bmMatch() {
        int index = SearchString.bmMatch(ORIGINAL_TEXT, PATTERN_TEXT);
        assertThat(SearchString.printMatch(ORIGINAL_TEXT, PATTERN_TEXT, index)).isEqualTo((index + 1) + "번째 문자와 일치합니다.");
    }

}