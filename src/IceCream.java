/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * Represents Ice cream
 * @author Erman Dinsel
 */
public class IceCream extends DessertItem{
private int cost;

/**
 * 
 * @param name the name of the ice cream
 * @param cost the cost of the ice cream
 */
    public IceCream(String name, int cost)
    {
        //gives name to super class
        super(name);
        this.cost = cost;
    }

  /**
   * 
   * @return the String, to be put onto the receipt
   */
    public String toString()
    {
        String output = super.getName();
        String taxS = DessertShoppe.cents2dollarsAndCents(getCost());
        // format the spacing for the tax amount
        // we subtract the number of letters in the name
        int widthTax = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        output += String.format("%" + widthTax + "s", taxS);
        return output;
    }

    @Override
    /**
     * Returns the cost of ice cream
     */
    public int getCost() {
        return this.cost;
    }
    
}
