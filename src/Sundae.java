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
 * @author donet6376
 */
public class Sundae extends IceCream{
    
    private String toppingName;
    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
       super(icName,icCost + toppingCost);
       this.toppingName = toppingName;
    }
    

    
    public String toString()
    {
        String amount = DessertShoppe.cents2dollarsAndCents(super.getCost());
        // format the spacing for the tax amount
        // we subtract 3 because of the 3 letters in Tax
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
       
        return toppingName + " Sundae with\n" + super.getName() + String.format("%" + width + "s", amount);
    }
    
}
