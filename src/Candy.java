/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author Leo Yao
 */
public class Candy extends DessertItem{
    
    private double pricePerLbs;
    private double weight;
    
    public Candy(String name, double weight, int pricePerLbs)
    {
        //get name from DessertItem
        super(name);
        //assign the weight and price per pounds to a variable
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    
    /**
     * Get the weight of the candy in pounds
     * @return the weight of the candy in pounds
     */
    public double weight(){
        return this.weight;
    }
    
    /**
     * Get the price per pound
     * @return the price per pound
     */
    public double pricePerLbs(){
        return this.pricePerLbs/100;
    }
    
    /**
     * Get the final cost
     * @return the final cost of the candy
     */
    public int getCost(){
        return (int)Math.round(weight * pricePerLbs);
    }
    
    

 /**
   * Convert this into a string to print
   * @return the product along with its amounts, price/amount, and pretax cost
   */
    @Override
    public String toString()
    {
       //make a new string, output the weight in pounds and the price per pound
       String output = this.weight() + " lbs. @ $" + this.pricePerLbs() + " /lb." + "\n";
       //get name of the candy
       output += super.getName();
       //get the cost in $x.xx
       String preTax = DessertShoppe.cents2dollarsAndCents(this.getCost());
       //the number of spaces needed between the name and amount
       int widthPreTax = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
       output += String.format("%" + widthPreTax + "s", preTax);
       return output;
    }
}
