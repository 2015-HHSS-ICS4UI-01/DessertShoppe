/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author vonhn0812
 */

//extends DessertItem
public class Candy extends DessertItem{
    private double weight;
    private int pricePerLbs;
/**
 * Constructor
 * @param name 
 * @param weight 
 * @param pricePerLbs 
 */
    public Candy(String name, double weight, int pricePerLbs)
    {
        //send name to the dessert item class
     super(name);
     //set private variables
     this.weight = weight;
     this.pricePerLbs = pricePerLbs;
    }

 /**
  * override the toString method
  * @return 
  */
    @Override
    public String toString()
    {
        //set the reciept width
       int width = DessertShoppe.RECEIPT_WIDTH;
       //subtract the length of the candy name from the width
       width-= super.getName().length();
       //subtract the width of the price from the width
       width-= DessertShoppe.cents2dollarsAndCents(this.getCost()).length();
       //set the information before price
       String n = ""+weight+" lbs. "+ "@ $"+DessertShoppe.cents2dollarsAndCents(pricePerLbs)+" /lb\n"+super.getName();
       //add enough spaces to cover the width
        for (int i = 0; i < width; i++) {
            n+=" ";
        }
        //add the price
       n+=DessertShoppe.cents2dollarsAndCents(this.getCost());
       return n;
    }
  /**
   * return the cost in cents
   * @return 
   */
    @Override
    public int getCost() {
        //multiply the weight by price per pound
        int cost = (int) Math.round(weight*pricePerLbs);
        
        return cost;
    }
}
