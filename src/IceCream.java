/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author YOURNAMEHERE
 */
public class IceCream extends DessertItem{

    private String name;
    private int cost;
    
    public IceCream(String name, int cost)
    {
        this.name = name;
        this.cost = cost;
    }

  
    public String toString()
    {
     return "";
    }

    @Override
    public int getCost() {
        return cost;
    }
    
}
