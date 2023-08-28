package com.jap.course3;

public class VoterImpl
{
    public static void main(String[] args)
    {
        Voter voter1 = new Voter();
        voter1.setName("John");
        voter1.setAge(10);
        String output = voter1.getAgeCriteria();
        System.out.println(output);
    }
}
