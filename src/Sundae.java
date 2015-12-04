
/**
 * A Sundae is a type of IceCream.
 *
 * A Sundae needs the name of the ice cream being used, the cost of that ice
 * cream, the name of the topping, and the cost for the topping. The cost is
 * determined by adding the cost of the ice cream with the price of the topping.
 *
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 *
 * @author kampn2687
 */
public class Sundae extends IceCream {

    private String toppingName;
    //extends iceCream and creates a new sundae
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        super(icName, icCost + toppingCost);
        this.toppingName = toppingName;


    }
    /**
     * adds topping to the ice cream
     * @return name and price
     */
    @Override
    public String toString() {
        String output = toppingName + " Sundae with\n";
        output += super.toString();
        return output;
    }
}
