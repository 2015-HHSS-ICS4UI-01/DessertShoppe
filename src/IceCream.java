
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author branc2347
 */
public class IceCream extends DessertItem {

    private String name; //name of the ice cream
    private int cost; //cost of the ice cream

    public IceCream(String name, int cost) {
        super(name); //get the name from the super class(the name being passed into dessert item)
        this.cost = cost;
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
        output += super.getName();
        output += String.format("%" + (DessertShoppe.RECEIPT_WIDTH - super.getName().length()) + "s", DessertShoppe.cents2dollarsAndCents(getCost()));
        return output;
    }

    /**
     * Get the cost of the cookies in cents
     *
     * @return The cost of the ice cream
     */
    @Override
    public int getCost() {
        return cost;
    }
}
