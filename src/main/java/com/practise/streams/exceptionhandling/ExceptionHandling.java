package com.practise.streams.exceptionhandling;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandling {

    public static void main(String... args) {

        //Handling un-checked exceptions
        List<String> list = Arrays.asList("33", "55", "44", "abc");
        //Approach 1
        list.forEach(ExceptionHandling::traverseList);
        //Approach 2
        list.forEach(handleExceptionIfAny(s -> System.out.println(Integer.parseInt(s))));
        //Handle generic way of exceptions
        list.forEach(handleExceptionIfAny(s -> System.out.println(Integer.parseInt(s)),
                NumberFormatException.class));
        //create a new list and invoke generic way of exception handling
        List<Integer> list1 = Arrays.asList(1, 0);
        list1.forEach(handleExceptionIfAny(s -> System.out.println(10 / s),
                ArithmeticException.class));

        //Handling checked exceptions
        List<Integer> list3 = Arrays.asList(10, 20);
        list3.forEach(handleCheckedExceptionConsumerIfAny(i -> {
            Thread.sleep(i);
            System.out.println(i);
        }));

    }

    /**
     * Approach 1
     *
     * @param s string
     */
    public static void traverseList(String s) {

        try {
            System.out.println(Integer.parseInt(s));
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }

    /**
     * It's tightly coupled with String data type
     *
     * @param payLoad payload for consumer
     * @return consumer
     */
    static Consumer<String> handleExceptionIfAny(Consumer<String> payLoad) {

        return obj -> {
            try {
                payLoad.accept(obj);
            } catch (Exception e) {
                System.out.println("Exception : " + e.getMessage());
            }
        };
    }

    /**
     * Handling exceptions in generic way
     *
     * @param targetConsumer targetConsumer
     * @param exceptionObjectClass exceptionObjectClass
     * @param <T> typeOfParameter
     * @param <E> exceptionClass
     * @return consumer
     */
    static <T, E extends Exception> Consumer<T> handleExceptionIfAny(
            Consumer<T> targetConsumer, Class<E> exceptionObjectClass) {

        return obj -> {
            try {
                targetConsumer.accept(obj);
            } catch (Exception e) {
                try {
                    E exceptionObject = exceptionObjectClass.cast(e);
                    System.out.println("Exception :" + exceptionObject.getMessage());
                } catch (ClassCastException exc) {
                    throw e;
                }
            }
        };
    }

    static <T> Consumer<T> handleCheckedExceptionConsumerIfAny(
            CheckedExceptionHandlerConsumer<T, Exception> handlerConsumer) {

        return obj -> {
            try {
                handlerConsumer.accept(obj);
            } catch (Exception e) {
                throw new RuntimeException(e);
                //System.out.println("Exception : " + e.getMessage());
            }
        };
    }

}
