package com.cjss.rahul;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
     /*   System.out.print("Enter No. of Students: ");
        int n = s.nextInt();*/
        System.out.println();

        List<Student> sl = new ArrayList<>();
        List<StudentFee> sfl = new ArrayList<>();
        List<Subjects> subl = new ArrayList<>();
        List<StudentMarks> sml = new ArrayList<>();

       // List<Student> li = new ArrayList<>();
        for(int i=1;i<=2;i++){
//            System.out.println("Enter Student " + i + " details: ");

            Student st = new Student();
            StudentFee sf = new StudentFee();
            StudentMarks sm = new StudentMarks();
            Subjects sub = new Subjects();
            Student stl = new Student();

//            System.out.print("Enter Name: ");
            st.setName("rahul");
//            System.out.print("Enter Roll No: ");
            st.setRno(11);

//            System.out.print("Enter Branch: ");
            st.setBranch("IT");
//            System.out.print("Enter year: ");
            st.setYear(1);


//            System.out.print("Enter Fee amount ");

//            System.out.print("Enter Fee date ");  s.nextLine();


//            System.out.println("Enter Subject Name: ");
            sub.setSubjectName("DAA");
//            System.out.println("Enter Subject No: ");
            sub.setSubjectNo(121);

//            System.out.println("Enter Marks: ");



            sf.setRno(st.getRno());
            sf.setAmount(4000);
            sf.setDate("20-12-2008");

            sm.setSubjectNo(sub.getSubjectNo());
            sm.setMarks(78);
            sm.setRno(st.getRno());
            sm.setRno(st.getRno());
            sm.setYear(st.getYear());

            subl.add(sub);
            sml.add(sm);
            sfl.add(sf);

            stl.setSml(Arrays.asList(sm));
            stl.setSfl(Arrays.asList(sf));

            sl.add(st);


        }
/*        for(Student stu : sl){
            System.out.println(stu.getRno() + "\t" + stu.getName()+"\t" + stu.getYear() + "\t" + stu.getBranch());
            for(StudentMarks ab : stu.getSml()){
                System.out.println(ab.getMarks());
            }

        }*/

        sl.stream().filter(a -> a.getYear()==1).forEach( student -> {
            System.out.println(student.getRno() +" " + student.getName() + " " + student.getBranch() + " " + student.getYear());

        });
        System.out.println("---------------------------------------------------------------------------");


        sl.stream().forEach( student -> {
            System.out.println(student.getRno() +" " + student.getName() + " " + student.getBranch()  );
            System.out.println();
        });
        System.out.println("---------------------------------------------------------------------------");

        sl.stream().forEach(x -> System.out.println(x));
        System.out.println("---------------------------------------------------------------------------");

        System.out.println(sfl);
        System.out.println("---------------------------------------------------------------------------");
        sfl.stream().forEach( student -> {
            System.out.println(student.getRno() + " " + student.getAmount() + " " + student.getDate());
        });
        System.out.println("---------------------------------------------------------------------------");





        /*System.out.println(sl);
        System.out.println(sl);
        System.out.println("*************************************************");
        System.out.println(sml);
        System.out.println("*************************************************");
        System.out.println(sfl);
        System.out.println("*************************************************");
        System.out.println(subl);

        for(Student o : sl)
        {
            System.out.println(o);
        }*/

        // write your code here
    }
}
