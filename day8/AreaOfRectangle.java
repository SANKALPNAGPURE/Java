package com.company.day8;

import java.util.Scanner;

public class AreaOfRectangle {
    public static double Area(double l, double b) {
        double a= l*b;
        return a;
    }
    public void Rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("length of rectangle");
        double l = sc.nextDouble();
        System.out.println("breadth of rectangle");
        double b = sc.nextDouble();
        double result = Area(l,b);
        System.out.println("Area of Rectangle is"+result);
    }
}
