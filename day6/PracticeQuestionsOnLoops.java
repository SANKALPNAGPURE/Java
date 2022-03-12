package com.company.day6;

public class PracticeQuestionsOnLoops {
    public void loops() {
        //Question 1
        int n = 4;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.println("*");
            }
            System.out.println("\n");
        }


        //Question 2
        int sum =0;
        int a=4;
        for (int b=0; b<=4; b++) {
            sum = sum + (2 * b);
        }
        System.out.println("The sum og even number is");
            System.out.print(sum);

            //question 3
        int c=5;
        for(int d=1; d<=10; d++) {
            System.out.printf("%d X %d = %d\n", c, d, c*d);

        }

        //question 4
        int e=10;
        for(int g=10; g>=1; g--){
            System.out.printf("%d X %d = %d\n", e, g, e*g);
        }
        //question 5
        int h =5;
        int j=1;
        int factorial= 1;
        while(j<=5){
            System.out.printf("%d",j);
            factorial*=j;
            j++;
        }
        System.out.printf("=%d", factorial);
    }
}


