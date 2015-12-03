
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author donet6376
 */
public class IceCream extends DessertItem {

    private int cost;

    /**
     * Constructor for a new Ice Cream entry
     *
     * @param name the name of the ice cream
     * @param cost the cost of the ice cream
     */
    public IceCream(String name, int cost) {
        //send the name to DessertItem
        super(name);
        //store the cost
        this.cost = cost;
    }

    /**
     * Creates the Ice Cream entry for the receipt
     *
     * @return the information to be displayed on the receipt
     */
    public String toString() {
        String amount = DessertShoppe.cents2dollarsAndCents(cost);
        // format the spacing for the tax amount
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        //the information that will be displayed
        return super.getName() + String.format("%" + width + "s", amount);
    }

    @Override
    public int getCost() {
        return cost;
    }
}
