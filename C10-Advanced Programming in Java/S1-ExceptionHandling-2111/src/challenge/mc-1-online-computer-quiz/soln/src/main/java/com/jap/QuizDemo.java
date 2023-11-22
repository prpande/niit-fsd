package com.jap;

public class QuizDemo {

    //return the school name which has got the highest score in quiz
    //Handle the NumberFormatException
    public String highestScore(String[] nameOfSchool, String[] scores) {

        try {
            String schoolName = "";
            int maxScore = -1;
            for (int i = 0; i < scores.length; i++) {
                int score = Integer.parseInt(scores[i]);
                if (maxScore < score) {
                    maxScore = score;
                    schoolName = nameOfSchool[i];
                }
            }

            return schoolName;
        }
        catch (NullPointerException ex) {
            return ex.toString();
        }
        catch (NumberFormatException ex) {
            return ex.toString();
        }
    }
    //convert all the names in uppercase
    //Handle the NullPointerException
}






