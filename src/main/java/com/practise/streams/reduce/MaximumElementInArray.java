package com.practise.streams.reduce;

import java.util.Arrays;

public class MaximumElementInArray {
    public static void main(String... args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Approach 1
        int maxValue =
                Arrays.stream(numbers)
                        .reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(maxValue);

        //Approach 2 - using method reference
        int maxValue1 =
                Arrays.stream(numbers)
                        .reduce(0,Integer::max);
        System.out.println(maxValue1);
    }
}
