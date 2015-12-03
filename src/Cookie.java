/**
 * The Cookie class is a subclass of DessertItem. 
 * 
 * A Cookie has a name, the number of cookies purchased, and 
 * the price per dozen cookies. 
 * The number and price per dozen are used to calculate the cost of the cookies.
 * 
 * @author Jonah Janakovic
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
    }
    
    @Override
    public int getCost(){
        cost = (number/12)*pricePer12;
        return cost;
    }
    
    public String toString()
    {
        return "";
    }
    
}
