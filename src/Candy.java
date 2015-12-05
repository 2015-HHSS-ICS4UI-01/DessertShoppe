
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author simma1980
 */
public class Candy extends DessertItem {

    private double weight;
    private int pricePerLbs, cost;

    /**
     * Makes a new candy
     * @param name the name of the candy
     * @param weight how much the candy weighs
     * @param pricePerLbs how much the candy costs per pound
     */
    public Candy(String name, double weight, int pricePerLbs) {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    /**
     * Prints out the receipt for the candy bought
     * @return the receipt line for the candy
     */
    @Override
    public String toString() {
        String output = weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(pricePerLbs) + " /lb.\n";
        output += super.getName();
        int correctSpaces = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        output += String.format("%" + correctSpaces + "s", DessertShoppe.cents2dollarsAndCents(getCost()));
        return output;
    }

    /**
     * calculates the cost of the candy
     * @return the cost of the candy
     */
    @Override
    public int getCost() {
        cost = (int) Math.round(weight * pricePerLbs);
        return cost;
    }
}
