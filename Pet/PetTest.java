import java.util.Scanner; //Needed for user input

public class PetTest
{
    public static void main(String[] args)
    {
        Pet blitz; //to reference a pet object
        
        //creates a scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        blitz = new Pet();
        
        System.out.println("Hi! What is your pets name?");
        blitz.setName(keyboard.nextLine());
        System.out.println("What kind of dog is he/she?");
        blitz.setType(keyboard.nextLine());
        System.out.println("How old is he/she?");
        blitz.setAge(keyboard.nextInt());
        System.out.println(blitz.getName() + " is " + blitz.getAge() + " years old and is a " + blitz.getType());
        
    }
}