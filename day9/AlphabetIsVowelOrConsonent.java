package com.company.day9;

import java.util.Scanner;

public class AlphabetIsVowelOrConsonent {

    public void check() {
        System.out.println("Enter an alphabet");
        Scanner sc= new Scanner(System.in);
        char ch= sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("It is vowel character");
        }
        else{
            System.out.println("It is consonent character");
        }
    }
}
