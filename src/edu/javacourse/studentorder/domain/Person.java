package edu.javacourse.studentorder.domain;

import java.time.LocalDate;

public abstract class Person
{
    protected String surName;
    protected String givenName;
    private String patronymic;
    private LocalDate dateOfBirtch;
    private Address address;

    public Person() {
        System.out.println("Person is created");
    }
    public String getPersonString() {
        // метод который возвращает строку и фи и номером паспорта
        return surName + " " + givenName;
    }
    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirtch() {
        return dateOfBirtch;
    }

    public void setDateOfBirtch(LocalDate dateOfBirtch) {
        this.dateOfBirtch = dateOfBirtch;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
