/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author YOURNAMEHERE
 */
public class Candy extends DessertItem{
    
    private double weight;
    private int pricePerLbs;
    
    public Candy(String name, double weight, int pricePerLbs)
    {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    public String toString()
    {
        String output = weight + "lbs. @ $" + DessertShoppe.cents2dollarsAndCents(pricePerLbs) + " /lb.";
        output += "\n" + super.getName();
        output += String.format("%" + (DessertShoppe.RECEIPT_WIDTH - super.getName().length()) + "s%n", DessertShoppe.cents2dollarsAndCents(getCost()));
        return output;
    }

    @Override
    public int getCost() {
        return (int)(weight*pricePerLbs);
    }
}
