/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author YOURNAMEHERE
 */
public class Candy extends DessertItem{
    
    private double pricePerLbs;
    private double weight;
    
    public Candy(String name, double weight, int pricePerLbs)
    {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    
    
    public double weight(){
        return this.weight;
    }
    
    public double pricePerLbs(){
        return this.pricePerLbs/100;
    }
    
    
    public int getCost(){
        return (int)Math.round(weight * pricePerLbs);
    }
    
    

 
    @Override
    public String toString()
    {
       String output = this.weight() + " lbs. @ $" + this.pricePerLbs() + " /lb." + "\n";
       output += super.getName();
       String preTax = DessertShoppe.cents2dollarsAndCents(this.getCost());
       int widthPreTax = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
       
       output += String.format("%" + widthPreTax + "s%n", preTax);
       return output;
    }
}
