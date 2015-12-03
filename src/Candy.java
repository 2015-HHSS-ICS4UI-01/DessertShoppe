
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author donet6376
 */
public class Candy extends DessertItem {

    private double weight;
    private int pricePerLbs;
    private int cost;

    /**
     * Constructor for a new Candy entry
     *
     * @param name the name of the candy
     * @param weight how much the candy weighs
     * @param pricePerLbs the price per pound
     */
    public Candy(String name, double weight, int pricePerLbs) {
        //send the name to DessertItem
        super(name);
        //store the weight and price per pound
        this.pricePerLbs = pricePerLbs;
        this.weight = weight;
        //calculate the cost of the candy
        cost = (int) Math.round(this.weight * this.pricePerLbs);
    }

    /**
     * Creates the Candy entry for the receipt
     *
     * @return the information to be displayed on the receipt
     */
    public String toString() {
        String amount = DessertShoppe.cents2dollarsAndCents(cost);
        // format the spacing for the tax amount
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        //the information that will be displayed
        return weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(pricePerLbs)
                + " /lb.\n" + super.getName() + String.format("%" + width + "s", amount);
    }

    @Override
    public int getCost() {
        return cost;

    }
}
