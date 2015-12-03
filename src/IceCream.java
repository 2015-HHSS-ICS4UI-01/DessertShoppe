
/**
 * The IceCream class is a subclass of DessertItem.
 *
 * IceCream has a name, and a cost associated with it.
 *
 * @author Vonhn0812
 */
//extends dessert item
public class IceCream extends DessertItem {

    private int cost;

    /**
     * constructor
     *
     * @param name
     * @param cost
     */
    public IceCream(String name, int cost) {
        //send to dessert item class
        super(name);
        //set private variable
        this.cost = cost;
    }

    /**
     *
     * @return
     */
    /**
     * override the toString method
     *
     * @return
     */
    public String toString() {
        //set recipt width
        int width = DessertShoppe.RECEIPT_WIDTH;
        //subtract the length of the ice cream name from the width
        width -= super.getName().length();
        //subtract the length of the price from the width
        width -= DessertShoppe.cents2dollarsAndCents(this.getCost()).length();
        //set name 
        String n = super.getName();
        //add the correct number of spaces 
        for (int i = 0; i < width; i++) {
            n += " ";
        }
        //add the price
        n += DessertShoppe.cents2dollarsAndCents(this.getCost());
        return n;
    }

    /**
     * return the cost in cents
     *
     * @return
     */
    @Override
    public int getCost() {
        return cost;
    }
}
