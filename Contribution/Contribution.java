//This program determins the amount of money you can Contribute to your retirement account at
//5% 7% 10%
public class Contribution
{
    public static void main(String[] args)
    {
        //Variable to hold the monthly pay and the amount of the contribution
        double monthlyPay = 6000.0;
        double contribution;
        
        //Calculate and display a 5% contribution
        contribution = monthlyPay *0.05;
        System.out.println("5 percent is $" + contribution + " per month.");
        
        //Calculate and display a 8% contribution.
        contribution = monthlyPay * 0.08;
        System.out.println("8 percent is $" + contribution + " per month.");
        
        //Calculate and display a 10% contribution.
        contribution = monthlyPay * 0.10;
        System.out.println("10 percent is $" + contribution + " per month.");
    }
}