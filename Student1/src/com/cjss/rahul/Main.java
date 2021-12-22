package com.cjss.rahul;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter No. of Students: ");
        int n = s.nextInt();

        List<Student> sl = new ArrayList<>();
        List<StudentFee> sfl = new ArrayList<>();
        List<Subjects> subl = new ArrayList<>();
        List<StudentMarks> sml = new ArrayList<>();



        for(int i=1;i<=n;i++){
            System.out.println("Enter Student " + i + " details: ");

            Student st = new Student();
            StudentFee sf = new StudentFee();
            StudentMarks sm = new StudentMarks();
            Subjects sub = new Subjects();

            System.out.print("Enter Name: ");       s.nextLine();    st.setName(s.nextLine());
            System.out.print("Enter Roll No: ");     st.setRno(s.nextInt());
            sf.setRno(st.getRno()); sm.setRno(st.getRno());
            System.out.print("Enter Branch: ");     s.nextLine();    st.setBranch(s.nextLine());
            System.out.print("Enter year: ");        st.setYear(s.nextInt());
            sm.setRno(st.getRno()); sm.setYear(st.getYear());


            System.out.print("Enter Fee amount "); sf.setAmount(s.nextInt());
            System.out.print("Enter Fee date ");  s.nextLine();    sf.setDate(s.nextLine());


            System.out.println("Enter Subject Name: "); sub.setSubjectName(s.nextLine());
            System.out.println("Enter Subject No: "); sub.setSubjectNo(s.nextInt());
            sm.setSubjectNo(sub.getSubjectNo());
            System.out.println("Enter Marks: "); sm.setMarks(s.nextInt());

            subl.add(sub);
            sl.add(st);
            sml.add(sm);
            sfl.add(sf);

        }



        for(int i=1;i<=5;i++){


        }

     //   System.out.println(sl);
//        System.out.println(sl);
//        System.out.println("*************************************************");
//        System.out.println(sml);
//        System.out.println("*************************************************");
//        System.out.println(sfl);
//        System.out.println("*************************************************");
//        System.out.println(subl);


        /*for(Student o : sl)
        {
            System.out.println(o);
        }*/

        // write your code here
    }
}
