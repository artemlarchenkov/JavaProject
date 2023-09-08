package edu.javacourse.studentorder.domain;

import edu.javacourse.studentorder.domain.other.Adult;

public class StudentOrder
{
    private long studentOrderId;
    private Adult husband;
    private Adult wife;
    private Child child;

    public long getStudentOrderId() {
        return studentOrderId;
    }

    public void setStudentOrderId(long studentOrderId) {
        this.studentOrderId = studentOrderId;
    }

    public Adult getHusband() {
        return husband;
    }

    public void setHusband(Adult husband) {
        this.husband = husband;
    }

    public Adult getWide() {
        return wife;
    }

    public void setWide(Adult wide) {
        this.wife = wide;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
