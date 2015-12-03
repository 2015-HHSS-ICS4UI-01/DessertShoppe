
/**
 * The Cookie class is a subclass of DessertItem.
 *
 * A Cookie has a name, the number of cookies purchased, and the price per dozen
 * cookies. The number and price per dozen are used to calculate the cost of the
 * cookies.
 *
 * @author vonhn0812
 */
//extends dessert item
public class Cookie extends DessertItem {

    private int number;
    private int pricePer12;

    /**
     * constructor
     *
     * @param name
     * @param number
     * @param pricePer12
     */
    public Cookie(String name, int number, int pricePer12) {
        //send the name to the dessert item class
        super(name);
        //set private variables
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    /**
     * override the toString method
     *
     * @return
     */
    public String toString() {
        //set the recipt width
        int width = DessertShoppe.RECEIPT_WIDTH;
        //subtract the length of the name of cookie from the width
        width -= super.getName().length();
        //subtract the length of the price from the width
        width -= DessertShoppe.cents2dollarsAndCents(this.getCost()).length();
        //set the information before the price
        String n = "" + number + " @ $" + DessertShoppe.cents2dollarsAndCents(pricePer12) + " /dz\n" + super.getName();
        //set the correct amount of spaces
        for (int i = 0; i < width; i++) {
            n += " ";
        }
        //add the price
        n += DessertShoppe.cents2dollarsAndCents(this.getCost());
        return n;

    }

    /**
     * return the cost in cents
     *
     * @return
     */
    @Override
    public int getCost() {
        //number of dozens 
        double amount = number / 12.0;
        //multiply the number if dz by the price per dz
        int cost = (int) Math.round(amount * pricePer12);
        return cost;
    }
}
