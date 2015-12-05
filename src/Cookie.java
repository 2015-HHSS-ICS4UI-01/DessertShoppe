/**
 * The Cookie class is a subclass of DessertItem. 
 * 
 * A Cookie has a name, the number of cookies purchased, and 
 * the price per dozen cookies. 
 * The number and price per dozen are used to calculate the cost of the cookies.
 * 
 * @author Nitin
 */
public class Cookie extends DessertItem {
    

    private int cookieNumber;
    private int pricePer12;
    private double pricePer1;
    private String name;
    
    /**
     * 
     * @param name name of cookie
     * @param number number of cookies
     * @param pricePer12 price of cookies per dozen
     */
    public Cookie(String name, int number, int pricePer12)
    {
        this.cookieNumber = number;
        this.pricePer12 = pricePer12;
        this.name = name;
    }

    /**
     * 
     * @return the information about the cookie and price of it 
     */
    public String toString()
    {
        String output = "";
        //amount of cookies and price
        output += this.cookieNumber +" @"+  DessertShoppe.cents2dollarsAndCents(pricePer12)+ "/dz" +"\n";
        output += this.name;
        
        int widthCookieName = DessertShoppe.RECEIPT_WIDTH - this.name.length();
        output += String.format("%" + widthCookieName + "s", DessertShoppe.cents2dollarsAndCents(this.getCost()) );
                
        return output;
    }
    
    /**
     * 
     * @return returns cost of cookies
     */
    @Override
    public int getCost() {
        //stores cost of cookies in cost variables 
        double cost = Math.round((this.cookieNumber/12.0)*this.pricePer12);  
        //rounds the cost and casts to integer
        return (int) cost; 
    }
    
}
