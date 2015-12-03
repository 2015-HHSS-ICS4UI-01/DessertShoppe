/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author Vonhn0812
 */
public class IceCream extends DessertItem {
    private int cost;
    public IceCream(String name, int cost)
    {
       super(name);
       this.cost = cost;
    }

  
    public String toString()
    {
     int width = DessertShoppe.RECEIPT_WIDTH;
       width-= super.getName().length();
       width-= DessertShoppe.cents2dollarsAndCents(this.getCost()).length();
       String n = super.getName();
        for (int i = 0; i < width; i++) {
            n+=" ";
        }
       n+=DessertShoppe.cents2dollarsAndCents(this.getCost());
       return n;
    }

    @Override
    public int getCost() {
        return cost;
    }
    
    
    
}
