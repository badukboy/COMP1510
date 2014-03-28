package q2;
import java.util.Random;
import java.util.Scanner;
/**
 * <p>This program lets you play rock paper scissors against a computer.</p>
 *
 * @author Leon Ho
 * @version 1.0
 */
public class RockPaperScissors {
   /**.
    * <p>1 signifies the hand Rock</p>
    */
    static final int ROCK = 1;
    /**.
     * <p>2 signifies the hand paper</p>
     */
    static final int PAPER = 2;
    /**.
     * <p>3 signifies the hand scissors</p>
     */
    static final int SCISSORS = 3;
    /**.
     * <p>The total amounts of hands possible 
     * in a game of rock paper scissors</p>
     */
    static final int POSSIBLE_HANDS = 3;
    /**.
     * <p>A random generator to help select a hand for the computer</p>
     */
    private static Random generator = new Random();
    /**
     * <p>This is the main method, it asks for the players input and calls
     * the correct methods to verify if the player wins or loses. </p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // your code will go here!!!
        int humanHand = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lets play rock paper scissors");
        while (humanHand != 0) {
            System.out.println("1 = Rock\n2 = Paper\n3 = Scissors\n0 = Quit ");
            System.out.println("Which one do you choose?");
            humanHand = scan.nextInt();
            try {    
                getWinner(compHand(), humanHand);
                
            } catch (IllegalArgumentException ex) {
                System.out.println("Illegal play please try again");
            }
        }
        scan.close();
    }
    /**.
     * <p>This generates the computers hand</p>
     * @return Computer's hand
     */
    public static int compHand() {
        int hand; //1 = rock, 2 = paper, 3 = scissors
        hand = generator.nextInt(POSSIBLE_HANDS) + 1;
        return hand;
    }
    /**.
     * <p>This method decides who is the winner.</p>
     * @param compHand Computer's hand
     * @param humanHand Player's hand
     */
    public static void getWinner(int compHand, int humanHand) {
        String winner = "tie"; // tie = 0; computerWin = 1 humanWin = 2
        if (humanHand == 0) {
            return;
        }
        if (humanHand > SCISSORS || humanHand < 0) {
            throw new IllegalArgumentException("Invalid Hand");
        }
        if (compHand == ROCK) {
            if (humanHand == PAPER) {
                winner = "You win";
            } else if (humanHand == SCISSORS) {
                winner = "Computer wins";
            }
        } else if (compHand == PAPER) {
            if (humanHand == ROCK) {
                winner = "Computer wins";
            } else if (humanHand == SCISSORS) {
                winner = "You win";
            }
        } else if (compHand == SCISSORS) {
            if (humanHand == ROCK) {
                winner = "You win";
            } else if (humanHand == PAPER) {
                winner = "Computer wins";
            }
        }
        System.out.println("You played: " + convertHand(humanHand));
        System.out.println("Computer Played: " + convertHand(compHand));
        System.out.println(winner);
    }
    /**.
     * <p>This method converts a hand into a string 
     * for easier reading.</p>
     * @param hand The hand to be converted
     * @return The hand in string format
     */
    public static String convertHand(int hand) {
        String converted;
        if (hand == ROCK) {
            converted = "rock";
        } else if (hand == PAPER) {
            converted = "paper";
        } else {
            converted = "scissors";
        }
        return converted;
    }
};
