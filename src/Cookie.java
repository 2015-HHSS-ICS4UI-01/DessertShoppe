/**
 * The Cookie class is a subclass of DessertItem. 
 * 
 * A Cookie has a name, the number of cookies purchased, and 
 * the price per dozen cookies. 
 * The number and price per dozen are used to calculate the cost of the cookies.
 * 
 * @author thompsont
 */
public class Cookie extends DessertItem{
    private int number;
    private int pricePer;
    private int cost;
    
    /**
     * Creates a new cookie
     * @param name the name of the cookies
     * @param number the number of cookies
     * @param pricePer12 the price per 12 cookies
     */
    public Cookie(String name, int number, int pricePer12)
    {
        super(name);
        this.number = number;
        this.pricePer = pricePer12;
       cost = ((number * pricePer) / 12);
       
    }

    /**
     * Returns the information about the cookie(s) and its/their price
     * @return information about the cookie(s) and prices
     */
    public String toString()
    {
        String name = super.getName();
       String output = "";
      output += number + " @ $" +DessertShoppe.cents2dollarsAndCents(pricePer)+ " /dz. \n" ;
       int widthItem = DessertShoppe.RECEIPT_WIDTH - name.length();
         output += super.getName() + String.format("%" + widthItem + "s", 
                 DessertShoppe.cents2dollarsAndCents(cost)); 
         return output;
    }
    /**
     * Returns cost of the Cookie(s)
     * @return cost of the cookie(s)
     */
    @Override
    public int getCost() {
       return cost;
    }
}
