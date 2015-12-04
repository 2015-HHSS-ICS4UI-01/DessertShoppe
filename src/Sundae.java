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
 * @author besem4079
 */
public class Sundae extends DessertItem{
    private IceCream iceCream;
    private int costTopping;

    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
        super(toppingName);
        iceCream = new IceCream(icName,icCost);
        this.costTopping = toppingCost;
    }
    

    
    public String toString()
    {
        String output = super.getName() + " Sundae with \n";
        output += iceCream.getName();
        return output;
    }

    @Override
    public int getCost() {
        return costTopping + iceCream.getCost();
    }
    
}
