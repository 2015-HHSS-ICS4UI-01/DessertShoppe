 
/**
 * The Cookie class is a subclass of DessertItem.
 *
 * A Cookie has a name, the number of cookies purchased, and the price per dozen
 * cookies. The number and price per dozen are used to calculate the cost of the
 * cookies.
 *
 * @author kampn2687
 */
public class Cookie extends DessertItem {


    private int number;
    private int pricePer12;
    private int cost;

    /**
     * makes a new bunch of cookies
     * @param name name of the cookie
     * @param number number of cookies being purchased
     * @param pricePer12 the price of the specific type of cookie per dozen
     */
    public Cookie(String name, int number, int pricePer12) {
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    
    /**
     * outputs all of the necessary info to the receipt 
     * @return the name, amount, price per dozen, and total cost
     */
    @Override
    public String toString() {
        String output = number + " @ " ;
        output += "$" +DessertShoppe.cents2dollarsAndCents(pricePer12) + " /dz" + "\n"; 
        output +=  super.getName();
        String price = DessertShoppe.cents2dollarsAndCents(getCost());
        int widthPrice = DessertShoppe.RECEIPT_WIDTH - super.getName().length() ;
        output +=  String.format("%"+ widthPrice + "s", price);
        return output;
    }
    /**
     * calculates the total cost of the cookies using the number of cookies and the price per dozen
     * @return the total cost of the cookie purchase
     */
    @Override
    public int getCost() {
        cost = ((number *pricePer12)/12);
        return cost;
    }
}
