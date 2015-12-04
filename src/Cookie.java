/**
 * The Cookie class is a subclass of DessertItem. 
 * 
 * A Cookie has a name, the number of cookies purchased, and 
 * the price per dozen cookies. 
 * The number and price per dozen are used to calculate the cost of the cookies.
 * Represents Cookies
 * @author Erman Dinsel
 */
public class Cookie extends DessertItem{
    private int number;
    private int pricePer12;

    /**
     * 
     * @param name the name of the type of cookie
     * @param number the number of cookies
     * @param pricePer12 price per dozen of cookies
     */
    public Cookie(String name, int number, int pricePer12)
    {
        //gives name to super class
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    /**
     * 
     * @return the String, to be put onto the receipt
     */
    public String toString()
    {
        String output = number  +" @ $" + DessertShoppe.cents2dollarsAndCents(pricePer12)+ " /dz" + "\n";
        output += super.getName();
        String taxS = DessertShoppe.cents2dollarsAndCents(getCost());
        // format the spacing for the tax amount
        // we subtract the number of letters in the name
        int widthTax = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        output += String.format("%" + widthTax + "s", taxS);
        return output;
    }

    @Override
    /**
     * Returns the cost of cookies
     */
    public int getCost() {
        return (int) Math.round((number*pricePer12)/12);
    }
    
}
