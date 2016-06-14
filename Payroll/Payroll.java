import java.util.Scanner; // Needed for the scanner class

/**
 * This program demonstarates how to use the scanner class
 */

public class Payroll
{
    public static void main(String[] args)
    {
        String name; // to hold your name
        int hours;  //to hold the hours worked
        double payRate; // how much paid per hour
        double grossPay; // Gross pay
        
        //Creatinga scanner object to read keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //Get the user's name
        System.out.println("What is your name? ");
        name = keyboard.nextLine();
        
        //Get the nummber of hours worked this week
        System.out.println("How many hours did you work this week? ");
        hours = keyboard.nextInt();
        
        //Get the user's hourly pay rate.
        System.out.println("What is your hourly payrate? ");
        payRate = keyboard.nextDouble();
        
        //Calculate the gross pay
        grossPay = hours * payRate;
        
        //Display the resulting information
        System.out.println("Hello " + name);
        System.out.println("Your gross pay is $" + grossPay);
        
    }
}