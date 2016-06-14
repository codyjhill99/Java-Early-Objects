//This is a program i'm going to use to do my tests in
public class Testing
{
    public static void main(String[] args ) 
    {
        String name;
        int age;
        double anualPay;
        
        name = "Cody Hill";
        age = 23;
        anualPay = 75000.00;
        System.out.printf("My name is %s, my age is %d and\n", name, age);
        System.out.printf("I hope to earn $%,.1f, per year\n" , anualPay);
    }
}