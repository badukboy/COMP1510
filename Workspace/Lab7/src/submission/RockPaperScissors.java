package submission;
import java.util.Scanner;
import java.util.Random;
/**.
 * <p>This program lets you play rock paper scissors against a computer</p>
 * @author Leon Ho A00879122 Set1B 
 * @version 1.0
 */
public class RockPaperScissors {
    /**.
     * <p>This is to set the amount of hands that is possible in Rock 
     * Paper Scissors. Will break if more than 3</p>
     */
    public static final int HANDS = 3;
    /**.
     * <p>Actually running the program here.</p>
     * @param args no arguments
     */
    public static void main(String[] args) {
        String personPlay; 
        String computerPlay = "nothing";
        int computerInt;
        Scanner scan = new Scanner(System.in);
        Random gen = new Random();
        computerInt = gen.nextInt(HANDS);
        System.out.println("Please enter R, P, or S");
        personPlay = scan.nextLine();
        switch(computerInt) {
            case 0:
                computerPlay = "R";
                break;
            case 1:
                computerPlay = "P";
                break;
            case 2:
                computerPlay = "S";
                break;
            default:
                System.out.print("Failure");
                break;
        }
        System.out.println("The computer played " + computerPlay);
        if (computerPlay.equalsIgnoreCase(personPlay)) {
            System.out.println("It is a tie!");
        } else if (personPlay.equalsIgnoreCase("R")) {
            if (computerPlay.equalsIgnoreCase("s")) {
                System.out.println("You win! Rock smashes scissors");
            } else {
                System.out.println("You lose! Paper wraps rock");
            }
        } else if (personPlay.equalsIgnoreCase("S")) {
            if (computerPlay.equalsIgnoreCase("R")) {
                System.out.println("You lose! Rock beats scissors");
            } else {
                System.out.println("You Win! Scissors cut paper");
            }
        } else {
            if (computerPlay.equalsIgnoreCase("R")) {
                System.out.println("You win! Paper beats rock!");
            } else {
                System.out.println("You lose! Scissors cut paper!");
            }
        }
    }

}
