package com.practise.data;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class EStudent {

    private String rollNo;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;

    public EStudent(String rollNo, String firstName, String lastName, Date dateOfBirth) {
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getYearOfBirth(){
        return this.dateOfBirth.getYear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EStudent eStudent = (EStudent) o;
        return Objects.equals(rollNo, eStudent.rollNo) && Objects.equals(firstName, eStudent.firstName) && Objects.equals(lastName, eStudent.lastName) && Objects.equals(dateOfBirth, eStudent.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, firstName, lastName, dateOfBirth);
    }
}
