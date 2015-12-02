
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author Jafer
 */
public class IceCream extends DessertItem {

    //initializing ice cream-specific variable, cost of ice cream
    private int cost;

    /**
     * Constructor for Ice Cream
     * @param name name of the ice cream
     * @param cost cost of the ice cream
     */
    public IceCream(String name, int cost) {
        super(name); //pass the name into the DessertItem superclass
        this.cost = cost;
    }

    /**
     * Output all information pertaining to ice cream
     * @return formatted name and price of ice cream
     */
    public String toString() {
        //determining how much white space is between the name and the price based on the receipt width
        int whiteSpaceWidth = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        
        //output the name and price formatted based on the white space width
        String str = super.getName() + String.format("%" + whiteSpaceWidth + "s", DessertShoppe.cents2dollarsAndCents(getCost()));
        
        return str;
    }
    
    /**
     * Getter for the cost of the candy
     * @return the cost
     */
    @Override
    public int getCost() {
        return Math.round(cost);
    }
}
