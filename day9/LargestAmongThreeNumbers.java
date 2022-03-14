package com.company.day9;
import java.util.Scanner;
public class LargestAmongThreeNumbers {
    public void largest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int large;
        if(a>b && a>c){
            large = a;
        }
        else if(b>a && b>c){
            large =b;
        }
        else{
            large = c;
        }
        System.out.println("Largest number is "+large);

    }
}