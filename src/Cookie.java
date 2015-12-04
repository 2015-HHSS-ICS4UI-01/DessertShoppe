
/**
 * The Cookie class is a subclass of DessertItem.
 *
 * A Cookie has a name, the number of cookies purchased, and the price per dozen
 * cookies. The number and price per dozen are used to calculate the cost of the
 * cookies.
 *
 * @author branc2347
 */
public class Cookie extends DessertItem {

    private String name; //name of the cookies
    private int number; //number of cookies
    private int pricePer12; //price per 12 cookies

    public Cookie(String name, int number, int pricePer12) {
        super(name); //get the name from the super class(the name being passed into dessert item)
        this.number = number;
        this.pricePer12 = pricePer12;
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
        output += number + " @ $" + DessertShoppe.cents2dollarsAndCents(pricePer12) + " /dz" + "\n" + super.getName();
        output += String.format("%" + (DessertShoppe.RECEIPT_WIDTH - super.getName().length()) + "s", DessertShoppe.cents2dollarsAndCents(getCost()));
        return output;
    }

    /**
     * Get the cost of the cookies in cents
     *
     * @return The rounded cost of the cookies in terms of the number*price per
     * dozen
     */
    @Override
    public int getCost() {
        return (int) Math.round(number * (pricePer12 / 12d));
    }
}
