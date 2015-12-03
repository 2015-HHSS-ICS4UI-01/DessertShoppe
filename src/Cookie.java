/**
 * The Cookie class is a subclass of DessertItem. 
 * 
 * A Cookie has a name, the number of cookies purchased, and 
 * the price per dozen cookies. 
 * The number and price per dozen are used to calculate the cost of the cookies.
 * 
 * @author donet6376
 */
public class Cookie extends DessertItem{
    
    private int number;
    private int pricePer12;
    private int cost;
    
    public Cookie(String name, int number, int pricePer12)
    {
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
        cost = (int)Math.round(this.number * this.pricePer12 / 12);
    }

    
    public String toString()
    {
        String amount = DessertShoppe.cents2dollarsAndCents(cost);
        // format the spacing for the tax amount
        // we subtract 3 because of the 3 letters in Tax
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
       
       return number + " @ $" + DessertShoppe.cents2dollarsAndCents(pricePer12) + 
        " /dz\n" + super.getName() + String.format("%" + width + "s", amount);
        
    }

    @Override
    public int getCost() {
        return cost;
    }
    
}
