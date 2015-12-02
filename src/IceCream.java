/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
* @author Dmitry K.
 */
public class IceCream extends DessertItem{

    // the cost of the ice cream
    private int cost;
    
    /**
     * Creates an ice cream object
     * @param name the name of the ice cream
     * @param cost the cost of the ice cream
     */
    public IceCream(String name, int cost)
    {
        // set the name of dessertitem
        super(name);
        this.cost = cost;
    }

     /**
     * Gives the ice cream item formatted as the receipt requires
     * @return the ice cream info formatted
     */
    @Override
    public String toString()
    {
        return super.getName() + String.format("%" + (DessertShoppe.RECEIPT_WIDTH - super.getName().length()) + "s", DessertShoppe.cents2dollarsAndCents(getCost()));
    }

    /**
     * Returns the cost of the ice cream
     * @return the ice cream
     */
    @Override
    public int getCost() {
        return cost;
    }
    
}
