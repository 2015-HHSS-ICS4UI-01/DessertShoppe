/**
 * The Cookie class is a subclass of DessertItem. 
 * 
 * A Cookie has a name, the number of cookies purchased, and 
 * the price per dozen cookies. 
 * The number and price per dozen are used to calculate the cost of the cookies.
 * 
 * @author isles3536
 */
public class Cookie extends DessertItem{
    //Private variables that only this class will use to create the price of the cookies
    private int number;
    private int pricePer12;
    /**
     * Creates the Cookie
     * @param name The name of the cookie
     * @param number The number of cookies that are being bought
     * @param pricePer12 The price per dozen of cookies
     */
    public Cookie(String name, int number, int pricePer12)
    {
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    /**
     * The String where the receipt is created with the information that is needed, and the proper amount of space between the name and the price
     * @return Returns the String to be put on the receipt
     */
    public String toString()
    {
        String output = number + " @ $"+ DessertShoppe.cents2dollarsAndCents(pricePer12)+ " /dz\n";
        output += super.getName();
        String cost = DessertShoppe.cents2dollarsAndCents(getCost());
        // format the spacing for the tax amount
        // we subtract 3 because of the 3 letters in Tax
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        output += String.format("%" + width + "s", cost);
        return output;
    }
    /**
     * The method to get the price to be rounded to the proper amount
     * @return Returns so that it can be output to the receipt
     */
    @Override
    public int getCost() {
      return (int)Math.round(number * pricePer12 / 12);
    }
    
}
