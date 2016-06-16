import java.util.Scanner; //Gets the scanner class
/**
 * Calculates how many cookies a recipiee makes
 */

public class IngredientAdjuster
{
    public static void main(String[] args)
    {
        //1.5 cups of sugar 1 cup of butter 2.75 cups of flour = 48 cookies
        double sugar, butter, flour, sugarPer, butterPer, flourPer;
        short numOfCookies;
        
        //sets up the scanner
        Scanner keyboard = new Scanner(System.in);
        
        //caluculates how how of each ingredient is needed per cookie
        sugarPer = 1.5 / 48;
        butterPer = 1.0 / 48;
        flourPer = 2.75 / 48;
        
        //asks the user for number of cookies he/she wants to make and stores it in a variable
        System.out.println("How many Cookies do you want to make?");
        numOfCookies = keyboard.nextShort();
        
        //Does the math and prints out how much of each ingredient the user needs
        sugar = sugarPer * numOfCookies;
        butter = butterPer * numOfCookies;
        flour = flourPer * numOfCookies;
        System.out.printf("You need %.3f cups of sugar, %.3f cups of butter and %.3f cups for flour to make %d cookies", sugar, butter, flour, numOfCookies);
    }
}