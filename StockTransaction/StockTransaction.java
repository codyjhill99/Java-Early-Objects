/**
 * Stock transaction program
 */
public class StockTransaction
{
    public static void main(String[] args)
    {
        //copy paste some code from a previous stock project
        //finds the total from the purchase
        double shares = 1000, price = 32.87, commission = .02, total,sharesTotal;
        //calculates
        sharesTotal = shares * price;
        commission = sharesTotal * commission;
        total = sharesTotal + commission;
        
        //finds the totals for the sale
        double priceSale = 33.92, commissionSale = .02, totalSale,sharesTotalSale;
        //calculates
        sharesTotalSale = shares * priceSale;
        commissionSale = sharesTotalSale * commissionSale;
        totalSale = sharesTotalSale + commissionSale;
        
        //finds the profit from both transactions
        double profit;
        profit = totalSale - total;
        
        //outputs
        System.out.printf("Amount paid for stock:%.2f\nCommision paid:%.2f\nAmount sold for:%.2f\nCommision of sale:%.2f\nTotal Profit:%.2f", sharesTotal, commission, sharesTotalSale,commissionSale, profit);
        
    }
}