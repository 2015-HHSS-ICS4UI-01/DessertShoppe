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
* @author Dmitry K.
 */
public class Sundae extends IceCream{
    
    // the name of the topping
    private String toppingName;
    
    /**
     * Creates a new Sundae object
     * @param icName name of the ice cream being used
     * @param icCost cost of the ice cream
     * @param toppingName name of the topping
     * @param toppingCost cost of the topping
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
        // Sets the name and the cost of IceCream --> so the cost is taken care of there
        super(icName, icCost + toppingCost);
        this.toppingName = toppingName;
    }
    
    /**
     * Gives the sundae item formatted as the receipt requires
     * @return the sundae info formatted
     */
    @Override
    public String toString()
    {
        return toppingName + " Sundae with\n" + super.getName() + String.format("%" + (DessertShoppe.RECEIPT_WIDTH - super.getName().length()) + "s", DessertShoppe.cents2dollarsAndCents(getCost()));
    }
    
}
