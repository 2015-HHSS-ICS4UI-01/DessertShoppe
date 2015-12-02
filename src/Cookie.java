
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

    private String name;
    private int number;
    private int pricePer12;

    public Cookie(String name, int number, int pricePer12) {
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    @Override
    public String toString() {
        String output = "";
        output += number + " @ " + pricePer12 + " /dz" + "\n" + super.getName();
        output += String.format("%" + (DessertShoppe.RECEIPT_WIDTH - super.getName().length()) + "s", DessertShoppe.cents2dollarsAndCents(getCost()));
        return output;
    }

    @Override
    public int getCost() {
        return (int) Math.round(number * (pricePer12 / 12d));
    }
}
