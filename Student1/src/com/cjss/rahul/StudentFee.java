package com.cjss.rahul;

import java.util.List;

public class StudentFee {

    private Integer rno;
    private double amount;
    private String date;
    private List<StudentFee> sfl;


    public Integer getRno() {
        return rno;
    }

    public void setRno(Integer rno) {
        this.rno = rno;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "StudentFee{" +
                "rno=" + rno +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                '}';
    }


}
