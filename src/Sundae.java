/**
 * A Sundae is a type of IceCream. 
 * 
 * A Sundae needs the name of the ice cream being used, 
 * the cost of that ice cream, the name of the topping, and 
 * the cost for the topping. 
 * The cost is determined by adding the cost of the ice cream with 
 * the price of the topping.
 * 
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 * 
 * @author YOURNAMEHERE
 */
public class Sundae extends IceCream{
    
    private String name;
    private int cost;

    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
       super(icName, icCost);
       this.cost = toppingCost;
       this.name = toppingName;
       cost = cost + super.getCost();
    }
    

    
    public String toString()
    {
         String name = super.getName();
       String output = "";
       int widthItem = DessertShoppe.RECEIPT_WIDTH - name.length();
       output += this.name + " with \n" ;
         output += super.getName() + String.format("%" + widthItem + "s", 
                 DessertShoppe.cents2dollarsAndCents(cost)); 
        return output;
    }
    
     @Override
    public int getCost() {
        return cost;
    }
    
}
