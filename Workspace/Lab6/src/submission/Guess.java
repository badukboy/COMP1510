package submission;
import java.util.Scanner;
import java.util.Random;
public class Guess {
    public static void main(String[] args)
    {
        int numToGuess;
        int guess;
        int numberOfGuesses = 0;
        int highGuess = 0;
        int lowGuess = 0;
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        numToGuess = generator.nextInt(10) + 1;
        System.out.println("Pick a number between 1 to 10");
        guess = scan.nextInt();
        while (numToGuess != guess) {
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

        }
        numberOfGuesses++;
        System.out.println("Congrats you guess the right number");
        System.out.println("*******STATS********");
        System.out.println("You guessed " + numberOfGuesses + " times"); 
        System.out.println("You guessed " + highGuess + " times too high");
        System.out.println("You guessed " + lowGuess + " times too low");
    }
}
