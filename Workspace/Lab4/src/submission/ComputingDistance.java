package submission;
import java.util.Scanner;
/**.
 *  <p>This program calculates the distance between two points 
 *  (x1,y1) and (x2,y2) </p>
 * @author Leon Ho A00879122   Set1B
 * @version 1.0
 */
public class ComputingDistance {
    /**.
     * <p>This class takes the input of x1,x2,y1,y2 and calculates the distance 
     * between the two points</p>
     * @param args input
     */
    public static void main(String[] args) {
        double x1;
        double y1;
        double x2;
        double y2; // coordinates of two points
        double distance;      // distance between the points
        Scanner scan = new Scanner(System.in);
        // Read in the two points
        System.out.println("Enter the coordinates of the first point " 
                + "(put a space between them): ");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        System.out.println("Enter the coordinates of the second point "
                + "(put a space between them)");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        //computing the answer 
        distance = Math.sqrt(Math.pow((x1 - x2) , 2) + Math.pow((y1 - y2), 2)); 
        //outputing the answer
        System.out.println("The distance between the two points is: " 
                + distance);
    }
}
