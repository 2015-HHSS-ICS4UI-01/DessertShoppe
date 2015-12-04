/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author besem4079
 */
public class Candy extends DessertItem{
    public String name;
    public double weight;
    public int pricePerLbs;

    /**
     * Constructor for the Candy.
     * @param name the name of the candy.
     * @param weight how much candy is being bought, in pounds.
     * @param pricePerLbs the price of one pound of the candy
     */
    public Candy(String name, double weight, int pricePerLbs)
    {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }
    
    /**
     * Converts the Candy object into readable text.
     * @return the name and cost of the candy in receipt form.
     */
    public String toString()
    {
        //the width of blank space between the candy's name and its total cost
        int widthCost = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        //a string that holds the candy's section on the receipt
        String output = String.valueOf(weight) + " lbs. @ $";
        output += DessertShoppe.cents2dollarsAndCents(pricePerLbs) + " /lb. \n";
        output += super.getName();
        output += String.format("%" + widthCost + "s",
                DessertShoppe.cents2dollarsAndCents(this.getCost()));
        return output;
    }
    
    /**
     * Returns the total cost of the candy.
     * @return the price of the candies.
     */
    @Override
    public int getCost() {
        //multiplies the total weight of candy by the candy's price per pound
        //to find the candy cost
        return (int)Math.round(weight*pricePerLbs);
    }
}
