
/**
 * The class represents a checkout till at a dessert shoppe. The user can add
 * items to the receipt or clear the till They can also print out the receipt
 * with the taxes
 *
 * DO NOT MODIFY THIS FILE
 *
 * @author lamonta
 */
public class Checkout {

    // the number of items bought
    private int numItems;
    // the array of items bought
    private DessertItem[] desserts;

    /**
     * Creates a new, empty checkout
     */
    public Checkout() {
        numItems = 0;
        desserts = new DessertItem[100];
    }

    /**
     * Adds an item to the receipt
     *
     * @param item the dessert to add to the receipt
     */
    public void enterItem(DessertItem item) {
        desserts[numItems] = item;
        numItems++;
    }

    /**
     * Clears all items from a receipt
     */
    public void clear() {
        for (int i = 0; i < numItems; i++) {
            desserts[i] = null;
        }
        numItems = 0;
    }

    /**
     * Creates a formatted receipt from the till
     *
     * @return a formatted receipt with all items, prices, and taxes listed
     */
    public String toString() {
        // create the receipt header
        String output = "";
        output += DessertShoppe.STORE_NAME + "\n";
        output += "--------------------\n";
        output += "Number of Items: " + numItems + "\n\n";

        // list all the desserts ordered
        int preCost = 0;
        for (int i = 0; i < numItems; i++) {
            output += desserts[i] + "\n";
            preCost += desserts[i].getCost();
        }
        output += "\n";

        // create the subtotal
        output += "Subtotal";

        // format the subtotal amount using the cents2dollars method and the String format method
        // see https://docs.oracle.com/javase/tutorial/java/data/strings.html
        // and http://web.cerritos.edu/jwilson/SitePages/java_language_resources/Java_printf_method_quick_reference.pdf
        // for more info about the String format
        // we subtract 8 from the width because there are 8 letters in subtotal
        String preTax = DessertShoppe.cents2dollarsAndCents(preCost);
        int widthPreTax = DessertShoppe.RECEIPT_WIDTH - 8;
        output += String.format("%" + widthPreTax + "s%n", preTax);

        // calculate the taxes
        output += "Tax";
        int tax = (int) Math.round(preCost * DessertShoppe.TAX_RATE / 100.0);
        String taxS = DessertShoppe.cents2dollarsAndCents(tax);
        // format the spacing for the tax amount
        // we subtract 3 because of the 3 letters in Tax
        int widthTax = DessertShoppe.RECEIPT_WIDTH - 3;
        output += String.format("%" + widthTax + "s%n", taxS);

        // calculate the total
        output += "Total";
        int total = preCost + tax;
        String totalS = DessertShoppe.cents2dollarsAndCents(total);
        //format the total
        // we subtract 5 because of the 5 letters in total
        int widthTotal = DessertShoppe.RECEIPT_WIDTH - 5;
        output += String.format("%" + widthTotal + "s%n", totalS);

        // returns the receipt to be printed
        return output;
    }
}
