import java.util.Scanner; //Imports the scanner class
/**
 * computes state and county tax
 */

public class SalesTax
{
    public static void main(String[] args)
    {
        double salePrice, stateSalesTax = 0.055, countySalesTax = 0.02,total, totalSalesTax;
        
        //Create a scanner object to read input
        Scanner keyboard = new Scanner(System.in);
        
        //Will ask the user for the amount of the sale
        System.out.print("What is the sale amount?");
        salePrice = keyboard.nextDouble();
        
        //calculates the state and county sales tax and also the total sales tax and total
        stateSalesTax = salePrice * stateSalesTax;
        countySalesTax = salePrice * countySalesTax;
        total = salePrice + stateSalesTax + countySalesTax;
        totalSalesTax = stateSalesTax + countySalesTax;
        
        //outprints the amount of the purchase, statesalestax, countySalesTax, total sales tax
        //and the total sale
        System.out.printf("The purchase amount is:%.2f \nStateSalesTax:%.2f\nCountrySalesTax:%.2f\nTotalSalesTax:%.2f\nTotal:%.2f", salePrice, stateSalesTax, countySalesTax, totalSalesTax, total);
                        
        
    }
}