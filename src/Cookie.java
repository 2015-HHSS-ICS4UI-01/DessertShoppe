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
    private double pricePer12;
    
    public Cookie(String name, int number, int pricePer12)
    {
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    
    
    public int number(){
        return this.number;
    }
    
    public double pricePer12(){
        return this.pricePer12/100;
    }
    
    public int getCost(){
        return (int)Math.round(number * pricePer12 / 12);
    }
    
    @Override
    public String toString()
    {
       String output = this.number() + " @ $" + this.pricePer12() + " /dz" + "\n";
       output += super.getName();
       String preTax = DessertShoppe.cents2dollarsAndCents(this.getCost());
       int widthPreTax = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
       
       output += String.format("%" + widthPreTax + "s%n", preTax);
       return output;
    }

    
}
