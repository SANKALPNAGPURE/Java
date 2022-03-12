package com.company.day5;

import java.util.Scanner;

public class SwitchInJava {

    public void make() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age11 = sc.nextInt();
        switch (age11) {
            case 18:
                System.out.println("you are going to become an adult");
                break;
            case 23:
                System.out.println("you are going to join a job");
                break;
            case 60:
                System.out.println("you are going to get retired");
                break;
            default:
                System.out.println("enjoy your life");
        }
    }
}
