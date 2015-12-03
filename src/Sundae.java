
/**
 * A Sundae is a type of IceCream.
 *
 * A Sundae needs the name of the ice cream being used, the cost of that ice
 * cream, the name of the topping, and the cost for the topping. The cost is
 * determined by adding the cost of the ice cream with the price of the topping.
 *
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 *
 * @author valet8115
 */
public class Sundae extends DessertItem {
    //varibles for the sundae

    private String icName;
    private int icCost;
    private String toppingName;
    private int toppingCost;

    /**
     *
     * @param icName is the name of the ice cream
     * @param icCost is the cost of the ice cream
     * @param toppingName is the name of the topping
     * @param toppingCost is the cost of the topping
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        //call the super and other variables
        super(icName);
        this.icCost = icCost;
        this.icName = icName;
        this.toppingCost = toppingCost;
        this.toppingName = toppingName;
    }

    /**
     * @returns the ice cream cost
     */
    public int icCost() {
        return this.icCost;
    }

    /**
     *
     * @returns the topping name
     */
    public String toppingName() {
        return this.toppingName;
    }

    /**
     *
     * @returns the topping cost
     */
    public int toppingCost() {
        return this.toppingCost;
    }

    /**
     *
     * @returns what to print out to the screen
     */
    public String toString() {
        String output = this.toppingName + " Sundae with" + "\n";
        output += this.icName;
        String preTax = DessertShoppe.cents2dollarsAndCents(this.getCost());
        int widthPreTax = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        output += String.format("%" + widthPreTax + "s", preTax);
        return output;

    }

    /**
     *
     * @returns the cost of the final sundae
     */
    @Override
    public int getCost() {
        return (int) (icCost + toppingCost);
    }
}
