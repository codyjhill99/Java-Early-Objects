import java.util.Scanner; //Needed for the scanner class

public class GoodStringCompare
{
    public static void main(String[] args)
    {
        String name1, name2, name3;
        
        Scanner keyboard = new Scanner(System.in); // Scanner object to read input
        
        //Get a name
        System.out.print("Enter a name");
        name1 = keyboard.nextLine();
        
        //get a name
        System.out.print("Enter another name");
        name2 = keyboard.nextLine();
        
        //Get the last name
        System.out.print("Enter the last name");
        name3 = keyboard.nextLine();
        
        //Compare name1 and name2
        if (name1.equals(name2))
        {
            System.out.println(name1 + " and " + name2 + " are the same");
        }
        else
        {
            System.out.println(name1 + " and " + name2 + " are NOT the same");
        }
        
        //Compare name1 and name3
        if (name1.equals(name3))
        {
            System.out.println(name1 + " and " + name3 + " are the same");
        }
        else
        {
            System.out.println(name1 + " and " + name3 + " are Not the same!");
        }
    }
}