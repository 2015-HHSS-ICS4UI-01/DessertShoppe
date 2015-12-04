/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * Represents Candy
 * @author Erman Dinsel
 */
public class Candy extends DessertItem{
    private double weight;
    private int pricePerLbs;

    /**
     * 
     * @param name the name of the candy
     * @param weight the weight of the candy
     * @param pricePerLbs the price per pound of the candy
     */
    public Candy(String name, double weight, int pricePerLbs)
    {
        //gives name to super class
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }
    
 
    /**
     * 
     * @return the String, to be put onto the receipt
     */
    public String toString()
    {
        String output = weight + " lbs. " + "@ $" + DessertShoppe.cents2dollarsAndCents(pricePerLbs)+ " /lb." + "\n";
        output += super.getName();
        String taxS = DessertShoppe.cents2dollarsAndCents(getCost());
        // format the spacing for the tax amount
        // we subtract the number of letters in the name
        int widthTax = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        output += String.format("%" + widthTax + "s", taxS);
        return output;
    }

    @Override
    /**
     * Returns cost of the candy
     */
    public int getCost() {
       return (int) Math.round((weight * pricePerLbs));
        
        
    }
}
