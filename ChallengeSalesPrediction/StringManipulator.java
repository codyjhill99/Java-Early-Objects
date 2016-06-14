import java.util.Scanner; // loads the scanner class
/**
 * Asks the user for their favorite city. prints out the number of charecters in the city name
 * as well as the name in all uppercase letters and lowercase. also the first letter in the name
 */

public class StringManipulator
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner (System.in); //sets up the scanner class
        String name; //Variable to hold the string we are working with
        
        //asks the user for the city name
        System.out.println("What is the name of your favorite city?");
        name = keyboard.nextLine();
        
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(0));
    }
}