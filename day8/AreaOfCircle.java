package com.company.day8;

import java.util.Scanner;

public class AreaOfCircle {
    public static double Area(double r) {
        return 3.14*r*r;
    }

    public void circle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of circle");
        double r= sc.nextDouble();
        double result = Area(r);
        System.out.println(result);
    }
}
