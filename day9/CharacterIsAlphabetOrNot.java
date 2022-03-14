package com.company.day9;

import java.util.Scanner;

public class CharacterIsAlphabetOrNot {
    public void Alphbet() {
        System.out.println("Enter a character");
        Scanner sc = new Scanner(System.in);
        char ch= sc.next().charAt(0);
       if(ch>='a'&& ch<='z'|| ch>='A'&& ch<='Z'){
           System.out.println("It is alphabet character");
       }
       else{
           System.out.println("It is not alphabet character");
       }

    }
}
