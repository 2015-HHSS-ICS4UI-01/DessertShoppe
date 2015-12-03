
/**
 * The Cookie class is a subclass of DessertItem.
 *
 * A Cookie has a name, the number of cookies purchased, and the price per dozen
 * cookies. The number and price per dozen are used to calculate the cost of the
 * cookies.
 *
 * @author valet8115
 */
public class Cookie extends DessertItem {
    //create the varibles name, number, and pricePer12

    private String name;
    private int number;
    private double pricePer12;

    /**
     * @param name is the name of the cookie
     * @param number is the amount of cookies
     * @param pricePer12 is the price per a dozen cookies
     */
    public Cookie(String name, int number, int pricePer12) {
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;

    }

    /**
     * @returns the number of cookies
     */
    public int number() {
        return this.number;
    }

    /**
     * @returns the price of 12 cookies
     */
    public double pricePer12() {
        return this.pricePer12;
    }

    /**
     * @returns what to print out to the screen
     */
    public String toString() {
        String output = this.number + " @ " + "$" + pricePer12 / 100 + " /dz " + "\n";
        output += super.getName();
        String preTax = DessertShoppe.cents2dollarsAndCents(this.getCost());
        int widthPreTax = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        output += String.format("%" + widthPreTax + "s", preTax);
        return output;

    }

    /**
     * @return s the cost of the cookies per 12
     */
    @Override
    public int getCost() {
        return (int) Math.round(number * pricePer12 / 12);
    }
}
