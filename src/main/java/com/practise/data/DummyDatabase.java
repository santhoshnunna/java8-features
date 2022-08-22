package com.practise.data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DummyDatabase {

    public static List<Customer> getAllCustomers(){

        return Stream.of(
                new Customer("123", "customer1", "test1@test.com",
                        Arrays.asList("123", "456")),
                new Customer("1234", "customer2", "test2@test.com",
                        Arrays.asList("1234", "4567")),
                new Customer("12345", "customer3", "test3@test.com",
                        Arrays.asList("12345", "45678")),
                new Customer("123456", "customer4", "test4@test.com",
                        Arrays.asList("123456", "456789")),
                new Customer("1234567", "customer4", "test5@test.com",
                        Arrays.asList("1234567", "456789"))).
                collect(Collectors.toList());

    }
}
