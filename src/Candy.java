
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author muirw5809
 */
public class Candy extends DessertItem {

    private double weight;
    private int pricePerLbs;

    public Candy(String name, double weight, int pricePerLbs) {
        //get the candy name
        super(name);
        //get the weight of the candy
        this.weight = weight;
        //find the price per lbs of the candy
        this.pricePerLbs = pricePerLbs;
    }

    public String toString() {
        int widthPreTax = DessertShoppe.RECEIPT_WIDTH - this.getName().length();
        String output = "";
        output += weight + " lbs.";
        output += " @ $" + DessertShoppe.cents2dollarsAndCents(pricePerLbs) + " /lb.\n";
        output += super.getName();
        output += String.format("%" + widthPreTax + "s%n", DessertShoppe.cents2dollarsAndCents(this.getCost()));
        return output;
    }

    @Override
    public int getCost() {
        //multiply the weight of the candy by the price per lbs
        int cost = (int) (Math.round(weight * pricePerLbs));
        //return that cost
        return cost;
    }
}
