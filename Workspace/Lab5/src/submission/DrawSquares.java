package submission;

import javax.swing.JFrame;
/**.
 * This program draws out 5 squares from the Square.java program
 * @author Leon
 * @version 1.0
 */
public class DrawSquares {
    /**.
     * This program paints out the squares created
     * @param args not used
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Squares");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new SquarePanel());
        frame.pack();
        frame.setVisible(true);
        
    }
}
