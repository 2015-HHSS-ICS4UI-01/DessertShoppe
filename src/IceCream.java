/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author YOURNAMEHERE
 */
public class IceCream extends DessertItem{

    private String icName;
    private int icCost;
    
    public IceCream(String name, int cost)
    {
        this.icName = name;
        this.icCost = cost;
    }

  
    @Override
    public String toString()
    {
     return "";
    }

    
    public int getCost() {
        return this.icCost;
        
    }
    
}
