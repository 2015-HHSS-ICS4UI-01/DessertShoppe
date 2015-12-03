/**
 * A Sundae is a type of IceCream. 
 * 
 * A Sundae needs the name of the ice cream being used, 
 * the cost of that ice cream, the name of the topping, and 
 * the cost for the topping. 
 * The cost is determined by adding the cost of the ice cream with 
 * the price of the topping.
 * 
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 * 
 * @author YOURNAMEHERE
 */
public class Sundae extends IceCream{
    
    private String toppingName;
    private int toppingCost;

    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
       super(icName,icCost);
       this.toppingName = toppingName;
       this.toppingCost = toppingCost;
    }   
    
    

    
    @Override
    public String toString()
    {
        String output = "\n";
        output += "Name: " + super.getName() + "\n";
        return "";
    }
    
    public String getToppingName(){
        return this.toppingName;
    }
    
    public int getToppingCost(){
        return this.toppingCost;
    }
 
}
