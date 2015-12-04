/**
 * A Sundae is a type of IceCream. 
 * 
 * A Sundae needs the name of the ice cream being used, 
 * the cost of that ice cream, the name of the topping, and 
 * the cost for the topping. 
 * The cost is determined by adding the cost of the ice cream with 
 * the price of the topping.
 * 
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 * 
 * @author thompsont
 */
public class Sundae extends IceCream{
    
    private String name;
    private int cost;

    /**
     * Creates a new Sundae item
     * @param icName name of the ice cream
     * @param icCost cost of the ice cream
     * @param toppingName name of the topping
     * @param toppingCost cost of the topping
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
       super(icName, icCost);
       this.cost = toppingCost;
       this.name = toppingName;
       cost = cost + super.getCost();
    }
    

    /**
     * Returns the information about the sundae and its price
     * @return information about the sundae and price
     */
    public String toString()
    {
         String name = super.getName();
       String output = "";
       int widthItem = DessertShoppe.RECEIPT_WIDTH - name.length();
       output += this.name + " with \n" ;
         output += super.getName() + String.format("%" + widthItem + "s", 
                 DessertShoppe.cents2dollarsAndCents(cost)); 
        return output;
    }
    /**
     * Returns cost of the Sundae
     * @return cost of the Sundae 
     */
     @Override
    public int getCost() {
        return cost;
    }
    
}
