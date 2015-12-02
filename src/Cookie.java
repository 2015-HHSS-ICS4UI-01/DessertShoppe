/**
 * The Cookie class is a subclass of DessertItem. 
 * 
 * A Cookie has a name, the number of cookies purchased, and 
 * the price per dozen cookies. 
 * The number and price per dozen are used to calculate the cost of the cookies.
 * 
 * @author YOURNAMEHERE
 */
public class Cookie extends DessertItem{
    private int number;
    private int pricePer;
    
    
    public Cookie(String name, int number, int pricePer12)
    {
        super(name);
        this.number = number;
        this.pricePer = pricePer12;
    }

    
    public String toString()
    {
        return "";
    }

    @Override
    public int getCost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
