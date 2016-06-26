import java.util.Scanner; //Needed for the scanner object
/**
 * This program runs a simple test of the Cellphone class
 */

public class CellPhoneTest
{
    public static void main(String[] args)
    {
        String testMan;    //to hold a manufacturer
        String testMod;    //to hold a model number
        double testPrice;  //to hold a price
        
        //Create a scanner object 
        Scanner keyboard = new Scanner(System.in);
        
        //Get the manufacturer name.
        System.out.println("Enter the manufacturer: ");
        testMan = keyboard.nextLine();
        
        //Get the model number.
        System.out.println("Enter the Model number: ");
        testMod = keyboard.nextLine();
        
        ///Get the retail price
        System.out.println("Enter the retail price: ");
        testPrice = keyboard.nextDouble();
        
        //Create a instance of the cellphone class
        CellPhone phone = new CellPhone(testMan, testMod, testPrice);
        
        //Get the data form the phone and display it
        System.out.println();
        System.out.println("Here is the data that you provided:");
        System.out.println("Manufacturer: " + phone.getManufact());
        System.out.println("Model number: " + phone.getModel());
        System.out.println("Retail price: " + phone.getRetailPrice());
    }
}