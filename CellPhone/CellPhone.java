/**
 * The cell phone class represents a cell phone
 */

public class CellPhone
{
    //Fields
    private String manufact;
    private String model;
    private double retailPrice;
    
    //The constructor accepts argument for the phones manufacturer, model number, and retail price.
    public CellPhone(String man, String mod, double price)
    {
        manufact = man;
        model = mod;
        retailPrice = price;
    }
    
    //The setManufact method accepts an argument for the phone's manufacturer name.
    public void setManufact(String man)
    {
        manufact = man;
    }
    
    //The setModelNumber method accepts an argument for the phone's model number.
    public void setMod(String mod)
    {
        model = mod;
    }
    
    //The set RetailPrice method accepts an argument for the phones retail price.
    public void setRetailPrice(double price)
    {
        retailPrice = price;
    }
    
    //the getManufact menthod returns the name of the phone's manufacturer
    public String getManufact()
    {
        return manufact;
    }
    
    //the getModel method returns the phone;s model number.
    public String getModel()
    {
        return model;
    }
    
    //The getRetailPrice method returns the phone's retail price.
    public double getRetailPrice()
    {
        return retailPrice;
    }
}