/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author Jonah Janakovic
 */
public class Candy extends DessertItem{
    private int pricePerLbs;
    private double weight;
    private int cost;

    public Candy(String name, double weight, int pricePerLbs)
    {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }
    
    @Override
    public int getCost(){
        cost = (int)Math.round((weight*pricePerLbs));
        return cost;
    }

 
    
    public String toString()
    {
        
       return "";
    }
}
