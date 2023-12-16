package edu.javacourse.studentorder.domain.other;

import edu.javacourse.studentorder.domain.Person;

import java.time.LocalDate;

public class Adult extends Person
{
    private String passportSeria;
    private String passportNumber;
    private LocalDate issueDate;
    private String isueDepartment;
    private String university;
    private String studentId;

    public Adult() {
        System.out.println("Adult is created");
    }

    public String getPersonString() {
        // метод который возвращает строку и фи и номером паспорта
        return givenName + " " + surName + ":" + passportNumber;
    }

    public String getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getPssportSeria() {
        return passportSeria;
    }

    public void setPssportSeria(String pssportSeria) {
        this.passportSeria = pssportSeria;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber)
    {
        this.passportNumber = passportNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getIsueDepartment() {
        return isueDepartment;
    }

    public void setIsueDepartment(String isueDepartment) {
        this.isueDepartment = isueDepartment;
    }
}
