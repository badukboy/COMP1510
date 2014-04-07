package q1;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class Statistics {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // your code will go here!!!
        float mean = 0;
        DecimalFormat fmt = new DecimalFormat("0.##");
        Scanner scan = new Scanner(System.in);
        System.out.println("Now running Statistics");
        System.out.println("\nHow many numbers are you going to be entering?");
        int limit = scan.nextInt();
        float[] input = new float[limit];
        for (int index = 0; index < limit; index++) {
            System.out.println("What number do you want to add? ");
            input[index] = scan.nextFloat();
        }
        // Calculating mean of all of the inputs!
        for (float x : input) {
            mean += x;
        }
        mean /= limit;

        System.out.println("Standard deviation:\t" 
                + fmt.format(standardDeviation(input, mean)));
        System.out.println("Mean:\t\t " + fmt.format(mean));
        scan.close();
    }
    /**.
     * <p>This method calculates the standard 
     * deviation of an array and its average</p>
     * @param array The array with the numbers
     * @param average The average of the numbers in the array
     * @return The standard deviation
     */
    private static float standardDeviation(float[] array, float average) {
        double limit = array.length;
        double total = 0;
        float result = 0;
        for (int index = 0; index < limit; index++) {
            array[index] -= average;
            array[index] *= array[index];
            total += array[index];
        }
        result = (float) Math.sqrt(total / (limit - 1));
        return result;
    }

};
