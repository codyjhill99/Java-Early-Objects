/**
 * This program displays a number of floating point numbers with their decimal points aligned
 */

public class Columns
{
    public static void main(String[] args)
    {
        //Declare a bunch of double numbers
        double num1 = 127.899;
        double num2 = 3465.148;
        double num3 = 3.776;
        double num4 = 264.821;
        double num5 = 88.081;
        double num6 = 1799.999;
        
        //Diplays each number with 8 spaces and two decimal places
        System.out.printf("$%8.2f\n",num1);
        System.out.printf("$%8.2f\n",num2);
        System.out.printf("$%8.2f\n",num3);
        System.out.printf("$%8.2f\n",num4);
        System.out.printf("$%8.2f\n",num5);
        System.out.printf("$%8.2f\n",num6);
    }
}