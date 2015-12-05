/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author Nitin
 */
public class IceCream extends DessertItem{
    private String name;
    private int cost;
    
    /**
     * 
     * @param name name of icecream
     * @param cost cost of icecream
     */
    public IceCream(String name, int cost)
    {
        this.name = name;
        this.cost = cost;
    }

    /**
     * 
     * @return the information about icecream 
     */
    public String toString()
    {
        String output = "";
        output += this.name;
        
        int widthIceCreamName = DessertShoppe.RECEIPT_WIDTH - this.name.length();
        output += String.format("%" + widthIceCreamName + "s", DessertShoppe.cents2dollarsAndCents(this.getCost()) );
                
        return output;
    }

    /**
     * 
     * @return the cost of the icecream
     */
    @Override
    public int getCost() {
        return this.cost;
    }
    
}
