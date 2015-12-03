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
 * @author vonhn0812
 */
public class Sundae extends IceCream{
    private String toppingName;
    private int toppingCost;

    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
     super(icName,icCost);
     this.toppingCost = toppingCost;
     this.toppingName = toppingName;
    }
    

    
    @Override
    public String toString()
    {
        String n = toppingName+" Sundae "+"with\n";
        int width = DessertShoppe.RECEIPT_WIDTH;
        
        width-= super.getName().length();
        System.out.println(width);
      
        System.out.println(width);
        width-=DessertShoppe.cents2dollarsAndCents(this.getCost()).length();
        System.out.println(width);
        n+=super.getName();
        
        for (int i = 0; i < width; i++) {
            n+=" ";
        }
        
        return n+DessertShoppe.cents2dollarsAndCents(this.getCost()) ;
    }
    
    public int getCost(){
        return toppingCost+super.getCost();
    }
    
}
