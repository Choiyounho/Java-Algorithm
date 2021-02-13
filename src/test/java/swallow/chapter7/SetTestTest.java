package swallow.chapter7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class SetTestTest {

    @Test
    @DisplayName("같은 요소끼리 재조합")
    void sameFactor() {
        List<Integer> normalList = new ArrayList<>();
        normalList.add(5);
        normalList.add(2);
        normalList.add(4);
        normalList.add(8);
        normalList.add(1);
        normalList.add(7);

        List<Integer> comparison = new ArrayList<>();
        comparison.add(8);
        comparison.add(1);
        comparison.add(11);
        comparison.add(17);
        comparison.add(12);
        comparison.add(18);

        List<Integer> sameList = new ArrayList<>();
        sameList.add(8);
        sameList.add(1);

        assertThat(SetTest.sameFactor(normalList, comparison)).isEqualTo(sameList);
    }

}
