import javax.swing.JOptionPane; //Gets the joptions pane class for the program
/**
 * This program demonstrates using dialogs with j0ptions
 */
public class NamesDialog
{
    public static void main(String[] args)
    {
        String firstName; //The user's first name
        String middleName; // The user's middle name
        String lastName; // The user's last name;
        
        //Get the users first name
        firstName = JOptionPane.showInputDialog("What is your first name? ");
        
        //Get the users middle name
        middleName = JOptionPane.showInputDialog("What is your middle name? ");
        
        //Get the user's last name
        lastName = JOptionPane.showInputDialog("What is your last name? ");
        
        //Display a greeting
        JOptionPane.showMessageDialog(null, "Hello " + firstName + " " + middleName + " " + 
                                      lastName);
                                      
        System.exit(0);
    }
}
