
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author YOURNAMEHERE
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
        return name + " Ice Cream";
    }

    @Override
    public int getCost() {
        return cost;
    }
}
