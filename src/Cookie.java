/**
 * The Cookie class is a subclass of DessertItem. 
 * 
 * A Cookie has a name, the number of cookies purchased, and 
 * the price per dozen cookies. 
 * The number and price per dozen are used to calculate the cost of the cookies.
 * 
 * @author vonhn0812
 */
public class Cookie extends DessertItem {
    private int number;
    private int pricePer12;
    
    public Cookie(String name, int number, int pricePer12)
    {
     super(name);
     this.number = number;
     this.pricePer12 = pricePer12;
    }

    
    public String toString()
    {
        int width = DessertShoppe.RECEIPT_WIDTH;
       width-= super.getName().length();
       width-= DessertShoppe.cents2dollarsAndCents(this.getCost()).length();
       String n = ""+number+" @ $"+DessertShoppe.cents2dollarsAndCents(pricePer12)+" /dz\n"+super.getName();
        for (int i = 0; i < width; i++) {
            n+=" ";
        }
       n+=DessertShoppe.cents2dollarsAndCents(this.getCost());
       return n;
        
    }

    @Override
    public int getCost() {
        
        double amount = number/12.0;
        
        int cost = (int) Math.round(amount*pricePer12);
        return cost;
    }
    
}
