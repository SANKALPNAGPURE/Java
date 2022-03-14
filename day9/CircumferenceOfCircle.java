package com.company.day9;

import java.util.Scanner;

public class CircumferenceOfCircle {
    public static double Circum(double r) {
        return 2 * 3.14 * r;
    }

    public void circumfernce() {
        System.out.println("Enter a radius");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double result = Circum(r);
        System.out.println("Circumference of circle is " + result);
    }
}
