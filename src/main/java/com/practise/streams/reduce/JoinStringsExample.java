package com.practise.streams.reduce;

import java.util.Arrays;

public class JoinStringsExample {

    public static void main(String ...args){

        String[] strings = {"a", "b", "c", "d", "e"};

        String reduceStrings =
                Arrays.stream(strings).reduce("",(a,b) -> a + "|" + b);
        System.out.println(reduceStrings);  // |a|b|c|d|e

        //Remove first pipe symbol from the string
        String reduceStr
                =Arrays.stream(strings)
                .reduce("",(a,b) -> {
                    if(!"".equals(a)){
                        return a + "|" + b;
                    }else{
                        return b;
                    }
                });
        System.out.println(reduceStr); // a|b|c|d|e

        //Using Java 8 String.join()
        String joinString = String.join("|",strings);
        System.out.println(joinString);
    }
}
