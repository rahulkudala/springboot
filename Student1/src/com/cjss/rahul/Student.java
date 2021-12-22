package com.cjss.rahul;

import java.util.List;

public class Student {

    private Integer rno;
    private String name;
    private String branch;
    private Integer year;
    private List<StudentMarks> sml;

    public Integer getRno() {
        return rno;
    }

    public void setRno(Integer rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public List<StudentMarks> getSml() {
        return sml;
    }

    public void setSml(List<StudentMarks> sml) {
        this.sml = sml;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rno=" + rno +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", year=" + year +
                '}';
    }
}
