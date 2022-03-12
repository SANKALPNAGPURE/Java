package com.company.day6;

public class ContinueLoop {
    public void andbreak() {
        System.out.println("for loop");
        for (int i = 1; i <= 10; i++) {
            if (i == 2) {
                System.out.println("end the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }
        // do while loop
        int b = 1;
        do {
            b++;
            if (b == 5) {
                System.out.println("This number cant exist");
                continue;
            }
            System.out.println("do while loop number");
            System.out.println(b);
        } while (b<=10) ;
        System.out.println("End that");
    }
}
