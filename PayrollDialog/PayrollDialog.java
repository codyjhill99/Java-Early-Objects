import javax.swing.JOptionPane;

/*
 * This program is practicing with JOption panes
 */

public class PayrollDialog
{
    public static void main(String[] args)
    {
        String inputString; // For reading input
        String name; // the user's name
        int hours; // the number of hours worked
        double payRate; //the users hourly payrate
        double grossPay; //Gross pay
        
        //Get the user's name.
        name = JOptionPane.showInputDialog("What is your name? ");
        
        //Get the hours worked
        inputString = JOptionPane.showInputDialog("How many hours did you work this week?");
        
        //Convert the input to an int.
        hours = Integer.parseInt(inputString);
        
        //Get the hourly payrate
        inputString = JOptionPane.showInputDialog("What is your hourly payrate? ");
        
        //Convert the input to a double
        payRate = Double.parseDouble(inputString);
        
        //Calculate the gross pay
        grossPay = hours * payRate;
        
        //Display the results
        JOptionPane.showMessageDialog(null, "Hello " + name + ". Your gross pay is $" + 
                                    grossPay);
                                    
        //End the program
        System.exit(0);
    }
}