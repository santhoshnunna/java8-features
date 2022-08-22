package com.practise.optional;

import com.practise.data.Customer;
import com.practise.data.DummyDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static Customer getCustomerByEmailId(String emailId) throws Exception {

        List<Customer> allCustomer = DummyDatabase.getAllCustomers();
        return allCustomer.stream().
                filter(customer -> customer.getEmailId().equals(Optional.ofNullable(emailId)))
                .findAny()
                .orElseThrow(() -> new Exception("Customer Not Found"));


    }
    public static void main(String... args) throws Exception {

        Customer customer = new Customer("1234", "firstName", null,
                Arrays.asList("12345555", "98887777"));

        //creating optional class

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        //If the object is null, it will return empty.
        //It's a combination of of() and nullable()
        Optional<String> nullableEmailId = customer.getEmailId();
        System.out.println(nullableEmailId); //It will not throw NullPointerException

        /*//If the object is null, it will throw NullPointerException
        Optional<String> optionalEmailId = Optional.of(customer.getEmailId());
        System.out.println(optionalEmailId); //NullPointerException*/

        //Now update customer object emailId
        customer.setEmailId("test@test.com");
        nullableEmailId = customer.getEmailId();
        System.out.println(nullableEmailId); //Optional[test@test.com]
        //Approach 1
        if (nullableEmailId.isPresent())
            System.out.println(nullableEmailId.get()); //test@test.com

        //Approach 2 - if value is there, it will return, Otherwise default value
        System.out.println(nullableEmailId.orElse("default@default.com"));
        customer.setEmailId(null);
        nullableEmailId = customer.getEmailId();
        System.out.println(nullableEmailId.orElse("default@default.com")); //default@default.com


        //map
        customer.setEmailId("test@test.com");
        nullableEmailId = customer.getEmailId();
        System.out.println(nullableEmailId.map(
                String::toUpperCase
        ).orElseGet(() -> "default email...."));

        /*//orElseThrow
        customer.setEmailId(null);
        nullableEmailId = Optional.ofNullable(customer.getEmailId());
        System.out.println(nullableEmailId.orElseThrow(
                () -> new IllegalArgumentException("Email Not Present")));*/

        Customer customer1 = getCustomerByEmailId("test1@test.com");
        System.out.println(customer1);
    }
}
