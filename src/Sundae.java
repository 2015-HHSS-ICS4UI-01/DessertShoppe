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
    
    private double icCost;
    private double toppingCost;
    private String toppingName;
    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
       super(icName, icCost);
       this.toppingCost = toppingCost;
       this.toppingName = toppingName;
       this.icCost = icCost;
    }
    
    public String toppingName(){
        return this.toppingName;
    }
    
    @Override
    public int getCost(){
        return (int)(this.toppingCost+icCost);
    }
    
    public String toString()
    {
       String output = this.toppingName + " with \n";
       output += super.getName();
       String preTax = DessertShoppe.cents2dollarsAndCents(this.getCost());
       int widthPreTax = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
       
       output += String.format("%" + widthPreTax + "s%n", preTax);
       return output;
    }
    
}
