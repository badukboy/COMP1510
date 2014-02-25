package q3;
import java.util.Scanner;
/**.
 * <p>This program converts Fahrenheit to Celsius</p>
 *
 * @author Leon Ho
 * @version 1.0
 */
public class TempConvert {
   /**.
    * <p>32</p>
    */
    static final double THIRTY_TWO = 32;
    /**.
     * <p>5</p>
     */
    static final double FIVE = 5;
    /**.
     * <p>9</p>
     */
    static final double NINE = 9;
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        double f = 0; //Fahrenheit
        double c = 0; //Celsius
        System.out.println("Please enter a degree in Fahreheit to convert:");
        f = scan.nextDouble();
        c = ((f - THIRTY_TWO) * FIVE / NINE);
        System.out.println(f + " Fahrenheit is " + c + " Celsius");
    }
}
