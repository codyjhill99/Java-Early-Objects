public class Employee
{
    private String name;
    private int idNumber;
    private String department;
    private String position;
    
    //constructor 
    public Employee(String employeeName, int id, String depart, String posit)
    {
        name = employeeName;
        idNumber = id;
        department = depart;
        position = posit;
    }
    
    public void addName(String na)
    {
        name = na;
    }
    
    public void addID(int num)
    {
        idNumber = num;
    }
    
    public void addDepartment(String dep)
    {
        department = dep;
    }
    
    public void addPosition(String pos)
    {
        position = pos;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getID()
    {
        return idNumber;
    }
    
    public String getDepartment()
    {
        return department;
    }
    
    public String getPosition()
    {
        return position;
    }
}