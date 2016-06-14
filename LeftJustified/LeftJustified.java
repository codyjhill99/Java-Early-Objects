//This program displays left justified numbers

public class LeftJustified
{
    public static void main(String[] args)
    {
        //declare a bunch of int variables
        int num1 = 123;
        int num2 = 12;
        int num3 = 45678;
        int num4 = 456;
        int num5 = 1234567;
        int num6 = 1234;
        
        // Displays each number left justified
        System.out.printf("%-8d%-8d\n", num1,num2);
        System.out.printf("%-8d%-8d\n", num3,num4);
        System.out.printf("%-8d%-8d\n", num5,num6);
    }
}