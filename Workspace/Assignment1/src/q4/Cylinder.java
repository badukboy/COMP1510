package q4;
import java.util.Scanner;
/**.
 * <p>This program calculates a cylinder's volume given its height
 * and radius.</p>
 *
 * @author Leon Ho
 * @version 1.0
 */
public class Cylinder {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        double radius;
        double height;
        double volume;
        System.out.println("Please enter a cylinder's height");
        height = scan.nextDouble();
        System.out.println("Please enter a cylinder's radius");
        radius = scan.nextDouble();
        volume = Math.PI * Math.pow(radius , 2) * height;
        System.out.println(volume);
    }
}
