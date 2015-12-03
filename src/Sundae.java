
/**
 * A Sundae is a type of IceCream.
 *
 * A Sundae needs the name of the ice cream being used, the cost of that ice
 * cream, the name of the topping, and the cost for the topping. The cost is
 * determined by adding the cost of the ice cream with the price of the topping.
 *
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 *
 * @author branc2347
 */
public class Sundae extends IceCream {

    private String toppingName; //name of the topping
    private int toppingCost; //the cost of the topping 

    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        super(icName, icCost); //get the name from the super class(the name being passed into dessert item)
        this.toppingCost = toppingCost;
        this.toppingName = toppingName;
    }

    /**
     * Convert the food item and the required information to a string to be
     * printed out on the receipt
     *
     * @return the string to be printed on receipt
     */
    @Override
    public String toString() {
        String output = "";
        output += toppingName + " Sundae with" + "\n" + super.getName();
        output += String.format("%" + (DessertShoppe.RECEIPT_WIDTH - super.getName().length()) + "s", DessertShoppe.cents2dollarsAndCents(getCost()));
        return output;
    }

    /**
     * Get the cost of the sundae in cents
     *
     * @return The cost of the sundae
     */
    @Override
    public int getCost() {
        return (super.getCost() + toppingCost);
    }
}
