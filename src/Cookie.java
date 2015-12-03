/**
 * The Cookie class is a subclass of DessertItem. 
 * 
 * A Cookie has a name, the number of cookies purchased, and 
 * the price per dozen cookies. 
 * The number and price per dozen are used to calculate the cost of the cookies.
 * 
 * @author Leo Yao
 */
public class Cookie extends DessertItem{
    
    private int number;
    private double pricePer12;
    
    public Cookie(String name, int number, int pricePer12)
    {
        //gt name from DessertItem
        super(name);
        //assign the number of cookies and the price per dozen to a variable
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    
    /**
     * how many cookies purchased
     * @return the number of cookies purchased
     */
    public int number(){
        return this.number;
    }
    
    /**
     * how much money per dozen
     * @return the money needed per dozen
     */
    public double pricePer12(){
        return this.pricePer12/100;
    }
    
    /**
     * Get the final cost
     * @return the final cost of the cookies
     */
    public int getCost(){
        return (int)Math.round(number * pricePer12 / 12);
    }
    
  /**
   * Convert this into a string to print
   * @return the product along with its amounts, price/amount, and pretax cost
   */
    @Override
    public String toString()
    {
       //make a new string, state the number of cookies and its price per dozen
       String output = this.number() + " @ $" + this.pricePer12() + " /dz" + "\n";
       //get name of cookie
       output += super.getName();
       //get the cost in $x.xx
       String preTax = DessertShoppe.cents2dollarsAndCents(this.getCost());
       //the number of spaces needed between the name and amount
       int widthPreTax = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
       output += String.format("%" + widthPreTax + "s", preTax);
       return output;
    }

    
}
