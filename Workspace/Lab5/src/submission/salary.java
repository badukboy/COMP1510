package submission;
import java.util.Scanner;
import java.text.NumberFormat;
/**.
 * This program calculates a person's salary based
 * on their preformance
 * @author Leon
 * @version 1.0
 */
public class salary {
    /**.
     * This program calculates a person's salary based
     * on their preformance
     * @param args not used
     */
    public static void main(String[] args) {
        double currentSalary;
        double raise;
        double newSalary;
        String rating;
        final double excellentRaise = 0.06;
        final double goodRaise = 0.04;
        final double poorRaise = 0.015;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the current salary: ");
        currentSalary = scan.nextDouble();
        System.out.println("Please enter the performance "
                + "rating(Excellent, good or poor):");
        rating = scan.next();
        if (rating.equalsIgnoreCase("Excellent")) {
            raise = currentSalary * excellentRaise; 
        } else if (rating.equalsIgnoreCase("good")) {
            raise = currentSalary * goodRaise;
        } else if (rating.equalsIgnoreCase("poor")) {
            raise = currentSalary * poorRaise;
        } else {
            System.out.println("It seems like you didn't "
                    + "enter the right thing");
            raise = 0;
        }
        
        newSalary = currentSalary + raise;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println("Current Salary:" + money.format(currentSalary));
        System.out.println("Amount of your raise: " + money.format(raise));
        System.out.println("Your new salary: " + money.format(newSalary));
        System.out.println();
    }
}
