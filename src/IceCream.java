/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author Jonah Janakovic
 */
public class IceCream extends DessertItem{
    private int cost;
    
    /**
     * makes the ice cream
     * @param name the name of the ice cream
     * @param cost the cost of the ice cream
     */
    public IceCream(String name, int cost)
    {
        super(name);
        this.cost = cost;
    }
    
    /**
     * gets the cost of the ice cream
     * @return the cost
     */
    @Override
    public int getCost(){
        return cost;
    }
    
    /**
     * gets the output for the receipt
     * @return the output
     */
    public String toString()
    {
        String costOfStuff = DessertShoppe.cents2dollarsAndCents(cost);
        String Output = "";
        Output = super.getName();
        int widthPreTax = DessertShoppe.RECEIPT_WIDTH - Output.length();
        Output += String.format("%" + widthPreTax + "s", costOfStuff);
     return Output;
    }
    
}
