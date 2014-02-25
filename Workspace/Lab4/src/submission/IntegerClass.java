package submission;
import java.util.Scanner;
/**.
 * <p>This program takes in an integer and converts it to:
 * <ul>
 *  <li>Binary</li>
 *  <li>Octal</li>
 *  <li>Hexadecimal</li>
 * </ul>
 * The program then outputs the integer max and min value, then takes
 * two number and adds them together.
 *</p>
 * @author leonho A00879122 Set1B
 * @version 1.0
 */
public class IntegerClass {
    /**.
     * This is the main method that does everything that is mentioned above.
     * @param args arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer integer; 
        String sint1; //string integer 1
        String sint2; //string integer 2
        Integer int1; 
        Integer int2;
        System.out.println("Please enter an integer to be converted: ");
        integer = scan.nextInt();
        System.out.println("Binary: " + Integer.toBinaryString(integer));
        System.out.println("\nOctal: " + Integer.toOctalString(integer));
        System.out.println("\nHexadecimal: " + Integer.toHexString(integer));
        System.out.println("\nAn integer's max possible number: " 
                + Integer.MAX_VALUE);
        System.out.println("\nAn integer's min number: " + Integer.MIN_VALUE);
        System.out.println("\nPlease enter two numbers to be added together "
                + "seperated by space: ");
        sint1 = scan.next();
        sint2 = scan.next();
        int1 = Integer.parseInt(sint1);
        int2 = Integer.parseInt(sint2);
        System.out.println("The sum of the two values is: " + (int1 + int2));
    
    }

}
