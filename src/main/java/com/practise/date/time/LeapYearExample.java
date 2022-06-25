package com.practise.date.time;

import java.time.Year;

public class LeapYearExample {

    public static void main(String... args) {
        System.out.println("Leap Year (2001) : " + isLeapYearOrNot(2001));
        System.out.println("Leap Year (2012) : " + isLeapYearOrNot(2012));
    }

    public static boolean isLeapYearOrNot(Integer value) {
        Year year = Year.of(value);
        return year.isLeap();
    }
}

