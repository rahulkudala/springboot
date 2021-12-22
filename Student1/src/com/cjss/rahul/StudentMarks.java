package com.cjss.rahul;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentMarks {

    private Integer rno;
    private Integer year;
    private Integer subjectNo;
    private Integer marks;

    List<Subjects> subs = new ArrayList<>();

    public Integer getRno() {
        return rno;
    }

    public void setRno(Integer rno) {
        this.rno = rno;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(Integer subjectNo) {
        this.subjectNo = subjectNo;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "rno=" + rno +
                ", year=" + year +
                ", subjectNo=" + subjectNo +
                ", marks=" + marks +
                '}';
    }
}
