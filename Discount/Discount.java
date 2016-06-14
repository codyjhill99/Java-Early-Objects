//This is me trying to write a java program all by myself
public class Discount
{
    public static void main(String[] args)
    {
        //Sets the variable for the total $59 and the discount of 20%
        double total = 59.0;
        double discount = total * 0.2;
        
        //Subtracts the discount from the total and prints it to the console
        total = total - discount;
        System.out.println("The total after discount is $" + total);
    }
}