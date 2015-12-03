/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author YOURNAMEHERE
 */
public class Candy extends DessertItem {
    private String name;
    private double weight;
    private int pricePerLbs;
    private int cost;

    public Candy(String name, double weight, int pricePerLbs)
    {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

 
    
    public String toString()
    {
        String output= "" +weight +" lbs. @ $"+DessertShoppe.cents2dollarsAndCents(pricePerLbs) +" /lb."+"\n";
        String temp = DessertShoppe.cents2dollarsAndCents(cost);
        int widthTotal = DessertShoppe.RECEIPT_WIDTH - 5;
        output +="" +name +DessertShoppe.cents2dollarsAndCents(cost);
        return "";
    }

    @Override
    public int getCost() {
        cost = (int)Math.round(weight*pricePerLbs);
        return cost;
    }
}
