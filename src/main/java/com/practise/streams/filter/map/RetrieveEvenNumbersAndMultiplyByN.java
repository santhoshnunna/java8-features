package com.practise.streams.filter.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RetrieveEvenNumbersAndMultiplyByN {

    public static void main(String ...args){

        int []intArr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int N = 3;
        List<Integer> results =
                Arrays.stream(intArr)
                        .filter(value -> value%2==0)
                        .map(operand -> operand*N)
                        .boxed()
                        .collect(Collectors.toList());
        System.out.println(results);

    }
}
