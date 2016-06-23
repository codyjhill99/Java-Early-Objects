import java.util.Scanner; // Needed for the scanner class

/**
 * This program creates three instances of the Rectangle class
 */

public class RoomAreas
{
    public static void main(String[] args)
    {
        double number, totalArea; // To hold nmeric input the the total area of all rooms
        
        //Create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //Create thee rectangle objects
        Rectangle kitchen = new Rectangle();
        Rectangle bedroom = new Rectangle();
        Rectangle den = new Rectangle();
        
        //Get and store the dimensions of the kitchen 
        System.out.println("What is the kitchen's length?");
        number = keyboard.nextDouble();
        kitchen.setLength(number);
        System.out.println("What is the kitchen's width?");
        number = keyboard.nextDouble();
        kitchen.setWidth(number);
        
        //Get and store the dimensions of the bedroom
        System.out.println("What is the bedrooms length?");
        number = keyboard.nextDouble();
        bedroom.setLength(number);
        System.out.println("What is the bedrooms Width?");
        number = keyboard.nextDouble();
        bedroom.setWidth(number);
        
        //Get and store the dimensions fo the den
        System.out.println("What is the dens length?");
        number = keyboard.nextDouble();
        den.setLength(number);
        System.out.println("What is the dens Width?");
        number = keyboard.nextDouble();
        den.setWidth(number);
        
        //Calculates the total area of the rooms
        totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea();
        
        //displays the total area of the rooms 
        System.out.println("The total area of the rooms is " + totalArea);
    }
}