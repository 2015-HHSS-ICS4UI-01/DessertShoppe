
/**
 * A Sundae is a type of IceCream.
 *
 * A Sundae needs the name of the ice cream being used, the cost of that ice
 * cream, the name of the topping, and the cost for the topping. The cost is
 * determined by adding the cost of the ice cream with the price of the topping.
 *
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 *
 * @author vonhn0812
 */
//extends ice cream
public class Sundae extends IceCream {

    private String toppingName;
    private int toppingCost;

    /**
     * constructor
     *
     * @param icName
     * @param icCost
     * @param toppingName
     * @param toppingCost
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        //send the name and cost of icecream to icecream
        super(icName, icCost);
        //set private variables
        this.toppingCost = toppingCost;
        this.toppingName = toppingName;
    }

    /**
     * override the toString method
     *
     * @return
     */
    @Override
    public String toString() {
        //set the first line
        String n = toppingName + " Sundae " + "with\n";
        //set the recipt width
        int width = DessertShoppe.RECEIPT_WIDTH;
        //subtract the length of the name from the width
        width -= super.getName().length();
        // subtract the length of the price from the width
        width -= DessertShoppe.cents2dollarsAndCents(this.getCost()).length();
        //add the name
        n += super.getName();
        //set the number of spaces
        for (int i = 0; i < width; i++) {
            n += " ";
        }
        //add the price
        return n + DessertShoppe.cents2dollarsAndCents(this.getCost());
    }

    /**
     * return cost + ice cream cost in cents
     *
     * @return
     */
    public int getCost() {
        return toppingCost + super.getCost();
    }
}
