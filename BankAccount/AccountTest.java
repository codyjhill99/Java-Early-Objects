import java.util.Scanner; //Needed for the scanner class

/**
 * This program test the BankAccount class
 */

public class AccountTest
{
   public static void main(String[] args)
   {
       BankAccount account;   //To reference a BankAccount object
         double balance,      //The accounts starting balance
                interestRate, //The monthly interest rate
                pay,          //the user's pay
                cashNeeded;   //the amount of cash to withdraw
       
       //Create a scanner object for keyboard input.
       Scanner keyboard = new Scanner(System.in);
       
       //Get the starting balance.
       System.out.println("What is your account's starting balance?");
       balance = keyboard.nextDouble();
       
       //Get the monthly interest rate
       System.out.println("What is your monthly interest rate?");
       interestRate = keyboard.nextDouble();
       
       //Create a bankAccount object
       account = new BankAccount(balance, interestRate);
       
       //Get the ammount of pay for the week
       System.out.println("How much were you paid thid month?");
       pay = keyboard.nextDouble();
       
       //Deposit the users pay into the account
       System.out.println("We will deposit your pay into your account");
       account.deposit(pay);
       System.out.println("Current balnce is " + account.getBalance());
       
       //Withdraw some cash from the account
       System.out.println("How much would you like to withdraw?");
       cashNeeded = keyboard.nextDouble();
       account.withdraw(cashNeeded);
       
       //Add the monthly interest to the account
       account.addInterest();
       
       //Display the interest earned and the balance
       System.out.println("This month you have earned $" + account.getInterest() + "in interest.");
       System.out.println("Now your balance is " + account.getBalance());
    }
}