/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author vonhn0812
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

 
    @Override
    public String toString()
    {
       int width = DessertShoppe.RECEIPT_WIDTH;
       width-= super.getName().length();
       width-= DessertShoppe.cents2dollarsAndCents(this.getCost()).length();
       String n = ""+weight+" lbs. "+ "@ $"+DessertShoppe.cents2dollarsAndCents(pricePerLbs)+" /lb\n"+super.getName();
        for (int i = 0; i < width; i++) {
            n+=" ";
        }
       n+=DessertShoppe.cents2dollarsAndCents(this.getCost());
       return n;
    }

    @Override
    public int getCost() {
        int cost = (int) Math.round(weight*pricePerLbs);
        
        return cost;
    }
}
