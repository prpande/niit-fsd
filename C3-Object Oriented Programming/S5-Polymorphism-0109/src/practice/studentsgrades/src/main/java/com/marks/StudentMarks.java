package com.marks;

public class StudentMarks
{
    public int calculateMarks(int math, int physics, int chemistry, int biology)
    {
        return math + physics + chemistry + biology;
    }

    public int calculateMarks(int math, int physics, int chemistry)
    {
        return math + physics + chemistry;
    }

    // Cannot have 3 int parameters for business studies, finance, and accounting marks
    // class already has int, int, int definition of function calculateMarks
    public int calculateMarks(int finance, int accounting)
    {
        return finance + accounting;
    }
}
