package com.practise.streams.reduce;

import java.util.Arrays;

public class SumOfAllTheElementsInArray {

    public static void main(String... args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //One Approach
        int sum =
                Arrays.stream(numbers)
                        .reduce(0, (firstElement, secondElement) -> firstElement + secondElement);
        System.out.println(sum);

        //Another Approach - using method reference
        int sum1 =
                Arrays.stream(numbers)
                        .reduce(0, Integer::sum);
        System.out.println(sum1);


    }
}
