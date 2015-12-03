
/**
 * The Cookie class is a subclass of DessertItem.
 *
 * A Cookie has a name, the number of cookies purchased, and the price per dozen
 * cookies. The number and price per dozen are used to calculate the cost of the
 * cookies.
 *
 * @author YOURNAMEHERE
 */
public class Cookie extends DessertItem{

    private int number;
    private int pricePer12, cost;

    public Cookie(String name, int number, int pricePer12) {
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    @Override
    public String toString() {
        String output = number + " @ $" + DessertShoppe.cents2dollarsAndCents(pricePer12) + " /dz\n";
        output += super.getName();
        int correctSpaces = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        output += String.format("%" + correctSpaces + "s",DessertShoppe.cents2dollarsAndCents(getCost()));
        return output;
    }

    @Override
    public int getCost() {
        cost = (number*pricePer12)/12;
        return cost;
    }
}
