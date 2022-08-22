package com.practise.streams.maptoint;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class MapToIntExample {

    public static void main(String ...args){

        //Find the maximum value in List, if the list contains String of Integers
        List<String> srcList = Arrays.asList("1","2","3","5");

        OptionalInt maxValue = srcList.stream().mapToInt(Integer::parseInt)
                .max();
        System.out.println("Max Value : " + maxValue.getAsInt());

        //Print the length of each string in the array list
        List<String> srcList1 = Arrays.asList("first", "second", "third", "fourth");
        srcList1.stream().mapToInt(String::length)
                .forEachOrdered(System.out::println);

    }
}
