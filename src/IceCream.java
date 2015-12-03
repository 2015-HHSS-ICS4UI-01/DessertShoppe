/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author Leo Yao
 */
public class IceCream extends DessertItem{

    private double cost;
    
    public IceCream(String name, int cost)
    {
        //get name from DessertItem
        super(name);
        //assign the cost of the icecream to a variable
        this.cost = cost;
    }

    
    
    /**
     * Get the final cost
     * @return the final cost of the icecream
     */
    public int getCost(){
        return (int)this.cost;
    }
    
  /**
   * Convert this into a string to print
   * @return the product along with its amounts, price/amount, and pretax cost
   */
    @Override
    public String toString()
    {
       //make a new string, get name of icecream
       String output = super.getName();
       //get the cost in $x.xx
       String preTax = DessertShoppe.cents2dollarsAndCents(this.getCost());
       //the number of spaces needed between the name and amount
       int widthPreTax = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
       output += String.format("%" + widthPreTax + "s", preTax);
       return output;
    }
    
}
