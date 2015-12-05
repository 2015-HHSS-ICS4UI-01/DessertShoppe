
/**
 * The Candy class is a subclass of DessertItem.
 *
 * A Candy has a name, a weight (in pounds), and a price per pound. The weight
 * and price per pound are used to calculate the cost of the Candy.
 *
 * @author Nitin
 */
public class Candy extends DessertItem {

    private String name;
    private double weight;
    private int pricePerLbs;

    /**
     * 
     * @param name name of candy
     * @param weight weight of candies being bought in pounds
     * @param pricePerLbs price of candy per pound
     */
    public Candy(String name, double weight, int pricePerLbs) {
        this.name = name;
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    /**
     * 
     * @return the name and price of candy being bought
     */
    public String toString() {
        String output = "";
        //information of the candy being bought 
        output += this.weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(this.pricePerLbs) + " /lb." + "\n";  
        output += this.name; 
        int widthCandyName = DessertShoppe.RECEIPT_WIDTH - this.name.length();
        output += String.format("%" + widthCandyName + "s", DessertShoppe.cents2dollarsAndCents(this.getCost()) );        
        
        return output;


    }

    /**
     * 
     * @return the cost of the candy in cents 
     */
    @Override
    public int getCost() {
        //stores cost of candy in cost
        double cost = this.pricePerLbs * this.weight;
        //rounds the cost and casts to integer
        return (int) Math.round(cost);
        
    }
}
