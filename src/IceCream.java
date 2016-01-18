
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author YOURNAMEHERE
 */
public class IceCream extends DessertItem {

    private int icCost;

    public IceCream(String name, int cost) {
        super(name);
        this.icCost = cost;
    }

    @Override
    public String toString() {
        String output = "\n";
        output += icCost +   "\n";
        output += super.getName() + "   " + getCost() + "\n";
        return output;
    }

    public int getCost() {
        return this.icCost;
    }
}
