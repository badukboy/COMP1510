package q2;
import java.util.Scanner;
import java.text.DecimalFormat;
/**.
 * <p>This program calculates the surface area and 
 * volume of a cylinder given its radius and height</p>
 *
 * @author Leon Ho
 * @version 1.0
 */
public class CylinderStats {
    /**.
     * <p>This is where the main calculations are done. </p>
     *
     * @param args command line arguments.
     */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r; // radius
        double h; //height
        double sa; // Surface Area
        double volume; // volume
        DecimalFormat fmt = new DecimalFormat("0.####");
        System.out.println("Please enter the cylinder's Radius");
        r = scan.nextDouble();
        System.out.println("Please enter the cylinder's height");
        h = scan.nextDouble();
        sa = 2 * Math.PI * r * (r + h);
        volume = Math.PI * Math.pow(r , 2) * h;
        System.out.println("The surface area is: " + fmt.format(sa));
        System.out.println("The volume is: " + fmt.format(volume));
        scan.close();
    }

};
