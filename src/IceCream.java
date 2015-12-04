/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author kampn2687
 */
public class IceCream extends DessertItem {
    private int cost;
    
    /**
     * creates a new ice cream
     * @param name name of ice cream
     * @param cost cost
     */
    public IceCream(String name, int cost)
    {
        super(name);
        this.cost = cost;
    }

  /**
     * gets all of the need info for the receipt
     * @return the name and total cost 
     */
    public String toString()
    {
     String output = super.getName(); 
        int widthPrice = DessertShoppe.RECEIPT_WIDTH - super.getName().length() ;
        output +=  String.format("%"+ widthPrice + "s", DessertShoppe.cents2dollarsAndCents(getCost()));
        return output;
    }
    /**
     * gets cost
     * @return cost 
     */
    @Override
    public int getCost() {
        return cost;
    }
    
}
