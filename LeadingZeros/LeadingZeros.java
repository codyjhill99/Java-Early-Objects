/*
 * This program displays numbers padded with leading zeros
 */

public class LeadingZeros
{
    public static void main(String[] args)
    {
        //declare some double variables
        double number1 = 1.234;
        double number2 = 12.345;
        double number3 = 123.456;
        
        //Displays each variable with leading zeros, in a field of 9 spaces, rounded to 2 decimal spaces
        System.out.printf("%09.2f\n", number1);
        System.out.printf("%09.2f\n", number2);
        System.out.printf("%09.2f\n", number3);
    }
}