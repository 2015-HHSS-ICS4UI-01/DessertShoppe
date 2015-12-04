/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author YOURNAMEHERE
 */
public class Candy extends DessertItem {
    private double weight;
    private int pricePerLbs;
    private int cost;

    public Candy(String name, double weight, int pricePerLbs)
    {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
        cost = (int)Math.round(weight*pricePerLbs);
    }

 
    
    public String toString()
    {
        String costS = DessertShoppe.cents2dollarsAndCents(cost);
        String output= "" +weight +" lbs. @ $"+DessertShoppe.cents2dollarsAndCents(pricePerLbs) +" /lb."+"\n";
        output += super.getName();
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        output += String.format("%" + width + "s", costS);
        return output;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
