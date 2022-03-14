package com.company.day9;

import java.util.Scanner;

public class NumberIsEvenOrOdd {
    public static void EvenOrOdd() {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        if(a%2==0){
            System.out.println(a+" is an even number");
        }
        else{
            System.out.println(a+" is an odd number");

        }
    }
}
