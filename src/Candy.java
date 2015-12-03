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
    private int price;
    private int cost;
    
    

    public Candy(String name, double weight, int pricePerLbs)
    {
        super(name);
        this.weight = weight;
        this.price = pricePerLbs;
        cost = (int) Math.round(weight * price);
    }

 
    
    public String toString()
    {
       String name = super.getName();
       String output = "";
      output += weight + " lbs. @ $" +DessertShoppe.cents2dollarsAndCents(price)+ " /lb. \n" ;
       int widthItem = DessertShoppe.RECEIPT_WIDTH - name.length();
         output += super.getName() + String.format("%" + widthItem + "s", 
                 DessertShoppe.cents2dollarsAndCents(cost)); 
        return output;
    }

    @Override
    public int getCost() {
        return cost;     
    }
}
