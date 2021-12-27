package com.cjss.rahul;

import java.util.List;

public class Subjects {

    private Integer subjectNo;
    private String subjectName;
    private List<StudentMarks> sml;

    public List<StudentMarks> getSml() {
        return sml;
    }

    public void setSml(List<StudentMarks> sml) {
        this.sml = sml;
    }

    public Integer getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(Integer subjectNo) {
        this.subjectNo = subjectNo;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "subjectNo=" + subjectNo +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}
