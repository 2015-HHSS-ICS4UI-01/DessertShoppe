
/**
 * A Sundae is a type of IceCream.
 *
 * A Sundae needs the name of the ice cream being used, the cost of that ice
 * cream, the name of the topping, and the cost for the topping. The cost is
 * determined by adding the cost of the ice cream with the price of the topping.
 *
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 *
 * @author muirw5809
 */
//get acces to the icecream class
public class Sundae extends IceCream {

    private String toppingName;
    private int toppingCost;

    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        //get icecream name and icecream cost
        super(icName, icCost);
        //get topping cost
        this.toppingCost = toppingCost;
        //get topping name
        this.toppingName = toppingName;
    }

    public String toString() {
        int widthPreTax = DessertShoppe.RECEIPT_WIDTH - this.getName().length();
        String output = "";
        output += this.toppingName + " Sunday with \n" + this.getName();
        output += String.format("%" + widthPreTax + "s%n", DessertShoppe.cents2dollarsAndCents(this.getCost()));
        return output;
    }

    @Override
    public int getCost() {
        //add the topping cost to the icecream cost
        int cost = this.toppingCost + super.getCost();
        //return that cost
        return cost;
    }
}
