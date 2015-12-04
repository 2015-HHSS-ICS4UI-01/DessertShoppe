/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author Jonah Janakovic
 */
public class Candy extends DessertItem{
    private int pricePerLbs;
    private double weight;
    private int cost;

    //constructor for candy
    public Candy(String name, double weight, int pricePerLbs)
    {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
        //make the cost of everything
        int temp = (int)(Math.floor(weight))*pricePerLbs;
        int tempe = (int)Math.round((weight - (Math.floor(weight)))*pricePerLbs);
        this.cost = temp + tempe;

    }
    
    @Override
    public int getCost(){
        return cost;
    }

 
    
    public String toString()
    {
       //
       String costOfStuff = DessertShoppe.cents2dollarsAndCents(cost);
       String Output = "";
       Output = weight + " lbs." + " @ $" + DessertShoppe.cents2dollarsAndCents(pricePerLbs) + "/lb.\n";
       Output += super.getName();
       int widthPreTax = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
       Output += String.format("%" + widthPreTax + "s", costOfStuff);
       return Output;        
    }
}
