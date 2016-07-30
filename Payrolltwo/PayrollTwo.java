/**
 * this class holds values for hours worked nd the hourly pay rate. 
 * It calculates the grosspay and adds additional pay for overtime.
 * 
 */

public class PayrollTwo
{
    private double hoursWorked; 
    private double payRate;
    
    //This constructor initalizes the hoursWorked and payRate fields to 0.0
    
    public PayrollTwo()
    {
        hoursWorked = 0.0;
        payRate = 0.0;
    }
    
    public void setHoursWorked(double hours)
    {
        hoursWorked = hours;
    }
    
    public void setPayRate(double rate)
    {
        payRate = rate;
    }
    
    public double getHoursWorked()
    {
        return hoursWorked;
    }
    
    public double getPayRate()
    {
        return payRate;
    }
    
    public double getGrossPay()
    {
        double grossPay, overtimePay;
        
        if(hoursWorked > 40)
        {
            grossPay = 40 * payRate;
            overtimePay = (hoursWorked - 40) * (payRate * 1.5);
            grossPay += overtimePay;
        }
        else 
        {
            grossPay = payRate * hoursWorked;
        }
        return grossPay;
    }
    
}