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
     * <p>This is the main method that does all the calucations.</p>
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
        do {
            if (Double.isNaN(area)) {
                System.out.println("The sum of two sides must add up to be "
                        + "greater than the length of the "
                        + "remaining third side");
                System.out.println("Please try again");
            }

            System.out.println("Please enter the length of side A");
            a = scan.nextDouble();
            System.out.println("Please enter the length of side B");
            b = scan.nextDouble();
            System.out.println("Please etner the length of side C");
            c = scan.nextDouble();
            perimeter = a + b + c;
            halfPerimeter = perimeter / 2;
            area = Math.sqrt(halfPerimeter 
                    * (halfPerimeter - a) 
                    * (halfPerimeter - b) 
                    * (halfPerimeter - c));
        } while(Double.isNaN(area));



        System.out.println("The perimeter of the triangle is: " 
                + perimeter);
        System.out.println("");
        System.out.println("The area of the triangle is: " 
                + area);
        scan.close();
    }

};
