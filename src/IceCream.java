/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author YOURNAMEHERE
 */
public class IceCream extends DessertItem{

    private double cost;
    
    public IceCream(String name, int cost)
    {
        super(name);
        this.cost = cost;
    }

    
    
    
    public int getCost(){
        return (int)this.cost;
    }
  
    @Override
    public String toString()
    {
       String output = super.getName();
       String preTax = DessertShoppe.cents2dollarsAndCents(this.getCost());
       int widthPreTax = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
       
       output += String.format("%" + widthPreTax + "s%n", preTax);
       return output;
    }
    
}
