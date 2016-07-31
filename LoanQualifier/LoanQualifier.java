import java.util.Scanner; //Used for geting input

public class LoanQualifier
{
    public static void main(String[] args)
    {
        double salary;
        double yearsOnJob;
        
        //Create the scanner object to get input
        Scanner keyboard = new Scanner(System.in);
        
        //Get the usuers salary
        System.out.println("What is your anual salary?");
        salary = keyboard.nextDouble();
        
        //Get the number of years worked at current company
        System.out.println("How many years have you worked your current job?");
        yearsOnJob = keyboard.nextDouble();
        
        //Determines if the user qualifies for the loan
        if (salary >= 50000)
        {
            if (yearsOnJob >=2)
            {
                System.out.println("You qualify for the loan");
            }
            else 
            {
                System.out.println("You must have worked your current job for at least two years");
            }
        }
        else
        {
            System.out.println("You must earn more then 50000 a year to qualify");
        }
    }
}