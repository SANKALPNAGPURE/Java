package com.company.day9;

import java.util.Scanner;

public class MultiplicationTable {
    public void multipliction() {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.printf("%d X %d = %d\n",a,i,a*i);
        }
    }
}
