package org.example;

public class RegionHead extends Employee
{
    private String regionName;
    private int regionPerformance;
    private int reviewRatings;

    public RegionHead(String name, String employeeCode, String dateOfBirth, double salary,
                      String regionName, int regionPerformance, int reviewRatings)
    {
        super(name, employeeCode, dateOfBirth, salary);
        this.regionName = regionName;
        this.regionPerformance = regionPerformance;
        this.reviewRatings = reviewRatings;
    }

    public String getRegionName()
    {
        return regionName;
    }

    public void setRegionName(String regionName)
    {
        this.regionName = regionName;
    }

    public int getRegionPerformance()
    {
        return regionPerformance;
    }

    public void setRegionPerformance(int regionPerformance)
    {
        this.regionPerformance = regionPerformance;
    }

    public int getReviewRatings()
    {
        return reviewRatings;
    }

    public void setReviewRatings(int reviewRatings)
    {
        this.reviewRatings = reviewRatings;
    }

    public double calculateIncrement(float hikePercentage)
    {
        if(regionPerformance >= 8 && reviewRatings >=7)
        {
            super.setSalary(super.getSalary()*(1 + hikePercentage/100.0));
        }

        return super.getSalary();
    }
}
