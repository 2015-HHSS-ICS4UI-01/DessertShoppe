
/**
 * A Sundae is a type of IceCream.
 *
 * A Sundae needs the name of the ice cream being used, the cost of that ice
 * cream, the name of the topping, and the cost for the topping. The cost is
 * determined by adding the cost of the ice cream with the price of the topping.
 *
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 *
 * @author Jafer
 */
public class Sundae extends IceCream {

    //initializing sundae-specific variables
    private String toppingName;
    private int toppingCost;

    /**
     * Constructor for sundae class
     * @param icName name of the ice cream
     * @param icCost cost of the ice cream
     * @param toppingName name of the sundae topping
     * @param toppingCost cost of the sundae topping
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        super(icName, icCost);
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }

    /**
     * Output all information pertaining to the sundae (ice cream + topping)
     * @return formatted topping name, ice cream name, and total cost
     */
    @Override
    public String toString() {
        //The first line has the name of the topping
        String firstLine = toppingName + " Sundae with \n";
        
        //the width of the whitespace based on the name of the ice cream
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        
        //the second has the name of the ice cream as well as the formatted total price
        String secondLine = super.getName() + String.format("%" + width + "s", DessertShoppe.cents2dollarsAndCents(getCost()));
        
        return firstLine + secondLine;
    }

    /**
     * Getter for the total cost of the sundae
     * @return the cost of the topping added to the cost of the ice cream
     */
    public int getCost() {
        return Math.round(super.getCost() + toppingCost);
    }
}
