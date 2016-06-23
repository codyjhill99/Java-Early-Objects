//This program demonstates Rectangle constructer in action
public class ConstructorDemo
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(5.0, 15.0);
        
        System.out.println("The box's length is " + box.getLength());
        System.out.println("The box's Width is " + box.getWidth());
        System.out.println("The box's area is " + box.getArea());
    }
}