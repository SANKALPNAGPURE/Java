package com.company.day7;

public class ForLoopDisplayingInArray {
    public void forloop() {
        int [] marks = {48,79,54,29,50};
        System.out.println(marks.length);
        System.out.println(marks[3]);
        System.out.println("in decreasing order");
        for(int i=marks.length-1; i>=0; i--) {
            System.out.println(marks[i]);
        }
        System.out.println("in increasing order");
        for(int j=0; j<marks.length; j++){
            System.out.println(marks[j]);
        }

        // for each loop
        System.out.println("for each loop");
        for( int element: marks){
            System.out.println(element);
        }

    }
}
