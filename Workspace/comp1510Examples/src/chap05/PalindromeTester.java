package chap05;

import java.util.Scanner;

/**
 * Demonstrates the use of nested while loops.
 * Also demonstrates while loop with compound condition.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class PalindromeTester {
    /**
    * Tests strings to see if they are palindromes.
    * @param args Unused
    */
    public static void main(String[] args) {
        String str;
        String another = "y";
        int left;
        int right;

        Scanner scan = new Scanner(System.in);

        while (another.equalsIgnoreCase("y")) { // allows y or Y
            System.out.println("Enter a potential palindrome:");
            str = scan.nextLine();

            left = 0;
            right = str.length() - 1;

            while (left < right && str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            }

            System.out.println();

            if (left < right) {
                System.out.println("That string is NOT a palindrome.");
            } else {
                System.out.println("That string IS a palindrome.");
            }

            System.out.println();
            System.out.print("Test another palindrome (y/n)? ");
            another = scan.nextLine();
        }
    }
}
