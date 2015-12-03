/**
 * A Sundae is a type of IceCream. 
 * 
 * A Sundae needs the name of the ice cream being used, 
 * the cost of that ice cream, the name of the topping, and 
 * the cost for the topping. 
 * The cost is determined by adding the cost of the ice cream with 
 * the price of the topping.
 * 
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 * 
 * @author YOURNAMEHERE
 */
public class Sundae extends DessertItem{
    private String icName;
    private int icCost;
    private String toppingName;
    private int toppingCost;
    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost){
        super(icName);
        this.icCost = icCost;
        this.icName = icName;
        this.toppingCost = toppingCost;
        this.toppingName = toppingName;
    }
    
    public int icCost(){
        return this.icCost;
    }
    
    public String toppingName(){
        return this.toppingName;
    }
    
    public int toppingCost(){
        return this.toppingCost;
    }

    
    public String toString(){
        String output = this.toppingName+ " Sundae with" + "\n";
        output +=  this.icName; 
        String preTax = DessertShoppe.cents2dollarsAndCents(this.getCost());
        int widthPreTax = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        output += String.format("%" + widthPreTax + "s", preTax);
        return output;
    
    }

    @Override
    public int getCost() {
        return (int)(icCost + toppingCost);
    }
    
}
