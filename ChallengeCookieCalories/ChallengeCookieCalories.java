import java.util.Scanner; // Needed for scanning
/**
 * program lets the user know how many calories are in the cookies they ate
 */
public class ChallengeCookieCalories
{
    public static void main(String[] args)
    {
        //bag = 40 cookies. 1 serving = 4 cookies. serving = 300 calories
        //Finds the amount of calories per cookie
        int serving = 300, cookies = 40,cookie,numberOfCookies, calories;
        cookie = serving / 4;
        
        //Creates the scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //asks the user for the number of cookies he ate and then asigns it to numberOfCookies variable
        System.out.println("How many cookies did you eat?");
        numberOfCookies = keyboard.nextInt();
        
        //calculates how many calories consumed
        calories = numberOfCookies * cookie;
        
        //Tells the user the number of calories he/she consumed
        System.out.println("You ate " + calories + " Calories!");
    }
}