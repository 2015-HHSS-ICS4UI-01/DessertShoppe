/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author isles3536
 */
public class IceCream extends DessertItem{
   //What the cost of the IceCream will be as it is changed by the constructor
    private int cost;
        /**
         * Creates the IceCream
         * @param name The name of the IceCream
         * @param cost The price of the IceCream
         */
    public IceCream(String name, int cost)
    {
        super(name);
        this.cost = cost;
    }

  /**
     * The String where the receipt is created with the information that is needed, and the proper amount of space between the name and the price
     * @return Returns the String to be put on the receipt
     */
    public String toString()
    {
        String output = super.getName();
        
        String cost = DessertShoppe.cents2dollarsAndCents(getCost());
        // format the spacing for the tax amount
        // we subtract 3 because of the 3 letters in Tax
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        output += String.format("%" + width + "s", cost);
        return output;
        
    }
    /**
     * The method to get the price to be rounded to the proper amount
     * @return Returns so that it can be output to the receipt
     */
    @Override
    public int getCost() {
        return this.cost;
    }
    
}
