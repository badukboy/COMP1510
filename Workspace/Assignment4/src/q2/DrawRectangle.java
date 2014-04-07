package q2;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Point;

/**.
 * <p>This class draws out a rectangle according to your mouse</p>
 * @author Leon Ho
 * @version 1.0
 */
public class DrawRectangle extends JFrame {
    /**.
     * <p>This sets the default size of the rectangle</p>
     */
    static final int SIZE = 400;
    /**.
     * Default genereated serialVersion
     */
    private static final long serialVersionUID = -7070114612570653157L;

    /**.
     * <p>This is the constructor that sets up the rectangle</p>
     */
    public DrawRectangle() {
        super("Leon Ho");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new DrawRectanglePanel());
        setSize(SIZE, SIZE);
        setVisible(true);
    }

    /**.
     * <p>This panel is  where the rectangle is drawn</p>
     */
    private class DrawRectanglePanel extends JPanel implements MouseListener,
            MouseMotionListener {
        /**.
         * <p.Default generated serial version</p>
         */
        private static final long serialVersionUID = -6463836043227685274L;
        /**.
         * <p>This is the starting point of the rectangle</p>
         */
        private Point point1;
        /**.
         * <p>This is the ending point of the rectangle</p>
         */
        private Point point2;
        /**.
         * This constructor adds the mouse listeners
         */
        public DrawRectanglePanel() {
            addMouseListener(this);
            addMouseMotionListener(this);
        }

        /**.
         * <p>This method does the drawing for each rectangle</p>
         * @param g the graphics page to be drawn on.
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (point1 != null && point2 != null) {
                g.drawRect(point1.x, point1.y, point2.x, point2.y);
            }
        }
        /**.
         * <p>This method grabs the the point where the mouse is pressed</p>
         * @param e this is the event
         */
        public void mousePressed(MouseEvent e) {
            point1 = e.getPoint();
            //System.out.println(point1.x);
        }
        /**.
         * <p>This method does nothing</p>
         * @param e not used
         */
        public void mouseReleased(MouseEvent e) {
            //System.out.println("Mouse released called");
        }
        /**.
         * <p>This method repaints and grabs the point of 
         * where the mouse is</p>
         * @param e the position of the event
         */
        public void mouseDragged(MouseEvent e) {
            point2 = e.getPoint();
            //System.out.println(point2.x + "," + point2.y);
            repaint();
        }
        /**.
         * <p>This method does nothing</p>
         * @param e not used
         */
        public void mouseEntered(MouseEvent e) {
        }
        /**.
         * <p>This method does nothing</p>
         * @param e not used
         */
        public void mouseExited(MouseEvent e) {
        }
        /**.
         * <p>This method does nothing</p>
         * @param e not used
         */
        public void mouseClicked(MouseEvent e) {
        }
        /**.
         * <p>This method does nothing</p>
         * @param e not used
         */
        public void mouseMoved(MouseEvent e) {
        }

    }

    /**.
     * <p>This creates a new draw rectangle object</p>
     * @param args not used;
     *
     */
    public static void main(String[] args) {
        new DrawRectangle();
    }

};
