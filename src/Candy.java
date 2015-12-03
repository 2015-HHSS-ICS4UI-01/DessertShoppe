/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author donet6376
 */
public class Candy extends DessertItem{
    
    private double weight;
    private int pricePerLbs;
    private int cost;

    public Candy(String name, double weight, int pricePerLbs)
    {
        super(name);
        this.pricePerLbs = pricePerLbs;
        this.weight = weight;
        cost = (int) Math.round(this.weight * this.pricePerLbs);
    }

 
    
    public String toString()
    {
        String amount = DessertShoppe.cents2dollarsAndCents(cost);
        // format the spacing for the tax amount
        // we subtract 3 because of the 3 letters in Tax
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
       
       return weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(pricePerLbs) 
        + " /lb.\n" + super.getName() + String.format("%" + width + "s", amount);
    }

    @Override
    public int getCost() {
        return cost;
        
    }
}
