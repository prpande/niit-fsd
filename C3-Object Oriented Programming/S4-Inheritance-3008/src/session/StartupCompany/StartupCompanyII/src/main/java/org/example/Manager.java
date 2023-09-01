package org.example;

public class Manager extends Employee
{
    private int teamSize;
    private int teamRatings;

    public int getTeamSize()
    {
        return teamSize;
    }

    public void setTeamSize(int teamSize)
    {
        this.teamSize = teamSize;
    }

    public int getTeamRatings()
    {
        return teamRatings;
    }

    public void setTeamRatings(int teamRatings)
    {
        this.teamRatings = teamRatings;
    }

    @Override
    public void print()
    {
        super.print();
        System.out.printf("Team Size\t\t:\t%d\nTeam Ratings\t:\t%d\n",
                            getTeamSize(), getTeamRatings());
    }
}
