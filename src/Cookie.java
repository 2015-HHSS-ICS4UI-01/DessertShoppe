
/**
 * The Cookie class is a subclass of DessertItem.
 *
 * A Cookie has a name, the number of cookies purchased, and the price per dozen
 * cookies. The number and price per dozen are used to calculate the cost of the
 * cookies.
 *
 * @author Jafer
 */
public class Cookie extends DessertItem {

    //initializing Cookie-specific variables
    private int number;
    private int pricePer12;

    /**
     * Constructor for the cookie class
     * @param name name of the cookie
     * @param number the amount of cookies bought
     * @param pricePer12 //the cost per dozen cookies
     */
    public Cookie(String name, int number, int pricePer12) {
        super(name); //passing the name into the DessertItem superclass
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    /**
     * Outputs all information related to the cookie
     * @return formatted amount of cookies, price per dozen, and cost
     */
    public String toString() {
        //the first line states the number of cookies bought at a certain price per dozen
        String firstLine = number + " @ " + DessertShoppe.cents2dollarsAndCents(pricePer12) + " /dz";
        
        //determining how much white space is between the name and the price based on the length of the name
        int whiteSpaceWidth = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        
        //the second line states the name of the cookie as well as the price formatted using whiteSpaceWidth
        String secondLine = "\n" + super.getName() + String.format("%" + whiteSpaceWidth + "s", DessertShoppe.cents2dollarsAndCents(getCost()));

        return firstLine + secondLine;
    }
    
    /**
     * Getter for the cost of the candy
     * @return the cost
     */
    @Override
    public int getCost() {
        return (int) Math.round(number * (pricePer12 / 12d));
    }
}
