import java.util.Scanner; //Needed for the Scanner class

/**
 * this program demonstrates how to pass multiple arguments to a method.
 */
public class MultipleArgs
{
    public static void main(String[] args)
    {
        double boxLength, boxWidth; //To hold the box's length and Width
        
        //Create a scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        //Create a rectangle object.
        Rectangle box = new Rectangle();
        
        //Get the boxes length
        System.out.println("What is the box's length?");
        boxLength = keyboard.nextDouble();
        
        //Get the boxes width
        System.out.println("What is the box's Width?");
        boxWidth = keyboard.nextDouble();
        
        //pass length and width to the set method
        box.set(boxWidth, boxLength);
        
        //Display the boxes length width and area
        System.out.println("The boxes length is " + box.getLength());
        System.out.println("The boxes Width is " + box.getWidth());
        System.out.println("The boxes area is " + box.getArea());
        
    }
}