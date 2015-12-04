/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author Ali Murra
 */
public class IceCream extends DessertItem{

    private int cost;
    
    /**
     * 
     * @param name of the ice ceram
     * @param cost of the ice cream
     */
    public IceCream(String name, int cost)
    {
        super(name);
        //make the cost equal to the cost of the ice cream
        this.cost = cost;
    }

    /**
     * 
     * @return the name, and cost of the ice cream
     */
    public String toString()
    {   
        //output the name of the ice cream
        String output = super.getName();
        //format to line up the price
        int widthPreCost = DessertShoppe.RECEIPT_WIDTH - output.length();
        output += String.format("%" + widthPreCost + "s%n", DessertShoppe.cents2dollarsAndCents(getCost()));
        //return the whole purchase onto the reciept 
        return output;
    }

    /**
     * 
     * @return the total cost of the ice cream
     */
    @Override
    public int getCost() {
       return cost;
    }
    
}
