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
 * @author besem4079
 */
public class Sundae extends DessertItem{
    private IceCream iceCream;
    private int costTopping;

    /**
     * Constructor for the Sundae.
     * @param icName the name of the sundae's ice cream.
     * @param icCost the cost of the sundae's ice cream.
     * @param toppingName the name of the sundae's topping.
     * @param toppingCost the cost of the sundae's topping.
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
        super(toppingName);
        iceCream = new IceCream(icName,icCost);
        this.costTopping = toppingCost;
    }
    

    /**
     * Converts the Sundae object into readable text.
     * @return the name and cost of the ice cream in receipt form.
     */
    public String toString()
    {
        //the width of blank space between the sundae's name and its total cost
        int widthCost = DessertShoppe.RECEIPT_WIDTH - iceCream.getName().length();
        //a string that holds the sundae's section on the receipt
        String output = super.getName() + " Sundae with \n";
        output += iceCream.getName();
        output += String.format("%" + widthCost + "s",
                DessertShoppe.cents2dollarsAndCents(this.getCost()));
        return output;
    }

    /**
     * Returns the cost of the sundae.
     * @return the price of the sundae.
     */
    @Override
    public int getCost() {
        //adds the cost of the ice cream and the price of the topping
        //to find the total cost of the sundae
        return Math.round(costTopping + iceCream.getCost());
    }
    
}
