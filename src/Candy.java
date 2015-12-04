/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author kampn2687
 */
public class Candy extends DessertItem {
    private double weight;
    private int pricePerLbs;
    private int cost;

    /**
     * creates a new candy
     * @param name name of the candy
     * @param weight how much the candy weighs
     * @param pricePerLbs price per pound
     */
    public Candy(String name, double weight, int pricePerLbs)
    {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
        

    }

 
    /**
     * gets all of the need info for the receipt
     * @return the name, weight, price per pound, and total cost 
     */
    public String toString()
    {
       String output = weight + " lbs. @ $"+ DessertShoppe.cents2dollarsAndCents(pricePerLbs) + " /lb." + "\n" ; 
        output +=  super.getName();
        int widthPrice = DessertShoppe.RECEIPT_WIDTH - super.getName().length() ;
        output +=  String.format("%"+ widthPrice + "s", DessertShoppe.cents2dollarsAndCents(getCost()));
        return output;
    }
    
    /**
     * gets the cost using weight and price per pound
     * @return the total cost
     */
    @Override
    public int getCost() {
        cost = (int)Math.round(weight * pricePerLbs);
        return cost;
    }
}
