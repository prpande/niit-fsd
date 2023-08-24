package session;
/*
 * Write a program to create a class student with following attributes
 * rollno,name,eng,math,sci,total,grade
 * create method set with all parameters to initialize instance variables but not total variable and grade.
 * create method calcTotal to do total of all subjects and assign value in total variable.
 * create method to assignGrade() to initialize grade as
 * if avg>=90 A
 * >=70 and <90 B
 * >=50 and <70 C
 * else	     D
 * 
 * create method show to show all details of student.
 */
public class Student 
{
    int rollNo;
    String name;
    int eng;
    int math;
    int sci;
    int total;
    char grade;

    public void set(int rollNumber, string studentName, int englishScore, int mathScore, int scienceScore)
    {
        rollNo = rollNumber;
        name = studentName;
        eng = englishScore;
        math = mathScore;
        sci = scienceScore;
    }

    public void calcTotal()
    {
        total = eng + math + sci;
    }

    public void assignGrade()
    {
        int avg = total / 3;
        if(avg >= 90)
        {
            grade = 'A';
        }
        else if(avg >= 70)
        {
            grade = 'B';
        }
        else if(avg >= 50)
        {
            grade = 'C';
        }
        else
        {
            grade = 'D';
        }
    }

    public void displayData()
    {
        System.out.format("RollNo: %s\tName: %s\tEng: %d\t Sci: %d\t Maths: %d\tTotal: %d\tGrade: %s\n",
                            rollNo, name, eng, sci, math, total, grade);
    }
}
