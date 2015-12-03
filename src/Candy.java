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


    public Candy(String name, double weight, int pricePerLbs)
    {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }
    
    @Override
    public int getCost(){
        int temp = (int)(Math.floor(weight))*pricePerLbs;
        System.out.println(temp + "------");
        int tempe = (int)Math.round((weight - (Math.floor(weight)))*pricePerLbs);
        System.out.println(tempe + "+++++");
        cost = temp + tempe;
        System.out.println(cost+ "====");
        return cost;
    }

 
    
    public String toString()
    {
       String Output = "";
       Output = weight + " lbs." + " @ $" + DessertShoppe.cents2dollarsAndCents(pricePerLbs) + "/lb.\n";
       Output += super.getName() + DessertShoppe.cents2dollarsAndCents(cost);
       return Output;
       String preTax = DessertShoppe.cents2dollarsAndCents(preCost);
        int widthPreTax = DessertShoppe.RECEIPT_WIDTH - 8;
        output += String.format("%" + widthPreTax + "s%n", preTax);
    }
}
