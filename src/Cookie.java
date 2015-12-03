
/**
 * The Cookie class is a subclass of DessertItem.
 *
 * A Cookie has a name, the number of cookies purchased, and the price per dozen
 * cookies. The number and price per dozen are used to calculate the cost of the
 * cookies.
 *
 * @author donet6376
 */
public class Cookie extends DessertItem {

    private int number;
    private int pricePer12;
    private int cost;

    /**
     * Constructor for a new Cookie entry
     *
     * @param name the name of the cookie
     * @param number the amount of cookies purchased
     * @param pricePer12 the price per dozen cookies
     */
    public Cookie(String name, int number, int pricePer12) {
        //send the name to DessertItem
        super(name);
        //store the number and price per dozen
        this.number = number;
        this.pricePer12 = pricePer12;
        //calculate the cost of the cookies
        cost = (int) Math.round(this.number * this.pricePer12 / 12);
    }

    /**
     * Creates the Cookie entry for the receipt
     *
     * @return the information to be displayed on the receipt
     */
    public String toString() {
        String amount = DessertShoppe.cents2dollarsAndCents(cost);
        // format the spacing for the total amount
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        //the information that will be displayed
        return number + " @ $" + DessertShoppe.cents2dollarsAndCents(pricePer12)
                + " /dz\n" + super.getName() + String.format("%" + width + "s", amount);

    }

    /**
     * Getter for the total cost of the Cookie(s)
     * @return the cost of the cookie(s)
     */
    @Override
    public int getCost() {
        return cost;
    }
}
