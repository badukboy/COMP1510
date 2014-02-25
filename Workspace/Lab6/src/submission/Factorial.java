package submission;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        long output = 1;
        long counter = 1;
        System.out.println("Please enter a positive number to calculate");
        input = scan.nextInt();
        while (input < 0) {
            System.out.println("Please enter a positive number to calculate");
            input = scan.nextInt();
        }
        if (input == 0) {
            System.out.println("The factorial of " + input + " is 1");
        } else {
            while (counter <= input) {
                output *= counter;
                counter++;
            }
            System.out.println("The factorial of " + input + " is " + output);
        }
        

   
    }
}
