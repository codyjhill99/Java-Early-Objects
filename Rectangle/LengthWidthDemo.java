/** 
 * this program demonstrates the rectangle classes methods
 */
public class LengthWidthDemo
{
    public static void main(String[] args)
    {
        //Create a rectangle object.
        Rectangle box = new Rectangle();
        
        //Set the length and width
        box.setLength(10.0);
        box.setWidth(20.0);
        
        //Displays the length width and area
        System.out.println("The boxes Length is " + box.getLength());
        System.out.println("The boxes Length is " + box.getWidth());
        System.out.println("The boxes Length is " + box.getArea());
        
    }
}