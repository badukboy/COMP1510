package submission;
import javax.swing.JPanel;
import java.awt.*;
/**.
 * This class generates a panel of 5 squares that can be printed
 * @author Leon
 * @version 1
 */
public class SquarePanel extends JPanel {
    /**.
     * Generated serial version
     */
    private static final long serialVersionUID = 8897302703292817648L;
    /**.
     * Creating random square
     */
    private final Square square0;
    /**.
     * Creating random square
     */
    private final Square square1;
    /**.
     * Creating random square
     */
    private final Square square2;
    /**.
     * Creating random square
     */
    private final Square square3;
    /**.
     * Creating random square
     */
    private final Square square4;
    /**.
     * Dimensions to set the frame to be. 
     */
    private final int dimensions = 1000;
    /**.
     * Constructor sets each square to sqare object as defined 
     * by Square.java
     */
    public  SquarePanel() {
        square0 = new Square();
        square1 = new Square();
        square2 = new Square();
        square3 = new Square();
        square4 = new Square();
        setPreferredSize(new Dimension(dimensions , dimensions));
    }
    /**.
     * Prints out the squares using the draw command 
     * as specified in Square.java
     * @param page Page to be printed to. 
     */
    public void paintComponent(Graphics page) {
        square0.draw(page);
        square1.draw(page);
        square2.draw(page);
        square3.draw(page);
        square4.draw(page);
    
    }
}
