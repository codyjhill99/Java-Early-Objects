
/**
 * calculates and displays the amount of the stock sold and the commission
 */
public class StockCommission
{
    public static void main(String[] args)
    {
        //1,000 shares at $25.50 2% commission
        double shares = 1000, price = 25.5, commission = .02, total,sharesTotal;
        
        //calculates
        sharesTotal = shares * price;
        commission = sharesTotal * commission;
        total = sharesTotal + commission;
        
        //print answer
        System.out.printf("Stock total: %.2f\nCommission: %.2f\nTotal: %.2f",sharesTotal ,commission , total);
    }
}