public class TestGrade2
{
    private int score;
    
    //constructor
    
    public TestGrade2(int s)
    {
        score = s;
    }
    
    public void setScore(int s)
    {
        score = s;
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
        else if (score <= 70)
        {
            grade = 'D';
        }
        else if (score <= 80)
        {
            grade = 'C';
        }
        else if (score <= 90)
        {
            grade = 'B';
        }
        else
        {
            grade = 'A';
        }
        return grade;
        
    }
}