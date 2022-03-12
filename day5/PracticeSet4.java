package com.company.day5;

import java.util.Scanner;

public class PracticeSet4 {

    public void conditionals() {
        //Question 2
        Scanner sc = new Scanner(System.in);
        byte m1, m2, m3;
        System.out.println("Enter your marks in physics");
        m1= sc.nextByte();
        System.out.println("Enter your marks inn chemistry");
        m2= sc.nextByte();
        System.out.println("Enter your marks in math");
        m3= sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your average percentage is:"+ avg);
        if(m1>=33 && m2>=33 && m3>=33 && avg>=40){
            System.out.println("you are passed");
        }
        else{
            System.out.println("you are fail");
        }

        
    }
}
