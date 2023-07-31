package session;
/*
 * Grades - Annual Performance Report
 * In a school, the teachers of grades 1- 9 have to prepare the
 * annual performance report of their students.
 * Write a program that helps teachers to give an average of marks
 * from the total marks.
 * 1. Create two functions. One function will calculate the total
 * marks and the other function will calculate the average
 * marks.
 * 2. Call both methods from the main method.
 */
public class AnnualPerfReport 
{
    public int totalMarks(int englishScore, int hindiScore, int mathsScore)
    {
        int total = englishScore + hindiScore + mathsScore;
        System.out.println("Total Marks: " + total);
        return total;
    }

    public void averageMarks(int totalMarks, int count)
    {
        float average = totalMarks / count;
        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args)
    {
        AnnualPerfReport aPerfReport = new AnnualPerfReport();
        int total = aPerfReport.totalMarks(77, 89, 68);
        aPerfReport.averageMarks(total, 3);
    }
}
