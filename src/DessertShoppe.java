
/**
 * A Dessert Shoppe class
 *
 * This class stores all of the constants for the program. This class also has
 * the ability to change an integer for cents into a String that has the correct
 * formatting in dollars. DO NOT CHANGE THIS CLASS!
 *
 * @author lamonta
 */
public class DessertShoppe {

    // the tax (13%) to be added to the subtotal
    public final static double TAX_RATE = 13;
    // the name of the store
    public final static String STORE_NAME = "HHSS Dessert Shoppe";
    // the total width the receipt can be
    public final static int RECEIPT_WIDTH = 30;

    /**
     * Converts an integer value of cents into a String value for dollars and
     * cents
     *
     * @param cents A integer representing how many cents something will cost
     * @return A string that is formatted as dollars and cents
     */
    public static String cents2dollarsAndCents(int cents) {

        String s = "";

        // if you have a negative amount, place a minus sign infront of the String
        if (cents < 0) {
            s += "-";
            cents *= -1;
        }

        // determine how many full dollars we have spent
        int dollars = cents / 100;
        // determine the amount of left over cents
        cents = cents % 100;

        // if we have actually spent a dollar or more, add it to the String
        if (dollars > 0) {
            s += dollars;
        }

        // the period between the dollars and cents
        s += ".";

        // if we have less than 10 cents, place a leading 0 infront
        if (cents < 10) {
            s += "0";
        }

        // add the cents to the String
        s += cents;

        return s;
    }
}