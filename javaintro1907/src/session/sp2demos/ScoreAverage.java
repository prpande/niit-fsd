package session.sp2demos;

// Program to take scores in English, Maths, Science and calculate sum and average score.
public class ScoreAverage 
{
    public static void main(String[] args)
    {
        int englishScore = 71;
        int mathsScore = 85;
        int scienceScore = 84;

        int scoreSum = englishScore + mathsScore + scienceScore;
        float averageScore = scoreSum / 3.0f;

        System.out.println("Subject scores English: " + englishScore + " Maths: " + mathsScore + " Science: " + scienceScore);
        System.out.println("Score sum: " + scoreSum);
        System.out.println("Score average: " + averageScore);
    }
}
