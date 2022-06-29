package com.practise.data;

import java.math.BigDecimal;

public class Invoice {

    String invoiceNumber;
    BigDecimal price;
    BigDecimal quantity;

    public Invoice() {
    }

    public Invoice(String invoiceNumber, BigDecimal price, BigDecimal quantity) {
        this.invoiceNumber = invoiceNumber;
        this.price = price;
        this.quantity = quantity;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }


}
