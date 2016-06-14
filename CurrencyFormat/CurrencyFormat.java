/* 
 * Formating a nummber as a currency
 */
public class CurrencyFormat
{
    public static void main(String[] args) 
    {
        double monthlyPay = 500000.0; //monthly pay
        double annualPay = monthlyPay * 12; //calculates the user's yearly pay
        
        //displays the output
        System.out.printf("Your annual pay is $%,.2f\n", annualPay);
    }
}