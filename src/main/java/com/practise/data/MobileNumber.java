package com.practise.data;

import java.util.Objects;

public class MobileNumber {
    private String number;
    private String providerName;
    private String connectionType;

    public MobileNumber() {
    }

    public MobileNumber(String number, String providerName, String connectionType) {
        this.number = number;
        this.providerName = providerName;
        this.connectionType = connectionType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    @Override
    public String toString() {
        return "MobileNumber{" +
                "number='" + number + '\'' +
                ", providerName='" + providerName + '\'' +
                ", connectionType='" + connectionType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MobileNumber that = (MobileNumber) o;
        return Objects.equals(number, that.number) && Objects.equals(providerName, that.providerName) && Objects.equals(connectionType, that.connectionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, providerName, connectionType);
    }
}
