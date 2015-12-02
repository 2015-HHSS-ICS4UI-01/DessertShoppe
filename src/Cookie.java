/**
 * The Cookie class is a subclass of DessertItem. 
 * 
 * A Cookie has a name, the number of cookies purchased, and 
 * the price per dozen cookies. 
 * The number and price per dozen are used to calculate the cost of the cookies.
 * 
* @author Dmitry K.
 */
public class Cookie extends DessertItem{
    
    // The number of cookies
    private int number;
    // The price per dozen cookies
    private int pricePer12;
    
    /**
     * Creates a new cookie object
     * @param name the name of the cookie
     * @param number the number of cookies
     * @param pricePer12 the price per dozen cookies
     */
    public Cookie(String name, int number, int pricePer12)
    {
        // set the dessertitem name
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    /**
     * Gives the cookie item formatted as the receipt requires
     * @return the cookie info formatted
     */
    @Override
    public String toString()
    {
        String output = number + " @ $" + DessertShoppe.cents2dollarsAndCents(pricePer12) + " /dz";
        output += "\n" + super.getName();
        output += String.format("%" + (DessertShoppe.RECEIPT_WIDTH - super.getName().length()) + "s", DessertShoppe.cents2dollarsAndCents(getCost()));
        return output;
    }
    
    /**
     * Returns the cost of the cookie
     * @return the cost
     */
    @Override
    public int getCost() {
        // first divide the number by 12 since it's price PER 12
        return (int)Math.round(number/12d*pricePer12);
    }
    
}
