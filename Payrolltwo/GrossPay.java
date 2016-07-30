import java.util.Scanner; //Needed for keyboard input

public class GrossPay
{
    public static void main(String[] args)
    {
        double hours, rate;
        
        //Create a scanner object to read input
        Scanner keyboard = new Scanner(System.in);
        
        //Create a payrollTwo object
        PayrollTwo employee = new PayrollTwo();
        
        //Get the number of hours worked
        System.out.println("How many hours did the employee work?");
        hours = keyboard.nextDouble();
        
        //Get the payrate
        System.out.print("What is the employee's hourly payrate?");
        rate = keyboard.nextDouble();
        
        employee.setHoursWorked(hours);
        employee.setPayRate(rate);
        
        System.out.println("The employee;s gross pay is $ " + employee.getGrossPay());
    }
}
