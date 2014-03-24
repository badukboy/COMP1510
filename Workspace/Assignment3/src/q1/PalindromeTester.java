package q1;

import java.util.Scanner;
/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Your Name goes here
 * @version 1.0
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
            boolean failed = false;    
            left = 0;
            right = str.length() - 1;

            while (left < right && failed == false) {
                while(!Character.isLetter(str.charAt(left))) {
                    left++;
                }
                while(!Character.isLetter(str.charAt(right))) {
                    right--;
                }
                if(str.charAt(left) == str.charAt(right)) {
                    left++;
                    right--;
                } else {
                    failed = true;
                }
                
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
            scan.close();
        }
    }
}
