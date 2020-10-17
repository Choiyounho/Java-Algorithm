package chapter6;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort{
    public static void main(String[] args) {

        int[] sample = {9, 1, 3, 4, 6, 7, 8};

        Arrays.sort(sample);

        System.out.println(Arrays.toString(sample));
        System.out.println();

        Integer[] sample2 = {9, 1, 3, 4, 6, 7, 8};

        Arrays.sort(sample2, Collections.reverseOrder());

        System.out.println(Arrays.toString(sample2));
    }

}
