/**
 * This is a class for making rectangles. Practice
 */
public class Rectangle
{
    private double length;
    private double width;
    
    //the setLength method accepts and argument that is stored in the length field;
    public void setLength(double len)
    {
        length = len;
    }
    
    //the setWidth method accepts an argument that is stored in the width field.
    public void setWidth(double w)
    {
        width = w;
    }
    //the set method takes length and width
    public void set(double w,double len)
    {
        width = w;
        length = len;
    }
    //the getLength method returns the value stored in the length field.
    public double getLength()
    {
        return length;
    }
    
    //the getWidth method returns the vaule stored int he length field.
    public double getWidth()
    {
        return width;
    }
    
    //the getArea method returns the value length * Width.
    public double getArea()
    {
        return length * width;
    }
}