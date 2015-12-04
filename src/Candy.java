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

    public Candy(String name, double weight, int pricePerLbs)
    {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    @Override
    public int getCost() {
        return (int)(weight*pricePerLbs);
    }
    
    public String toString()
    {
        int widthCost = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        String output = String.valueOf(weight) + " lbs. @ $";
        output += DessertShoppe.cents2dollarsAndCents(pricePerLbs) + " /lb. \n";
        output += super.getName();
        output += String.format("%" + widthCost + "s",
                DessertShoppe.cents2dollarsAndCents(this.getCost()));
        return output;
    }
    
}
