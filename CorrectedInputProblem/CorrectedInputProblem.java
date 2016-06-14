import java.util.Scanner; //Needed for the scanner class

/**
 * This program is using the scanner class
 */

public class CorrectedInputProblem
{
    public static void main(String[] args)
    {
        String name; // To hold a user's name
        int age; // To hold a user's age
        double income; // To hold a user's income
        
        //Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);
        
        //Get the user's age.
        System.out.print("What is your age?");
        age = keyboard.nextInt();
        
        //Get the user's income
        System.out.print("What is your annual income? ");
        income = keyboard.nextDouble();
        
        //Consume the remaining Newline.
        keyboard.nextLine();
        
        //Get the user's name.
        System.out.print("What is your name? ");
        name = keyboard.nextLine();
        
        // Lets display the informatiion back to the user
        System.out.println("Hello " + name + ". Your age is " + age + " and your income is $" + 
                            income);
                            
    }
}