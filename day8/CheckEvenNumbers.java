package com.company.day8;
import java.util.Scanner;

public class CheckEvenNumbers {

    public void Even() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + "is an even number");
        } else {
            if (a % 2 != 0) {
                System.out.println(a + "is not an even number");
            } else {
                if (b % 2 == 0) {
                    System.out.println(b + "is an even number");
                } else {
                    System.out.println("b is not an even number");
                }
            }
        }
    }
}



