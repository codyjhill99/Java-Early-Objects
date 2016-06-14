//Just showing interger variables
public class IntegerVariables
{
    public static void main(String[] args)
    {
        int checking; //Declare a int variable
        byte miles;// +-128
        short minutes; // +-32,000
        long days; //over trillion
        
        checking = -20;
        miles = 105;
        minutes = 120;
        days = 189000;
        System.out.println("We have made a journey of " + miles + " miles.");
        System.out.println("It took us " + minutes + " minutes.");
        System.out.println("Our account ballance is " + checking);
        System.out.println("About " + days + " days ago Columbus " + "stood on this spot");
    }
}
