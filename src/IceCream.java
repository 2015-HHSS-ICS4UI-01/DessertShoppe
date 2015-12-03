/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author thompsont
 */
public class IceCream extends DessertItem{

    private int cost;
    
    /**
     * Creates the ice cream
     * @param name the name of the ice cream 
     * @param cost the cost of the ice cream
     */
    public IceCream(String name, int cost)
    {
        super(name);
        this.cost = cost;
    }

  /**
   * Returns the information about the ice cream and its price
   * @return information about the sundae and price
   */
    public String toString()
    {
     String name = super.getName();
       String output = "";
       int widthItem = DessertShoppe.RECEIPT_WIDTH - name.length();
         output += super.getName() + String.format("%" + widthItem + "s", 
                 DessertShoppe.cents2dollarsAndCents(cost)); 
        return output;
    }
    /**
     * Returns cost of the IceCream
     * @return cost of the ice cream
     */
    @Override
    public int getCost() {
        return cost;
    }
}
