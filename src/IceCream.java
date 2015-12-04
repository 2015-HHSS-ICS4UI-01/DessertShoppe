/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author YOURNAMEHERE
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
        String costS = DessertShoppe.cents2dollarsAndCents(cost);
        String output = super.getName();
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        output += String.format("%" + width + "s", costS);
        return output;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
