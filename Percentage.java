package com.mycompany.percentage;
import java.util.Scanner;

public class Percentage {


    public static void main(String[] args) {
        float mstudent;
        float fstudent;
        float mpercent;
        float fpercent;
        float total;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number of males: ");
        mstudent = input.nextFloat();
        
        System.out.println("Enter the number of females: ");
        fstudent = input.nextFloat();
        
        total = mstudent+fstudent;
        System.out.println("Number of Students = "+total);
        mpercent = (float)((mstudent/total)*100);
        System.out.println("Male = "+mpercent+"%");
        
        total = mstudent+fstudent;
        fpercent = (float)((fstudent/total)*100);
        System.out.println("Female = "+fpercent+"%");
    }
}
