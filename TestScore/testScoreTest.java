import java.util.Scanner; //
//This class tests the TestScore class
public class testScoreTest
{
    public static void main(String[] args)
    {
        int testScore;
        
        //Gets user input
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What did you score on your test?");
        testScore = keyboard.nextInt();
        TestScore test = new TestScore(testScore);
        
        System.out.println(test.getScore());
        System.out.println(test.getLetterGrade());
    }
}