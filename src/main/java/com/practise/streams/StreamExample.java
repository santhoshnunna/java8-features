package com.practise.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String... args) {

        //Adding elements from one list to another list
        //Approach - 1
        List<String> sourceList = Arrays.asList("1", "2", "3");
        List<String> newList = new ArrayList<>();

        sourceList.stream()
                .forEachOrdered(newList::add);
        System.out.println(newList);

        //Approach - 2
        sourceList.stream().collect(
                Collectors.toCollection(() -> newList)
        );
        System.out.println(newList);

        //Converting List to Set
        List<String> sourceList1 = Arrays.asList("1", "2", "3");
        System.out.println(sourceList1.stream().collect(
                Collectors.toSet()
        ));


    }
}
