package org.example;

public class RegionalHead extends Employee
{
    private String regionName;
    private int regionPerformance;
    private int reviewRatings;

    public RegionalHead(String employeeName, String employeeCode, String dob, int age, double salary,
                        String regionName, int regionPerformance, int reviewRatings)
    {
        super(employeeName, employeeCode, dob, age, salary);
        this.regionName = regionName;
        this.regionPerformance = regionPerformance;
        this.reviewRatings = reviewRatings;

    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public int getRegionPerformance() {
        return regionPerformance;
    }

    public void setRegionPerformance(int regionPerformance) {
        this.regionPerformance = regionPerformance;
    }

    public int getReviewRatings() {
        return reviewRatings;
    }

    public void setReviewRatings(int reviewRatings) {
        this.reviewRatings = reviewRatings;
    }

    @Override
    public double calculateIncrement(float hikePercentage) {
        if (regionPerformance >= 7 && reviewRatings >= 8) {
            super.setSalary(super.getSalary() * hikePercentage);
        }
        return super.getSalary();
    }
}
