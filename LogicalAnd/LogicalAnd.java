import java.util.Scanner; //Needed for the scanner class

public class LogicalAnd
{
    public static void main(String[] args)
    {
        double salary;
        double yearsOnJob;
        
        Scanner keyboard = new Scanner(System.in);
        
        //Get the user's annual salary.
        System.out.print("What is your annual salary?");
        salary = keyboard.nextDouble();
        
        //Get the user's number of years at current job
        System.out.print("How many years have you worked at your current job?");
        yearsOnJob = keyboard.nextDouble();
        
        //Determine if the user qualifies for the loan
        if (salary >= 50000 && yearsOnJob >= 2)
        {
            System.out.println("You qualify for the loan!");
        }
        else 
        {
            System.out.println("You don't qualify!");
        }
    }
}