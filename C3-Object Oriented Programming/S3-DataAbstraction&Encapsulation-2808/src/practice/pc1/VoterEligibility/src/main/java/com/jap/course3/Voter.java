package com.jap.course3;

public class Voter
{
    private String name;
    private int age;
    final static int VOTER_ELIGIBLE_AGE = 18;

    public Voter()
    {
        name = "";
        age = -1;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getAgeCriteria()
    {
        String returnStr = "";
        if(getAge() >= VOTER_ELIGIBLE_AGE)
        {
            returnStr = getName() + " Is Eligible to Vote ";
        }
        else if(getAge() > 0)
        {
            returnStr = getName() + " Is Not Eligible to Vote ";
        }
        else
        {
            returnStr = "Age Can't Be Negative or Zero ";
        }

        return returnStr;
    }
}
