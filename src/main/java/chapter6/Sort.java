package chapter6;

import java.util.Arrays;
import java.util.Collections;

public class Sort{
    public static void main(String[] args) {

        int[] sample = {9, 1, 3, 4, 6, 7, 8};

        ascendingOrderArr(sample);

        System.out.println(Arrays.toString(sample));
        System.out.println();

        Integer[] sample2 = {9, 1, 3, 4, 6, 7, 8};

        descendingOrderArr(sample2);

        System.out.println(Arrays.toString(sample2));
    }

    public static int[] ascendingOrderArr(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static Integer[] descendingOrderArr(Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

}
