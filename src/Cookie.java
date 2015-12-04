/**
 * The Cookie class is a subclass of DessertItem. 
 * 
 * A Cookie has a name, the number of cookies purchased, and 
 * the price per dozen cookies. 
 * The number and price per dozen are used to calculate the cost of the cookies.
 * 
 * @author Ali Murra
 */
public class Cookie extends DessertItem{
    
    //declare the variables
    private int number;
    private int pricePer12;
    
    /**
     * 
     * @param name of the cookie
     * @param number of cookies purchased
     * @param pricePer12 the cost of the cookies per dozen
     */
    public Cookie(String name, int number, int pricePer12)
    {
        //send the name of the cookie to DessertItems
        super(name);
        //make the private variables the same as the values of the cost and price of the cookies
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    /**
     * 
     * @return the name, cost and rates of the cookie
     */
    public String toString()
    {
        //output the number of cookies bought and the rate in dollars per dozen
        String output = this.number + " @ $" + DessertShoppe.cents2dollarsAndCents(this.pricePer12) + " /dz" + "\n";
        //output the name of cookie
        output += this.getName();
        //format to line up the price
        int widthPreCost = DessertShoppe.RECEIPT_WIDTH - this.getName().length();
        output += String.format("%" + widthPreCost + "s%n", DessertShoppe.cents2dollarsAndCents(getCost()));
        //return the whole purchase onto the reciept 
        return output;
    }
    
    /**
     * 
     * @return the cost of the cookie
     */
    @Override
    public int getCost() {
        //calculate the total cost of the cookie
        double cost = (this.number/12.0)*this.pricePer12;
        //round the cost
        cost = Math.round(cost);
        //return the price of the cookie in the form of an integer
        return (int) cost;
    }
    
}
