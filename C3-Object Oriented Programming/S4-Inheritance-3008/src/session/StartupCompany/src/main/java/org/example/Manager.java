package org.example;

public class Manager extends Employee
{
    private int teamSize;
    private int teamRatings;

    public Manager(String name, String employeeCode, String dateOfBirth, double salary,
                   int teamSize, int teamRatings)
    {
        super(name, employeeCode, dateOfBirth, salary);
        this.teamSize = teamSize;
        this.teamRatings = teamRatings;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getTeamRatings() {
        return teamRatings;
    }

    public void setTeamRatings(int teamRatings) {
        this.teamRatings = teamRatings;
    }

    public double calculateIncrement(float hikePercentage)
    {
        if(teamRatings >= 8)
        {
            super.setSalary(super.getSalary()*(1 + hikePercentage/100.0));
        }

        return super.getSalary();
    }
}
