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
    private int pricePer12;
    
    public Cookie(String name, int number, int pricePer12)
    {
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
        
    }

    
    @Override
    public String toString()
    {
        String output = "\n";
        output += "Name: " + super.getName() + "\n";
        return "";
    }

    public int getNumber() {
        return number;
    }
    
    public int getCost() {
        double cookie = pricePer12 / 12;
        int cost = (int)Math.round(number * cookie/100.0);
        return cost;
    }
    
}
