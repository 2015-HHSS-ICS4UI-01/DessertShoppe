/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author Dmitry K.
 */
public class Candy extends DessertItem{
    
    // weight of candy in pounds
    private double weight;
    // cents/pound
    private int pricePerLbs;
    
    /**
     * Creates a new candy object
     * @param name The name of the candy
     * @param weight the total weight in pounds of the candy
     * @param pricePerLbs the price per pounds in cents/lbs
     */
    public Candy(String name, double weight, int pricePerLbs)
    {
        // set the name of the dessertitem
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    /**
     * Gives the candy item formatted as the receipt requires
     * @return the candy info formatted
     */
    @Override
    public String toString()
    {
        String output = weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(pricePerLbs) + " /lb.";
        output += "\n" + super.getName();
        output += String.format("%" + (DessertShoppe.RECEIPT_WIDTH - super.getName().length()) + "s", DessertShoppe.cents2dollarsAndCents(getCost()));
        return output;
    }

    /**
     * Returns the cost of the candy
     * @return the cost
     */
    @Override
    public int getCost() {
        return (int)Math.round(weight*pricePerLbs);
    }
}
