package com.example.Validations_Practice.Models;

public class TrainSpeedAndDistance {

    public static void main(String ars[]){

        String str = "EDINBURGH-250-MANCHESTER-100-BIRINGHAM";


        String c[] = str.split("-");
        int stime = 1400;
        System.out.println("Source City : " + c[0] + "\tTime : " + stime);
        int speed = 100;
        int time = (Integer.parseInt(c[1]))/speed;
        stime = time;
        int min = stime*60;

        for(int i = 2; i < c.length/2; i+=2){

            while(min>60){
                stime = stime + 100;

            }

            System.out.println("Next City : " + c[i] + "\tTime :" + stime);

            time = (Integer.parseInt(c[i-1]))/speed;
            stime = time;
            min = stime*60;

        }

    }
}
