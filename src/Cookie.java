/**
 * The Cookie class is a subclass of DessertItem. 
 * 
 * A Cookie has a name, the number of cookies purchased, and 
 * the price per dozen cookies. 
 * The number and price per dozen are used to calculate the cost of the cookies.
 * 
 * @author YOURNAMEHERE
 */
public class Cookie extends DessertItem {
    private int numberOfCookie;
    private int pricePer12;
    private int cost;
    
    public Cookie(String name, int number, int pricePer12)
    {
        super(name);
        this.numberOfCookie = number;
        this.pricePer12 = pricePer12;
        cost = (numberOfCookie*pricePer12)/12;
    }

    
    public String toString()
    {
        String costS = DessertShoppe.cents2dollarsAndCents(cost);
        String output= "" +numberOfCookie +" @ $"+DessertShoppe.cents2dollarsAndCents(pricePer12) +" /dz"+"\n";
        output += super.getName();
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        output += String.format("%" + width + "s", costS);
        return output;
    }

    @Override
    public int getCost() {
        return cost;
    }
    
}
