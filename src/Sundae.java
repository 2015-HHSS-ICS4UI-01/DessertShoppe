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
 * Represents Sundaes
 * @author Erman Dinsel
 */
public class Sundae extends IceCream{
    private int toppingCost;
    private String toppingName;
    

    /**
     * 
     * @param icName the name of the ice cream 
     * @param icCost the cost of the ice cream 
     * @param toppingName the name of the topping 
     * @param toppingCost the cost of the topping
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
        //gives name and cost to super class
       super (icName, icCost);
       this.toppingCost = toppingCost;
       this.toppingName = toppingName;
    }
    

    /**
     * 
     * @return the String, to be put onto the receipt
     */
    public String toString()
    {
        String output = toppingName + " Sundae " + "with" + "\n";
        output+= super.getName();
        String taxS = DessertShoppe.cents2dollarsAndCents(getCost());
        // format the spacing for the tax amount
        // we subtract the number of letters in the name
        int widthTax = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        output += String.format("%" + widthTax + "s", taxS);
        return output;
    }
    
    @Override
    /**
     * Returns the cost of sundaes
     */
    public int getCost(){
        return (int) Math.round((toppingCost + super.getCost()));
    }
    
}
