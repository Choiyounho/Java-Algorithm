package astronaut;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Chapter01 {

    @Test
    @DisplayName("순차 검색과 이진 검색")
    void search() {
        int[] A = {10, 12, 13, 14, 18, 20, 25, 27, 30, 35, 40, 45, 47};
        int x = 18;
        int n = A.length;

        int location = binarySearch(A, 0, n - 1, x); // 이진 검색
        int index = search(A, x);  // 순차 검색
    }

    static int binarySearch(int[] A, int first, int last, int target) {
        int result;
        if (first > last) {
            result = -1;
        } else  {
            int mid = (first + last) / 2;
            if (target == A[mid]) {
                result = mid;
            } else if(target < A[mid]) {
                result = binarySearch(A, first, mid - 1, target);
            } else {
                result = binarySearch(A, mid + 1, last,  target);
            }
        }
        return  result;
    }

    static int search(int[] A, int target) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == target) {
                return target;
            }
        }
        return -1;
    }
}
