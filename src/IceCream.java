
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author valet8115
 */
public class IceCream extends DessertItem {

    //create cost variable
    private double cost;

    /**
     *
     * @param name is the name of the ice cream
     * @param cost is the cost of the ice cream
     */
    public IceCream(String name, int cost) {
        //get the name and the cost
        super(name);
        this.cost = cost;
    }

    /**
     *
     * @returns the cost of the ice cream
     */
    public double cost() {
        return this.cost;
    }

    @Override
    /*
     * returns what to output to the receipt
     */
    public String toString() {
        String output = super.getName();
        String preTax = DessertShoppe.cents2dollarsAndCents(this.getCost());
        int widthPreTax = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        output += String.format("%" + widthPreTax + "s", preTax);
        return output;
    }

    @Override
    /**
     * returns the cost of the ice cream
     */
    public int getCost() {
        return (int) cost;
    }
}
