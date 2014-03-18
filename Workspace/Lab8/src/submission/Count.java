package submission;
import java.util.Scanner;
/**.
 * This program counts the number of letters in your input. 
 * @author Leon
 * @version 1.0
 */
public class Count {
    /**.
     * This is the main program
     * @param args not used
     */
    public static void main(String[] args) {
        String phrase = "phrase";
        int countBlank = 0;
        int countA = 0;
        int countE = 0;
        int countS = 0;
        int countT = 0;
        char ch = 'a';
        Scanner scan = new Scanner(System.in);
        //Print a program header
        
        System.out.println();
        System.out.println("Character counter");
        System.out.println();
        //Initalize counts
        countBlank = 0;
        //Read in a string and find its length
        while (!phrase.equalsIgnoreCase("quit")) {
        System.out.println("Enter a sentence or phrase:");
        phrase = scan.nextLine();
        
        
        for (int current = 0; current < phrase.length(); current++) {
            ch = phrase.charAt(current);
            switch (ch) {
            case 'a': 
            case 'A': countA++;
            break;
            
            case 'e':             
            case 'E': countE++;
            break;
            
            case 's':            
            case 'S': countS++;
            break;
            
            case 't':            
            case 'T': countT++;
            break;
            
            case ' ': countBlank++;
            break;
            default: break;
            }
        }
        countT--;
        }
        System.out.println();
        System.out.println("Number of blank spaces:  " + countBlank);
        System.out.println("Number of A: " + countA);
        System.out.println("Number of E: " + countE);
        System.out.println("Number of S: " + countS);
        System.out.println("Number of T: " + countT);
    }
}
