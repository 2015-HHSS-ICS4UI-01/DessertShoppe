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
 * @author isles3536
 */
public class Sundae extends IceCream{
    //Creates private variables that only this class will use to create the sundae
    private String toppingName;
    private int toppingCost;
    private int icCost;

    /**
     * Creates the sundae
     * @param icName The name of the IceCream that is being used
     * @param icCost The cost of the IceCream that is being used
     * @param toppingName The name of the topping going on-top of the IceCream
     * @param toppingCost The cost of said topping
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
       super(icName , icCost);
       this.toppingCost = toppingCost;
       this.toppingName = toppingName;
       this.icCost = icCost;
    }
    

    /**
     * The String where the receipt is created with the information that is needed, and the proper amount of space between the name and the price
     * @return Returns the String to be put on the receipt
     */
    public String toString()
    {
        String output = toppingName + " Sundae with \n";
        output += super.getName();
        
        String cost = DessertShoppe.cents2dollarsAndCents(getCost()) ;
        // format the spacing for the tax amount
        // we subtract 3 because of the 3 letters in Tax
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        output += String.format("%" + width + "s", cost);
        return output;
    }
    /**
     * The method to get the price to be rounded to the proper amount
     * @return Returns so that it can be output to the receipt
     */
    @Override
    public int getCost() {
        return (int)(toppingCost + super.getCost());
    }
    
}
