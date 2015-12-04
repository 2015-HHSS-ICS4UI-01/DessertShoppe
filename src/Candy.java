
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author isles3536
 */
public class Candy extends DessertItem {
    //Variables that this class will use to come up with the price of the candy
    private double weight;
    private int pricePerLbs;
    /**
     * The constructor for any candy that is being bought
     * @param name The constructor calls DessertItem and sets the name to be the name that is inputed
     * @param weight The weight that is inputed, and the set to be able to come up with the cost
     * @param pricePerLbs The price that the weight is measured by
     */
    public Candy(String name, double weight, int pricePerLbs) {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;


    }
    /**
     * The String where the receipt is created with the information that is needed, and the proper amount of space between the name and the price
     * @return Returns the String to be put on the receipt
     */
    public String toString() {

        String output = weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(pricePerLbs) + " /lb.\n";
        output += super.getName();
        String cost = DessertShoppe.cents2dollarsAndCents(getCost());
        // format the spacing for the tax amount
        // we subtract 3 because of the 3 letters in Tax
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        output += String.format("%" + width + "s", cost);
        return output;
    }
    /**
     * The method to get the price to be rounded to the proper amount
     * @return Returns so that it can be output to the receipt
     */
    @Override
    public int getCost() {
        return (int) Math.round(weight * pricePerLbs);
    }
}
