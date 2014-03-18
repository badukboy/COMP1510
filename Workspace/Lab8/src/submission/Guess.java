package submission;
import java.util.Scanner;
import java.util.Random;
/**.
 * <p>This class makes a game where the user guesses the value 
 * a random generator creates.</p>
 * @author Leon
 * @version 1.0
 */
public class Guess {
    /**.
     * This is the range of numbers that the generator will create. 
     */
    public static final int RANGE = 10;
    /**.
     * This is where the main program is. 
     * @param args no used
     */
    public static void main(String[] args) {
        int numToGuess;
        int guess;
        int numberOfGuesses = 0;
        int highGuess = 0;
        int lowGuess = 0;
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        numToGuess = generator.nextInt(RANGE) + 1;
        System.out.println("Pick a number between 1 to 10");
        guess = scan.nextInt();
        do {
            if (guess < numToGuess) {
                System.out.println("That number is too low try again");
                guess = scan.nextInt();
                numberOfGuesses++;
                lowGuess++;
            } else {
                System.out.println("That number is too high try again");
                guess = scan.nextInt();
                numberOfGuesses++;
                highGuess++;
            }

        } while(guess != numToGuess);
        numberOfGuesses++;
        System.out.println("Congrats you guess the right number");
        System.out.println("*******STATS********");
        System.out.println("You guessed " + numberOfGuesses + " times"); 
        System.out.println("You guessed " + highGuess + " times too high");
        System.out.println("You guessed " + lowGuess + " times too low");
    }
}
