package com.company.day4;

public class PracticeSet3 {

    public void edit() {
        // problem 1
        String name = "Sankalp Nagpure";
        name = name.toUpperCase();
        System.out.println(name);

        // Problem 2
        String text ="Sanku Gajanan Nagpure";
        text= text.replace(" ","_" );
        System.out.println(text);

        // Prpblem 3
        String letter ="Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>","Sankalp");
        System.out.println(letter);

        //problem 4




                //problem 5
        String myletter ="Dear Harry,\n\tThis Java Course is nice.\n Thanks";
        System.out.println(myletter);


    }
}

