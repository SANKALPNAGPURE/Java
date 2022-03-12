package com.company.day6;

public class BreakAndContinue {
    public void andcontinue() {
        //for loop break
        for (int i = 1; i < 50; i++) {
            System.out.println(i);
            System.out.println("Java is great");
            if (i == 2) {
                System.out.println("ending the loop");
                break;
            }
        }
        System.out.println("loops ends here ");
        //while loop break
        int a = 0;
        while (a < 50) {
            System.out.println(a);
            System.out.println("java is great");
            a++;
            if (a == 5) {
                System.out.println("End that loop");
                break;
            }
        }
        System.out.println("do while loop");
        int b = 1;
        do {
            System.out.println(b);
            System.out.println("dowhileloop");
            if (b == 5) {
                System.out.println(b);
                System.out.println("end do while loop");
                break;
            }
            b++;
        } while (b < 10);
        System.out.println("thanks");


    }
}

