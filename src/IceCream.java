
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author simma1980
 */
public class IceCream extends DessertItem {

    private int cost;

    /**
     * Makes a new bowl of ice cream
     * @param name the flavour of the ice cream
     * @param cost the cost of the ice cream 
     */
    public IceCream(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    /**
     * Prints out the receipt of the ice cream bought
     * @return the receipt line for the ice cream
     */
    @Override
    public String toString() {
        String output = super.getName();
        int correctSpaces = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        output += String.format("%" + correctSpaces + "s", DessertShoppe.cents2dollarsAndCents(getCost()));
        return output;
    }

    /**
     * Calculates the cost of the ice cream
     * @return the cost of the ice cream
     */
    @Override
    public int getCost() {
        return cost;
    }
}
