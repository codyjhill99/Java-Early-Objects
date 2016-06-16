import java.util.Scanner; //imports the scanner class
/**
 * plays a word game with the user
 */
public class WordGame
{
    public static void main(String[] args)
    {
        String name, age, city , college, profession, animal, pet; // declares the variables needed
        
        //sets up the scanner
        Scanner keyboard = new Scanner(System.in);
        
        //Asks the user for inputs and stores it in corresponding variable 
        System.out.println("Let's play a game!");
        System.out.println("What is your name?");
        name = keyboard.nextLine();
        System.out.println("How old are you?");
        age = keyboard.nextLine();
        System.out.println("Where do you live?");
        city = keyboard.nextLine();
        System.out.println("What college did you go to? Or would go if you could?");
        college = keyboard.nextLine();
        System.out.println("What do you want to be when you grow up?");
        profession = keyboard.nextLine();
        System.out.println("What kind of animal do you like?");
        animal = keyboard.nextLine();
        System.out.println("What is a cool pet name?");
        pet = keyboard.nextLine();
        
        //outputs the Game!
        System.out.printf("There once was a person named %s who lived in %s. At the age of %s,%s went\nto college at %s. %s graduated and went to work as a %s. Then, %s adopted a\n%s named %s. They both lived happily ever after!", name , city, age, name, college, name, profession ,name, animal, pet);
        
    }
}