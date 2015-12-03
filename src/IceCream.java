/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author donet6376
 */
public class IceCream extends DessertItem{
    
    private int cost;
    
    public IceCream(String name, int cost)
    {
        super(name);
        this.cost = cost;
    }

  
    public String toString()
    {
     String amount = DessertShoppe.cents2dollarsAndCents(cost);
        // format the spacing for the tax amount
        // we subtract 3 because of the 3 letters in Tax
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
       
        return super.getName() + String.format("%" + width + "s", amount);
    }

    @Override
    public int getCost() {
        return cost;
    }
    
}
