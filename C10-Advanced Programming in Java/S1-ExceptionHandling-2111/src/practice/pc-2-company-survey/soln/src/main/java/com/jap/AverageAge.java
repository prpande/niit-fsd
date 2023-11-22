package com.jap;

public class AverageAge {
    public String averageAgeCalculator(String[] ageRawData) {
        double avg = 0;
        try {
            //Write the logic
            double sum = 0;
            for (int i = 0; i < ageRawData.length; i++) {
                sum += Double.parseDouble(ageRawData[i]);
            }

            avg = sum / ageRawData.length;
            //Handle specific exception
        } catch (NumberFormatException exception) {
            return exception.toString();
        }
        return String.valueOf(avg);
    }
}