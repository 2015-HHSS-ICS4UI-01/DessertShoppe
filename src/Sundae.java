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
 * @author Ali Murra
 */
public class Sundae extends IceCream{
    
    //declare variables 
    private String toppingName;
    private int toppingCost;
    
    /**
     * 
     * @param icName name of the ice cream
     * @param icCost cost of the ice cream
     * @param toppingName name of the topping
     * @param toppingCost cost of the topping
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
       //send the name of the sundae to IceCream
       super(icName, icCost);
       //make the variables in this class equal to the ones passed in
       this.toppingName = toppingName;
       this.toppingCost = toppingCost;
    }
    
    /**
     * 
     * @return the name and cost of the sundae and topping
     */
    public String toString()
    {
        //output the name of the topping, ice cream and costs
        String output = this.toppingName + " Sundae with " + "\n";
        output += this.getName();
        //format to line up the price
        int widthPreCost = DessertShoppe.RECEIPT_WIDTH - this.getName().length();
        output += String.format("%" + widthPreCost + "s%n", DessertShoppe.cents2dollarsAndCents(getCost()));
        //return the whole purchase onto the reciept 
        return output;
    }
    
    /**
     * 
     * @return the total cost of the sundae
     */
    @Override
    public int getCost() {
        //the total cost is the cost of the ice cream and the topping
        int cost = this.toppingCost + super.getCost();
        return cost;
    }
}
