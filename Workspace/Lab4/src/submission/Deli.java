package submission;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
/**.
 * <p>This program reads the input for price and weight then calculates the 
 * total price of the item. It then formats and out the calculated price.</p>
 * @author leonho A00879122 Set 1b
 * @version 1.0
 */
public class Deli {
    /**.
     * This sets the how many ounces in a pound
     */
    static final double OUNCES_PER_POUND = 16.0;
    /**.
    *  main reads in the price per pound of a deli item
    *  and number of ounces of a deli item then computes
    * the total price and prints a "label" for the item
    * @param args input
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pricePerPound;
        double weightOunces;
        double weight;
        double totalPrice;
        // Declare money as a NumberFormat object and use the
        // getCurrencyInstance method to assign it a value
        // Declare fmt as a DecimalFormat object and instantiate
        // it to format numbers with at least one digit to the left of the
        // decimal and the fractional part rounded to two digits.
        // prompt the user and read in each input
        NumberFormat nfmt = NumberFormat.getCurrencyInstance();
        DecimalFormat fmt = new DecimalFormat("0.##");
        System.out.println("Welcome to the CS Deli! ! \n ");
        System.out.println("Enter the weight (ounces): ");
        weightOunces = scan.nextDouble();
        System.out.print("Enter the price per pound of your item: ");
        pricePerPound = scan.nextDouble();
        // Convert ounces to pounds and compute the total price
        weight = weightOunces / OUNCES_PER_POUND;
        totalPrice = pricePerPound * weight;
        // Print the label using the formatting objects
        // fmt for the weight in pounds and money for the prices
        System.out.print("*****CSDeli*****" + "\nUnit Price: "
            + nfmt.format(pricePerPound) + "\nWeight: " + fmt.format(weight)
            + " pounds"
            + "\n\n ----------\n TOTAL: " + nfmt.format(totalPrice));
    }

}
