package submission;
/**.
 * This class creates an object which makes a coin
 * @author Leon
 * @version 1.0;
 */
public class Coin {
    /**.
     * Sets one to equal to head.
     */
    public final int HEADS = 0;
    /**.
     * Sets two to equal to tails
     */
    public final int TAILS = 1;
    private int face;
    // ---------------------------------------------
    //   Sets up the coin by flipping it initially.
    // ---------------------------------------------
    public Coin ()
    {
        flip();
    }
    // -----------------------------------------------
    //  Flips the coin by randomly choosing a face.
    // -----------------------------------------------
    public void flip()
    {
       face = (int) (Math.random() * 2);
 }
    // ---------------------------------------------------------
    //  Returns true if the current face of the coin is heads.
    // ---------------------------------------------------------
    public boolean isHeads()
    {
       return (face == HEADS);
 }
    // ----------------------------------------------------
    //  Returns the current face of the coin as a string.
    // ----------------------------------------------------
    public String toString() {
        String faceName;
        if (face == HEADS) {
            faceName = "heads";
        } else {
            faceName = "Tails";
        } 
        return faceName;
    
    }
}
