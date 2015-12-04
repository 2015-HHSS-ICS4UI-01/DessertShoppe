/**
 * The Cookie class is a subclass of DessertItem. 
 * 
 * A Cookie has a name, the number of cookies purchased, and 
 * the price per dozen cookies. 
 * The number and price per dozen are used to calculate the cost of the cookies.
 * 
 * @author besem4079
 */
public class Cookie extends DessertItem{
    private int cookiesPurchased;
    private int pricePerDozen;
    
    /**
     * Constructor for the Cookie.
     * @param name the name of the cookie.
     * @param number the number of cookies being bought.
     * @param pricePer12 the price of a dozen of the cookie.
     */
    public Cookie(String name, int number, int pricePer12)
    {
        super(name);
        this.cookiesPurchased = number;
        this.pricePerDozen = pricePer12;
    }

    /**
     * Converts the Cookie object into readable text.
     * @return the name and cost of the cookie in receipt form.
     */
    public String toString()
    {
        //the width of blank space between the cookie's name and its total cost
        int widthCost = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        //a string that holds the cookie's section on the receipt
        String output = String.valueOf(cookiesPurchased) + " @ $";
        output += DessertShoppe.cents2dollarsAndCents(pricePerDozen) + " /dz \n";
        output += super.getName();
        output += String.format("%" + widthCost + "s",
                DessertShoppe.cents2dollarsAndCents(this.getCost()));
        return output;
    }

    /**
     * Returns the total cost of the cookie.
     * @return the price of the cookies.
     */
    @Override
    public int getCost() {
        //multiplies the number of cookies by the price per dozen cookies
        //then divides by 12 to find the total cost of the cookies
        return Math.round((pricePerDozen * cookiesPurchased) / 12);
    }
    
}
