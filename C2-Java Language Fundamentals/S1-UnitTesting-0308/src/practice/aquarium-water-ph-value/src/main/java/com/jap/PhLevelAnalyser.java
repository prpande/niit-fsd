package com.jap;

import java.util.Scanner;

public class PhLevelAnalyser
{
    public static void main(String[] args) {
        String statusOfAquarium = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter phLevel :");
        int phLevel = scanner.nextInt();
        PhLevelAnalyser phLevelAnalyser = new PhLevelAnalyser();
        String data = phLevelAnalyser.getPhValueOfWater(phLevel);
        System.out.println(data);
    }

    public String getPhValueOfWater(int phLevel){

    String statusOfAquarium="";
        if (phLevel < 7) {
            statusOfAquarium = "pH value is low, partial water change required";
        } else if (phLevel >= 7 && phLevel <= 8) {
            statusOfAquarium = "pH value is fine";
        } else if(phLevel > 8) {
            statusOfAquarium = "pH value is high, partial water change required";
        }
        return statusOfAquarium;

    }
}
