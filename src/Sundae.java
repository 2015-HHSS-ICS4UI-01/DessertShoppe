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
 * @author Nitin
 */
public class Sundae extends DessertItem{
    
    private String toppingName;
    private int toppingCost;
    private int icCost;
    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
       IceCream ic = new IceCream(icName,icCost);
       this.toppingName = toppingName;
       this.toppingCost = toppingCost;
       this.icCost = ic.getCost();
    }
    

    
    public String toString()
    {
        return "";
    }

    @Override
    public int getCost() {
        return this.icCost +this.toppingCost;
    }
    
}
