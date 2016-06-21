/** 
 * this program demonstrates the rectangle classes methods
 */
public class LengthWidthDemo
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle();
        
        box.setLength(10.0);
        box.setWidth(20.0);
        System.out.println("The boxes Length is " + box.getLength());
        System.out.println("The boxes Length is " + box.getWidth());
    }
}