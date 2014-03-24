package q2;
import java.util.Random;
import java.util.Scanner;
/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class RockPaperScissors {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    static Random generator = new Random();
    public static void main(String[] args) {
        // your code will go here!!!
        int humanHand = 5;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lets play rock paper scissors");
        while (humanHand != 0) {
            System.out.println("1 = Rock\n2 = Paper\n3 = Scissors\n0 = Quit ");
            System.out.println("Which one do you choose?");
            humanHand = scan.nextInt();
            getWinner(compHand(), humanHand);
        }
        scan.close();
    }
    public static int compHand() {
        int hand; //1 = rock, 2 = paper, 3 = scissors
        hand = generator.nextInt(3) + 1;
        return hand;
    }
    public static void getWinner(int compHand, int humanHand) {
        String winner = "tie"; // tie = 0; computerWin = 1 humanWin = 2
        String computerHand;
        String playerHand;
        if(compHand == 1) {
            if(humanHand == 2){
                winner = "You win";
            }else if(humanHand == 3) {
                winner = "Computer wins";
            }
        }else if(compHand == 2) {
            if(humanHand == 1) {
                winner = "Computer wins";
            } else if(humanHand == 3) {
                winner = "You win";
            }
        }else if(compHand == 3) {
            if(humanHand == 1) {
                winner = "You win";
            } else if(humanHand ==2 ){
                winner = "Computer wins";
            }
        }
        System.out.println("You played: " + convertHand(humanHand));
        System.out.println("Computer Played: " + convertHand(compHand));
        System.out.println(winner);
    }
    public static String convertHand(int hand) {
        String converted;
        if(hand == 1 ){
            converted = "rock";
        }else if(hand == 2) {
            converted = "paper";
        }else {
            converted = "scissors";
        }
        return converted;
    }
};
