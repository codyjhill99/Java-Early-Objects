

public class EmployeeTest
{
    public static void main(String[] args)
    {
        //to refrence a Employee object
        Employee Susan;
        Employee Mark;
        Employee Joy;
        
        //creates three objects with constructors
        Susan = new Employee("Susan Meyers",27899, "Accounting", "Vice President");
        Mark = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Joy = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        
        //Quick test to make sure everything is working
        Susan.addName("Cody Hill");
        
        //Displays the data
        System.out.println(Susan.getName() + " " + Susan.getID() + " " + Susan.getDepartment() + " " + Susan.getPosition());
        System.out.println(Mark.getName() + " " + Mark.getID() + " " + Mark.getDepartment() + " " + Mark.getPosition());
        System.out.println(Joy.getName() + " " + Joy.getID() + " " + Joy.getDepartment() + " " + Joy.getPosition());
    }
}