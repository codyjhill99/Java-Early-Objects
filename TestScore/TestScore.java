//This class is for returning a tests score in A, B C, form.

public class TestScore
{
    private int score;
    
    public TestScore( int sco)
    {
        score = sco;
    }
    
    public void setScore(int scor)
    {
        score = scor;
    }
    
    public int getScore()
    {
        return score;
    }
    
    public char getLetterGrade()
    {
        char grade;
        if (score <= 60)
        {
            grade = 'F';
        }
        else
        {
            if (score <= 70)
            {
                grade = 'D';
            }
            else
            {
                if (score <= 80)
                {
                    grade = 'C';
                }
                else
                {
                    if (score <= 90)
                    {
                        grade = 'B';
                    }
                    else
                    {
                        grade = 'A';
                    }
                    
                }
            }
            
        }
        return grade;
    }
}