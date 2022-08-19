package com.practise.streams.exceptionhandling;

@FunctionalInterface
public interface CheckedExceptionHandlerConsumer <T, E extends Exception> {

     void accept(T t) throws E;
}
