package com.company.day9;

import java.util.Scanner;

public class SumOfOddNumbers {

    public void oddNumbers() {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        for (int i=1; i<=n; i++) {
            if (i % 2 != 0) {

                sum = sum + i;
            }
        }
        System.out.println("Sum pf all "+n+" odd numbers is "+sum);
    }
}
