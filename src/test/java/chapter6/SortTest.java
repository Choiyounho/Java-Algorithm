package chapter6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class SortTest {

    @Test
    @DisplayName("int[] ascending Order")
    void ascendingOrderArr() {
        int[] arr = {6, 3, 4, 1, 2, 7, 8};
        assertThat(Sort.ascendingOrderArr(arr)).isEqualTo(arr = new int[]{1, 2, 3, 4, 6, 7, 8});
    }

    @Test
    @DisplayName("Integer[] descending Order")
    void descendingOrderArr() {
        Integer[] arr = {6, 3, 4, 1, 2, 7, 8};
        assertThat(Sort.descendingOrderArr(arr)).isEqualTo(arr = new Integer[]{8, 7, 6, 4, 3, 2, 1});
    }

}