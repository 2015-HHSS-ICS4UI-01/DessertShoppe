/**
 * The Cookie class is a subclass of DessertItem. 
 * 
 * A Cookie has a name, the number of cookies purchased, and 
 * the price per dozen cookies. 
 * The number and price per dozen are used to calculate the cost of the cookies.
 * 
 * @author Jonah Janakovic
 */
public class Cookie extends DessertItem{
    private int number;
    private int pricePer12;
    private int cost;
    
    /**
     * makes the cookie
     * @param name name of the cookie
     * @param number the number of cookies
     * @param pricePer12 price per 12 cookies
     */
    public Cookie(String name, int number, int pricePer12)
    {
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
        if(number < 12){
        int divi = 12/number;
        this.cost = pricePer12/divi;
        }else{
            this.cost = number*pricePer12;
        }
    }
    
    /**
     * gets the cost of the cookies
     * @return the cost
     */
    @Override
    public int getCost(){
        return cost;
    }
    
    /**
     * the output for the receipt
     * @return the output
     */
    public String toString()
    {
       String costOfStuff = DessertShoppe.cents2dollarsAndCents(cost);
       String Output = "";
       Output = number + " lbs." + " @ $" + DessertShoppe.cents2dollarsAndCents(pricePer12) + "/lb.\n";
       Output += super.getName();
       int widthPreTax = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
       Output += String.format("%" + widthPreTax + "s", costOfStuff);
       return Output;    
    }
    
}
