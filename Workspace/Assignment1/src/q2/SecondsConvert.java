package q2;
import java.util.Scanner;
/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class SecondsConvert {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(final String[] args) {
        int hours = 0;
        int mins = 0;
        int seconds = 0;
        final int hoursToMin = 3600;
        final int minsToHours = 60;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of hours:");
        hours = scan.nextInt();
        System.out.println("Please enter the number of mins:");
        mins = scan.nextInt();
        System.out.println("Please enter the number of seconds");
        seconds = scan.nextInt();
        hours =  hours * hoursToMin;
        mins = mins * minsToHours;
        seconds = hours + mins + seconds;
        System.out.println("The total number of seconds is:" + seconds);
    }

}
