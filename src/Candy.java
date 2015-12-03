
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author valet8115
 */
public class Candy extends DessertItem {
    //create the variables for the class

    private double weight;
    private double pricePerLbs;

    /**
     * @param name is the name of the candy
     * @param weight is the weight of the candy
     * @param pricePerLbs is the price per pounds for the candy
     */
    public Candy(String name, double weight, int pricePerLbs) {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;

    }

    /**
     * @returns the weight of the candy
     */
    public double weight() {
        return this.weight;
    }

    /**
     * @returns the price per pounds
     */
    public double pricePerLbs() {
        return this.pricePerLbs;
    }

    /**
     * @returns what to print out to the screen
     */
    @Override
    public String toString() {
        String output = this.weight() + " lbs. @" + pricePerLbs / 100 + " /lb. " + "\n";
        output += super.getName();
        String preTax = DessertShoppe.cents2dollarsAndCents(this.getCost());
        int widthPreTax = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        output += String.format("%" + widthPreTax + "s", preTax);
        return output;
    }

    /**
     * @returns the cost of the candy
     */
    @Override
    public int getCost() {
        return (int) Math.round(weight * pricePerLbs);
    }

    /**
     * @returns the weight of the candy
     */
    public int getWeight() {
        return this.getWeight();
    }
}
