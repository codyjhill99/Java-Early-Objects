/**
 * Bank account class. This class simulates a bank account
 */

public class BankAccount
{
    private double balance; //Account balance
    private double interestRate; // Interest rate
    private double interest; // Interest Earned
    
    /**
     * The constructor initalizes the balance and interestRate fields with 
     * the values passed to startBalance and intRate. 
     * The interest field is ssigned 0.0.
     */
    public BankAccount(double startBalance, double intRate)
    {
        balance = startBalance;
        interestRate = intRate;
        interest = 0.0;
    }
    
    //The deposit method adds the parameter amount to the balance field.
    public void deposit(double amount)
    {
        balance += amount;
    }
    
    //The withdraw method subtracts the parameter amount form the balance field.
    public void withdraw(double amount)
    {
        balance -= amount;
    }
    
    //The addInterest methoda dds the interest for the month to the balance field.
    public void addInterest()
    {
        interest = balance * interestRate;
        balance += interest;
    }
    
    //The getBalnce method returns the value in the balance field
    public double getBalance()
    {
        return balance;
    }
    
    //The get intererest method returns the value in the interest field
    public double getInterest()
    {
        return interest;
    }
}