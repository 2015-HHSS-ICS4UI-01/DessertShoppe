/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author besem4079
 */
public class IceCream extends DessertItem{
    private int cost;
    
    /**
     * Constructor for the Ice Cream.
     * @param name the name of the ice cream
     * @param cost the price of the ice cream
     */
    public IceCream(String name, int cost)
    {
        super(name);
        this.cost = cost;
    }

    /**
     * Converts the IceCream object into readable text.
     * @return the name and cost of the ice cream in receipt form.
     */
    public String toString()
    {
        //the width of blank space between the ice cream's name and its total cost
        int widthCost = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        //a string that holds the ice cream's section on the receipt
        String output = super.getName();
        output += String.format("%" + widthCost + "s",
                DessertShoppe.cents2dollarsAndCents(this.getCost()));
        return output;
    }

    /**
     * Returns the total cost of the ice cream.
     * @return the price of the ice cream.
     */
    @Override
    public int getCost() {
        //the total cost of the ice cream
        return Math.round(cost);
    }
    
}
