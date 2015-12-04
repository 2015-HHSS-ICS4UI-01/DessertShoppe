
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author branc2347
 */
public class Candy extends DessertItem {

    private String name; //name of the candy 
    private double weight; //weight of the candy
    private int pricePerLbs; //price per pound of candy

    public Candy(String name, double weight, int pricePerLbs) {
        super(name); //get the name from the super class(the name being passed into dessert item)
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    /**
     * Convert the food item and the required information to a string to be
     * printed out on the receipt
     *
     * @return the string to be printed on receipt
     */
    @Override
    public String toString() {
        String output = ""; //create the string to be printed
        //add all the relevant information about the candy
        output += weight + " lbs. " + "@ $" + DessertShoppe.cents2dollarsAndCents(pricePerLbs) + " /lb." + "\n" + super.getName();
        //now add the price before tax of that specific candy, formatting to ensure all line up
        output += String.format("%" + (DessertShoppe.RECEIPT_WIDTH - super.getName().length()) + "s", DessertShoppe.cents2dollarsAndCents(getCost()));
        return output;
    }

    /**
     * Get the cost of the wanted candy in cents
     *
     * @return Rounded cost of the candy in terms of its weight*price per pound
     */
    @Override
    public int getCost() {
        //get the price in cents, rounding it because weight is not an integer
        return (int) Math.round(weight * pricePerLbs);
    }
}
