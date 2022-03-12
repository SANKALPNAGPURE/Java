package com.company.day3;

public class CbseBoardPercentage {
    // method start here
    // name of the method is calculate
    public void calculate(int englishMarks, int mathsMarks, int scienceMarks, int sscMarks) {

        double sum = englishMarks + mathsMarks + scienceMarks + sscMarks;
        System.out.println("Total marks is "+sum);
        double percentage = (sum/400)*100;
        System.out.println("Percentage is "+percentage);
    }

}
