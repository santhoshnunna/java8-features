package com.practise.data;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Customer {

    private String id;
    private String name;
    private String emailId;

    private List<String> mobileNumbers;

    public Customer(String id, String name, String emailId, List<String> mobileNumbers) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.mobileNumbers = mobileNumbers;
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public void setId(String id) {
        this.id = id;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<String> getEmailId() {
        return Optional.ofNullable(emailId);
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public List<String> getMobileNumbers() {
        return mobileNumbers;
    }

    public void setMobileNumbers(List<String> mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(getId(), customer.getId()) && Objects.equals(getName(), customer.getName()) && Objects.equals(getEmailId(), customer.getEmailId()) && Objects.equals(getMobileNumbers(), customer.getMobileNumbers());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getEmailId(), getMobileNumbers());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                ", mobileNumbers=" + mobileNumbers +
                '}';
    }
}
