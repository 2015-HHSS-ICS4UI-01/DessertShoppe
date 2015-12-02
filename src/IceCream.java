
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author branc2347
 */
public class IceCream extends DessertItem {

    private String name;
    private int cost;

    public IceCream(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    @Override
    public String toString() {
        String output = "";
        output+= super.getName();
        output+= String.format("%" + (DessertShoppe.RECEIPT_WIDTH - super.getName().length()) + "s", DessertShoppe.cents2dollarsAndCents(getCost()));
        return output;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
