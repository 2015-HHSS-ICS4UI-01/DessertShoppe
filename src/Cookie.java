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
    
    
    public Cookie(String name, int number, int pricePer12)
    {
        super(name,number);
        
    }

    
    public String toString()
    {
        return "";
    }

    @Override
    public int getCost() {
        
    }
    
}
