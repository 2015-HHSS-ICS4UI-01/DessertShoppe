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
     String name = super.getName();
       String output = "";
       int widthItem = DessertShoppe.RECEIPT_WIDTH - name.length();
         output += super.getName() + String.format("%" + widthItem + "s", 
                 DessertShoppe.cents2dollarsAndCents(cost)); 
        return output;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
