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
    private int pricePer;
    private int price;
    private int cost;
    
    
    public Cookie(String name, int number, int pricePer12)
    {
        super(name);
        this.number = number;
        this.pricePer = pricePer12;
       cost = ((number * pricePer) / 12);
       
    }

    
    public String toString()
    {
        String name = super.getName();
       String output = "";
      output += number + " @ $" +DessertShoppe.cents2dollarsAndCents(pricePer)+ " /dz. \n" ;
       int widthItem = DessertShoppe.RECEIPT_WIDTH - name.length();
         output += super.getName() + String.format("%" + widthItem + "s", 
                 DessertShoppe.cents2dollarsAndCents(cost)); 
         return output;
    }

    @Override
    public int getCost() {
       return cost;
    }
}
