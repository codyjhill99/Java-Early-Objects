//This progaram demostrates the double data type
public class Sale {
    public static void main(String[] args)
    {
        double price, tax, total;
        
        price = 29.75;
        tax = 1.76;
        total = 31.51;
        System.out.println("The price of the item " +
                                "is " + price);
        System.out.println("The tax is " + tax);
        System.out.println("The total is " + total);
        //Me testing out how to add nummbers in java
        total = price + tax;
        System.out.println("Theys should be the same?" + total);
    }
}