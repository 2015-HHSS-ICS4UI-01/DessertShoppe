
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author muirw5809
 */
public class IceCream extends DessertItem {

    private int cost;

    public IceCream(String name, int cost) {
        // get the name of the icecream
        super(name);
        // get the cost of the icecream
        this.cost = cost;
    }

    public String toString() {
        int widthPreTax = DessertShoppe.RECEIPT_WIDTH - this.getName().length();
        String output = "";
        output += super.getName();
        output += String.format("%" + widthPreTax + "s%n", DessertShoppe.cents2dollarsAndCents(this.getCost()));
        return output;
    }

    @Override
    public int getCost() {
        return cost;
    }

}
