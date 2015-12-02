/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author Nitin
 */
public class Candy extends DessertItem{
    

    private double weight;
    private int pricePerLbs;

    public Candy(String name, double weight, int pricePerLbs)
    {
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }
  
    public String toString()
    {
       return "";
    }

    @Override
    public int getCost() {
         double cost = this.pricePerLbs*this.weight;
         return (int)Math.round(cost);
    }
}
