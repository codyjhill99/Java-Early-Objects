import java.util.Scanner; //Used for the scanner class

/**
 * This program creates three instances of the REctangle class and passes arguments to the constuctor
 */
public class RoomConstructor
{
    public static void main(String[] args)
    {
        double roomLength, roomWidth, totalArea; //To holdd room length width and the total area
        
        //Declares Rectangle variable to reference objects for the kitchen, bedroom and den.
        Rectangle kitchen, bedroom, den;
        
        //Create the scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //Get and store the kitchens dimensions
        System.out.println("What is the kitchens length? " );
        roomLength = keyboard.nextDouble();
        System.out.println("What is the kitchens Width?");
        roomWidth = keyboard.nextDouble();
        kitchen = new Rectangle(roomLength, roomWidth);
        
        //Get and store the bedroom dimensions
        System.out.println("What is the bedrooms length?");
        roomLength = keyboard.nextDouble();
        System.out.println("What is the bedrooms Width?");
        roomWidth = keyboard.nextDouble();
        bedroom = new Rectangle(roomLength, roomWidth);
        
        //Get and store the dens dimensions
        System.out.println("What is the dens length?");
        roomLength = keyboard.nextDouble();
        System.out.println("What is the dens Width?");
        roomWidth = keyboard.nextDouble();
        den = new Rectangle(roomLength, roomWidth);
        
        //Calculate the total area of the rooms.
        totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea();
        
        //Display the total area of the rooms
        System.out.println("The total area of the rooms is " + totalArea);
    }
}