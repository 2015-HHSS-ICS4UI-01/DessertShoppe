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
 * @author Nitin
 */
public class Sundae extends DessertItem{
    
    private String toppingName;
    private int toppingCost;
    private int icCost;
    private String icName;
    
    /**
     * 
     * @param icName the icecream used to make sundae
     * @param icCost the cost of the icecream
     * @param toppingName the name of topping 
     * @param toppingCost the cost of topping
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
        //creates an icecream that was used to make sundae
       IceCream ic = new IceCream(icName,icCost);
       //stores the variables for the sunndae being created 
       this.toppingName = toppingName;
       this.toppingCost = toppingCost;
       this.icCost = ic.getCost();
       this.icName = icName;
    }
    
    //returns the name and cost of bought item in the format of a receipt 
    public String toString()
    {
        
        String output = "";
        output+= this.toppingName + " Sundae with" + "\n";
        //formats and outputs the cost 
        int widthSundae = DessertShoppe.RECEIPT_WIDTH - this.icName.length();
        output += this.icName;
        output += String.format("%" + widthSundae + "s", DessertShoppe.cents2dollarsAndCents(this.getCost()) );
        return output;
    }

    /**
     * 
     * @return the cost of the sundae
     */
    @Override
    public int getCost() {
        return this.icCost + this.toppingCost;
    }
    
}
