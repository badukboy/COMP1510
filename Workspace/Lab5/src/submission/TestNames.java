package submission;
import java.util.Scanner;
/**.
 * This program runs Name.java to check if everything works.
 * @author leonho
 * @version 1.0
 *
 */
public class TestNames {
   /**.
    * This is the main program uses these methods from Name.java
    * <ul>
    *   <li>firstMiddleLast()
    *   <li>lastFirstMiddle()
    *   <li>initals()
    *   <li>length()
    *   <li>equals()
    * </ul>
    * @param args arguments
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter First, Middle, and Last name seperated"
                + " by spaces");
        Name name1 = new Name(scan.next(), scan.next(), scan.next());
        System.out.println("Please enter next First, Middle, and Last name " 
                + "separated by spaces");
        Name name2 = new Name(scan.next(), scan.next(), scan.next());
        System.out.println(name1.firstMiddleLast());
        System.out.println(name2.firstMiddleLast());
        System.out.println(name1.initals());
        System.out.println(name2.initals());
        System.out.println(name1.length());
        System.out.println(name2.length());
        if (name1.equals(name2)) {
            System.out.println("The names are exactly the same"); 
        }
        else {
            System.out.println("They do not have exact same names");
        }
    }
}
