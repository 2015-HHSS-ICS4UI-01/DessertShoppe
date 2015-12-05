
/**
 * A Sundae is a type of IceCream.
 *
 * A Sundae needs the name of the ice cream being used, the cost of that ice
 * cream, the name of the topping, and the cost for the topping. The cost is
 * determined by adding the cost of the ice cream with the price of the topping.
 *
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 *
 * @author simma1980
 */
public class Sundae extends IceCream {

    private String toppingName;

    /**
     * Makes a new sundae
     * @param icName the flavour of the ice cream
     * @param icCost the cost of the ice cream
     * @param toppingName the name of the topping
     * @param toppingCost the topping cost
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        super(icName, icCost + toppingCost);
        this.toppingName = toppingName;
    }
    
    /**
     * Prints out the receipt of the sundae bought
     * @return the receipt line for the sundae
     */
    @Override
    public String toString() {
        String output = toppingName + " Sundae with\n";
        output += super.toString();
        return output;
    }
}