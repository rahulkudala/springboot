package com.cjss.rahul;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String args[]){

        Student st = new Student();
        StudentFee sf = new StudentFee();
        Subjects sub = new Subjects();
        StudentMarks sm = new StudentMarks();

        st.setName("Rahul");
        st.setRno(11);
        st.setYear(1);
        st.setBranch("cse");

        sf.setRno(st.getRno());
        sf.setAmount(5500);
        sf.setDate("15-06-2016");

        sub.setSubjectName("DAA");
        sub.setSubjectNo(126);

        sm.setRno(st.getRno());
        sm.setSubjectNo(sub.getSubjectNo());
        sm.setYear(st.getYear());
        sm.setMarks(72);

        List<Student> stl = new ArrayList<>();
        stl.add(st);
        System.out.println(stl);


     }
}
