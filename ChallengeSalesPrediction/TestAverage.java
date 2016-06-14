import java.util.Scanner; //imports the scanner class
/**
 * Finds the average of 3 test scores
 */

public class TestAverage
{
    public static void main(String[] args)
    {
        //sets the variables for three test scores and also the average
        double test1, test2, test3, average;
        
        //Sets up the scanner class
        Scanner keyboard = new Scanner(System.in);
        
        //Asks and gets the users three test scores
        System.out.println("Please enter your three test scores");
        test1 = keyboard.nextDouble();
        test2 = keyboard.nextDouble();
        test3 = keyboard.nextDouble();
        
        average = (test1 + test2 + test3) / 3;
        System.out.println("Your average test score is " + average);
    }
}