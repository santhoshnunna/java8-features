package com.practise.streams.reduce;

import com.practise.data.Invoice;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

public class ReduceExample {

    public static void main(String... args) {

        List<Invoice> invoices = Arrays.asList(
                new Invoice("A101", BigDecimal.valueOf(9.99), BigDecimal.valueOf(1)),
                new Invoice("A102", BigDecimal.valueOf(19.99), BigDecimal.valueOf(1.5)),
                new Invoice("A103", BigDecimal.valueOf(29.99), BigDecimal.valueOf(2))

        );

        BigDecimal sumOfInvoices =
                invoices.stream()
                        .map(invoice -> invoice.getQuantity().multiply(invoice.getPrice()))
                        .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println(sumOfInvoices);
        System.out.println(sumOfInvoices.setScale(2, RoundingMode.HALF_UP));
    }
}
