import java.util.Scanner; // imports the scanner
/**
 * Computes the tax of a bill
 */
public class RestaurantBill
{
    public static void main(String[] args)
    {
        //tax is 7.5% tip is 18% after tax
        //creates the variables for the program
        double charge,total,tip, tax;
        
        //creates the scanner
        Scanner keyboard = new Scanner(System.in);
        
        //asks the user for charge amount
        System.out.println("What was your charge amount?");
        charge = keyboard.nextDouble();
        
        //does the calulations for the final output
        tax = charge * .075;
        tip = (charge + tax) * .18;
        total = charge + tax + tip;
        System.out.printf("Meal charge : %.2f\nTax: %.2f\nTip: %.2f\nYour total is: %.2f.",charge ,tax ,tip , total);
    }
}