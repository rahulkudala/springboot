package com.cjss.rahul;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student s1 = new Student();
      //  System.out.print("Enter No. of Students: ");


        Student st = new Student();
        int n = s.nextInt();
        for (int i=1;i<=n;i++) {
            st.setRno(100);
        }
        s1.setName(s.nextLine());

	// write your code here
    }
}
