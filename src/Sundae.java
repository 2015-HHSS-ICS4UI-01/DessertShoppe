
/**
 * A Sundae is a type of IceCream.
 *
 * A Sundae needs the name of the ice cream being used, the cost of that ice
 * cream, the name of the topping, and the cost for the topping. The cost is
 * determined by adding the cost of the ice cream with the price of the topping.
 *
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 *
 * @author donet6376
 */
public class Sundae extends IceCream {

    private String toppingName;

    /**
     * Constructor for a new Sundae entry
     *
     * @param icName the name of the ice cream
     * @param icCost the cost of the ice cream
     * @param toppingName the name of the topping
     * @param toppingCost the cost of the topping
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        //send the name and total cost to IceCream
        super(icName, icCost + toppingCost);
        //store the name of the topping
        this.toppingName = toppingName;
    }

    /**
     * Creates the Sundae entry for the receipt
     *
     * @return the information to be displayed on the receipt
     */
    public String toString() {
        String amount = DessertShoppe.cents2dollarsAndCents(super.getCost());
        // format the spacing for the tax amount
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        //the information that will be displayed
        return toppingName + " Sundae with\n" + super.getName() + String.format("%" + width + "s", amount);
    }
}
