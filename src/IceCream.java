/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author Jonah Janakovic
 */
public class IceCream extends DessertItem{
    private int cost;
    
    public IceCream(String name, int cost)
    {
        super(name);
        this.cost = cost;
    }
    
    @Override
    public int getCost(){
        return cost;
    }
    
    
    
    public String toString()
    {
     return "";
    }
    
}
