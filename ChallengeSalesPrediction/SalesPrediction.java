/**
 * simple sales prediction
 */
public class SalesPrediction
{
    public static void main(String[] args)
    {
        double total, sales = 8300000, percentage = .65;
        total = sales * percentage;
        System.out.printf("%,.1f\n",total);
    }
}