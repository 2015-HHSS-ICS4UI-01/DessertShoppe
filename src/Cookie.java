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
    
    public Cookie(String name, int number, int pricePer12)
    {
        super(name);
        this.cookiesPurchased = number;
        this.pricePerDozen = pricePer12;
    }

    
    public String toString()
    {
        int widthCost = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        String output = String.valueOf(cookiesPurchased) + " @ $";
        output += DessertShoppe.cents2dollarsAndCents(pricePerDozen) + " /dz \n";
        output += super.getName();
        output += String.format("%" + widthCost + "s",
                DessertShoppe.cents2dollarsAndCents(this.getCost()));
        return output;
    }

    @Override
    public int getCost() {
        return pricePerDozen / cookiesPurchased;
    }
    
}
