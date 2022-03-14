package com.company.day9;
import java.util.Scanner;
public class Positive0rNegativeNumber {
    public void positiveOrNegative() {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>0){
            System.out.println(a+" is positive number");
        }
        else{
            System.out.println(a+ " is negative number");
        }
    }
}
