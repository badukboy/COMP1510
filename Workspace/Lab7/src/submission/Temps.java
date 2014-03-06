package submission;
import java.util.Scanner;
/**.
 * <p>This program takes the input of temperature during the a 
 * 24 hour day and outputs the lowest temperature and the highest.</p>
 * @author Leon Ho A00879122 Set1B
 * @version 1.0
 */
public class Temps {
    /**.
     * <p>How many hours there are in a day. </p>
     */
    static final int HOURS_PER_DAY = 24;
    /**.
     * <p>Default temperature to be used</p>
     */
    static final int DEFAULT_TEMP = 1000;
    /**.
     * <p>This method takes in the input, and outputs the highest, and lowest
     * temperature.</p>
     * @param args not used. 
     */

    public static void main(String[] args) {

        
        int temp; // temperature reading
        int highestTemp = DEFAULT_TEMP;
        int timeOfHighestTemp = 0;
        int lowestTemp = DEFAULT_TEMP * -1;
        int timeOfLowestTemp = 0;
        Scanner scan = new Scanner(System.in);
        //print program heading
        System.out.println();
        System.out.println("Temperature Readings for 24 Hour Period");
        System.out.println();
        for (int hour = 0; hour < HOURS_PER_DAY; hour++) {
            System.out.print("Enter the temperature reading at " + hour 
                    + " hours: ");
            temp = scan.nextInt();
            if (temp >= highestTemp) {
                highestTemp = temp;
                timeOfHighestTemp = hour;
            }
            if (temp <= lowestTemp) {
                lowestTemp = temp;
                timeOfLowestTemp = hour;
            }
        }
        //print the results. 
        System.out.println("The higest temperature is: " + highestTemp 
                + " during hour " + timeOfHighestTemp);
        System.out.println("The lowest temperature is: " + lowestTemp 
                + " during hour " + timeOfLowestTemp);
    }
}
