
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author YOURNAMEHERE
 */
public class Candy extends DessertItem {

    private String name;
    private double weight;
    private int pricePerLbs;

    public Candy(String name, double weight, int pricePerLbs) {
        this.name = name;
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    public String toString() {
//        1.33 lbs. @ $.89 /lb.
//        Gummy Worms               1.18
        String str = weight + " lbs. @ ";
        str += "\n" + name + "     " + DessertShoppe.cents2dollarsAndCents(getCost());
        return str;
    }

    public int getCost() {
        return (int) (weight * pricePerLbs);
    }
}
