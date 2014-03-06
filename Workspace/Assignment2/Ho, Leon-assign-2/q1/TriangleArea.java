package q1;
import java.util.Scanner;
/**
 * <p>This program calculates the area, and perimeter
 *  of a triangle.</p>
 *
 * @author Leon Ho
 * @version 1.0
 */
public class TriangleArea {
    /**
     * <p>This is the main method that does all the calculations.
     * This will not work if the sum of two sides added up is 
     * not bigger than the third This can be fixed if you put a 
     * while loop outside and keep running if area is NaN</p>
     *
     * @param args command line arguments.
     */

    public static void main(String[] args) {
        Double a;
        Double b;
        Double c;
        Double perimeter;
        Double halfPerimeter;
        Scanner scan = new Scanner(System.in);
        Double area = 0.00;
        System.out.println("Please enter the length of side A");


        System.out.println("The perimeter of the triangle is: " 
                + perimeter);
        System.out.println("");
        System.out.println("The area of the triangle is: " 
                + area);
        scan.close();
    }

};