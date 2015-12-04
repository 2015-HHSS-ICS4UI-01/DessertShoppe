/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author Ali Murra
 */
public class Candy extends DessertItem{
    
    //declare private variables
    private double weight;
    private int pricePerLbs;
    
    /**
     * 
     * @param name of the candy
     * @param weight of the candy
     * @param pricePerLbs how much each pound costs
     */
    public Candy(String name, double weight, int pricePerLbs)
    {
        //send the name of the candy to DessertItems
        super(name);
        //make the private variables in the class the same as the actual cost and weight of the candys
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }
    
    /**
     * 
     * @return the name, cost and rates of the candy
     */
    public String toString()
    {
        //output the weight of the candy bought and the rate in dollars per pound
        String output = this.weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(this.pricePerLbs) + " /lb." + "\n";
        //output the name of candy
        output+= this.getName();
        //format to line up the price
        int widthPreCost = DessertShoppe.RECEIPT_WIDTH - this.getName().length();
        output += String.format("%" + widthPreCost + "s%n", DessertShoppe.cents2dollarsAndCents(getCost()));
        //return the whole purchase onto the reciept 
        return output;
    }

    /**
     * 
     * @return the cost of the candy
     */
    @Override
    public int getCost() {
        //calculate the total cost of the candy
        double cost = this.weight*this.pricePerLbs;
        //round the cost 
        cost = Math.round(cost);
        //return the price of the candy in the form of an integer
        return (int) cost;
    }
}
