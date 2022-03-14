package com.company.day8;

import java.util.Scanner;

public class SwappingOfTwoNumbers {

    public void swapping() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a =sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swapping "+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping 4"+a+" "+b);
    }
}
