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
 * @author Leo Yao
 */
public class Sundae extends IceCream{
    
    private double icCost;
    private double toppingCost;
    private String toppingName;
    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
       //get icecream name and cost from Icecream
       super(icName, icCost);
       //assign the topping cost, name, and the icecream cost to a variable
       this.toppingCost = toppingCost;
       this.toppingName = toppingName;
       this.icCost = icCost;
    }
    
    /**
     * find the topping name
     * @return the topping name
     */
    public String toppingName(){
        return this.toppingName;
    }
    
    /**
     * Get the final cost
     * @return the final cost of the topping+icecream
     */
    public int getCost(){
        return (int)(this.toppingCost+icCost);
    }
    
  /**
   * Convert this into a string to print
   * @return the product along with its amounts, price/amount, and pretax cost
   */
    @Override
    public String toString()
    {
       //make a new string, get name of topping
       String output = this.toppingName + " with \n";
       //add name of the icecream that it is associated with
       output += super.getName();
       //get the cost in $x.xx
       String preTax = DessertShoppe.cents2dollarsAndCents(this.getCost());
       //the number of spaces needed between the name and amount
       int widthPreTax = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
       output += String.format("%" + widthPreTax + "s", preTax);
       return output;
    }
    
}
