import java.util.Scanner; // Imports the scanner class
/**
 * finds miles per gallon
 */

public class MilesPerGallon
{
    public static void main(String[] args)
    {
        //sets the variables to be used
        double milesDriven, gallonsUsed, mPG;
        
        //sets up the scanner
        Scanner keyboard = new Scanner(System.in);
        
        //Asks the user for milesDriven and Gallonsused
        System.out.println("Hi! How far have have you drove?");
        milesDriven = keyboard.nextDouble();
        System.out.println("And how many gallons did you use?");
        gallonsUsed = keyboard.nextDouble();
        
        //calculates the mPG
        mPG = milesDriven / gallonsUsed;
        
        System.out.printf("You got :%f miles to the gallon!", mPG);
    }
}