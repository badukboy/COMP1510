package submission;
/**.
 * <p>This program flips a coin 100 times, and outputs
 * the maximum amount of heads achieved in one go.</p>
 * @author Leon
 * @version 1.0
 */
public class Runs {
    /**.
     * This is the main program.
     * @param args not used
     * 
     */
    public static void main(String[] args) {
        final int fLIPS = 100;
        int currentRun = 0;
        int maxRun = 0;
        
        //create a coin object
        Coin coin = new Coin();
        //flip the coin FLIP times
        for (int i = 0; i < fLIPS; i++) {
            coin.flip();
            System.out.println(coin);
            if (coin.isHeads()) {
                currentRun++;
            } else {
                /* When its not heads check if the current run is
                    greater than the max run. If it is change it,
                    and reset current run.
                */         
                if (currentRun > maxRun) {
                    maxRun = currentRun;
                }
                currentRun = 0;
            }
        }
        System.out.println("\n\n\nThe max run was: " + maxRun);
    }
}
