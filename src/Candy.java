
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author Jafer
 */
public class Candy extends DessertItem {

   
    //initializing Candy-specific variables
    private double weight;
    private int pricePerLbs;

    /**
     * Constructor for the candy subclass
     * @param name the name of the candy
     * @param weight the weight in pounds of the candy
     * @param pricePerLbs the price per pound of candy in cents
     */
    public Candy(String name, double weight, int pricePerLbs) {
        super(name); //pass the name to the DessertItem superclass
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    /**
     * Outputs the price of the candy and related information
     * @return formatted weight, price per pound, and cost
     */
    public String toString() {
        //the first line states the weight of the candy bought as well as the price per pound
        String firstLine = weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(pricePerLbs) + " /lb.";
        
        //determining how much white space is between the name and the price based on the RECEIPT width
        int whiteSpaceWidth = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        
        //the second states the name of the candy as well as the price formatted using the whiteSpaceWidth
        String secondLine = "\n" + super.getName() + String.format("%" + whiteSpaceWidth + "s", DessertShoppe.cents2dollarsAndCents(getCost()));
        
        return firstLine + secondLine;
    }

    /**
     * Getter for the cost of the candy
     * @return the cost
     */
    @Override
    public int getCost() {
        return (int) Math.round(weight * pricePerLbs);
    }
}
