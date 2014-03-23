package submission;
import java.util.Scanner;
/**.
 * This class drives the compare 3 class.
 * @author Leon
 * @version 1;
 */
public class Comparisons {
    /**.
     * This is the main method.
     * @param args not used
     */
    public static void main(String[] args) {
        String input1;
        String input2;
        String input3;
        System.out.println("This program allows you to compare 3 "
                + "different things and return the biggest");
        System.out.println("We are going to begin by covnverting 3 integers");
        System.out.println("We are now going to be checking 3 integers");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first string to be converted");
        input1 = scan.nextLine();
        System.out.println("Please enter the second string to be converted");
        input2 = scan.nextLine();
        System.out.println("Please enter the third string to be converted");
        input3 = scan.nextLine();
        System.out.println(Compare3.largest(input1, input2, input3));
        System.out.println("Please enter the first integer to be converted");
        input1 = scan.nextLine();
        System.out.println("Please enter the second integer to be converted");
        input2 = scan.nextLine();
        System.out.println("Please enter the third integer to be converted");
        input3 = scan.nextLine();
        System.out.println(Compare3.largest(input1, input2, input3));
        scan.close();
    }
}
