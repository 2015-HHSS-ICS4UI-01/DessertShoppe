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
 * @author Jonah Janakovic
 */
public class Sundae extends IceCream{
    
    private String toppingName;
    private int toppingCost;
    public int cost;

    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
       super(icName,icCost);
       this.toppingName = toppingName;
       this.toppingCost = toppingCost;
    }
    
    public int getCost(){
        cost = 
        return cost;
    }
    
    public String toString()
    {
        return "";
    }
    
}
