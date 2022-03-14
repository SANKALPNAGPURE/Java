package com.company.day9;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void NaturalNumbers() {
        System.out.println("Enter a natural number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=0; i<=n; i++){
            sum= sum+i;
        }
        System.out.println("Sum of n natural number is "+sum);

    }
}
