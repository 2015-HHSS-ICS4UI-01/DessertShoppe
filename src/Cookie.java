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
    

    private int cookieNumber;
    private int pricePer12;
    private double pricePer1;
    
    public Cookie(String name, int number, int pricePer12)
    {
        this.cookieNumber = number;
        this.pricePer12 = pricePer12;
    }

    
    public String toString()
    {
        return "";
    }

    @Override
    public int getCost() {
        this.pricePer1 = this.cookieNumber/this.pricePer12;
        return (int) Math.round(this.cookieNumber*this.pricePer1);  
    }
    
}
