
/**
 * The Cookie class is a subclass of DessertItem.
 *
 * A Cookie has a name, the number of cookies purchased, and the price per dozen
 * cookies. The number and price per dozen are used to calculate the cost of the
 * cookies.
 *
 * @author muirw5809
 */
public class Cookie extends DessertItem {

    private int number;
    private int pricePer12;

    public Cookie(String name, int number, int pricePer12) {
        //get the name of the cookie
        super(name);
        //find the amount of cookies being bought
        this.number = number;
        //get the price per 12 cookies
        this.pricePer12 = pricePer12;
    }

    public String toString() {
        int widthPreTax = DessertShoppe.RECEIPT_WIDTH - this.getName().length();
        String output = "";
        output += number;
        output += " @ $" + DessertShoppe.cents2dollarsAndCents(pricePer12) + " /dz \n";
        output += super.getName();
        output += String.format("%" + widthPreTax + "s%n", DessertShoppe.cents2dollarsAndCents(this.getCost()));
        return output;
    }

    @Override
    public int getCost() {
        //divide the number of cookie by 12 and multiply that number by the price per 12 cookies
        double cost = Math.round((number / 12.0) * this.pricePer12);
        //return that cost
        return (int) cost;
    }
}
