/**
 * Finds the nummber of customers who use a energy drink
 */
public class EnergyDrinkConsumption
{
    public static void main(String[] args)
    {
        //15,000 surveryed 18% per week 58% prefer citrus
        double customersDrink, customersCitrus;
        customersDrink = 15000 * .18;
        customersCitrus = customersDrink * .58;
        System.out.println(customersDrink + " " + customersCitrus);
    }
}