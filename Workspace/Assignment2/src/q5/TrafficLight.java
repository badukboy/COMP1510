package q5;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <p>This program creates a traffic light that changes the
 * light when a button is pressed. This program could be improved if
 * if statements were allowed to be used.</p>
 *
 * @author Leon Ho
 * @version 1.0
 */
public class TrafficLight  extends JFrame {

    /**.
     *  <p>Automatically generated serial version</p>
     */
    private static final long serialVersionUID = 1498757235602259350L;
    /**.
     * <p>Background color 1</p>
     */
    private static final Color BACKGROUND_COLOR = new Color(193, 97, 0);
    /**. 
     * <p>Background color 2</p>
     */
    private static final Color BACKGROUND_COLOR2 = new Color(236, 118, 0);
    /**.
     * <p>This sets up the dimension for each panel</p>
     */
    private static final Dimension SIZE = new Dimension(150, 365);
    /**.
     * <p>This constant is the amount of indentation each light has.</p>
     */
    private static final int ALL_X = 25;
    /**.
     * <p>This is the y coordinate of Y</p>
     */
    private static final int RED_Y = 40;
    /**.
     * <p>This is the y coordinate for the yellow light</p>
     */
    private static final int YELLOW_Y = 150;
    /**.
     * <p>This is the y coordinate for the green light</p>
     */
    private static final int GREEN_Y = 260;
    /**.
     * <p>This is the dimension of each light</p>
     */
    private static final int DIMENSION = 100;
    /**.
     * <p>The color yellow used for the amber light. </p>
     */
    private static final Color YELLOW = new Color(255, 126, 0);
    /**
     * <p>The default constructor which sets the title of this app, sets the
     * default close operation to exit, creates a new content pane and finally
     * sets size and sets the visibility of this frame to true (show).</p>
     */
    public TrafficLight() {
        super("Leon Ho");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();

        panel.add(new DrawingPanelGreen());
        panel.setBackground(BACKGROUND_COLOR2);
        getContentPane().add(panel);

        pack();
        setVisible(true);
    }
    /**.
     * <p>This panel draws the out the lights if it is green</p>
     * @author Leon
     *
     */
    class DrawingPanelGreen extends JPanel {
        /**
         * <p>Automatically generated serial version. </p>
         */
        private static final long serialVersionUID = 8117549329069870986L;
        /**.
         * <p>Creating button for this panel</p>
         */
        private JButton pushGreen;
        /**.
         * <p>This constructor sets up the button, and adds a listener.</p>
         */
        public DrawingPanelGreen() {
            setPreferredSize(SIZE);
            setBackground(BACKGROUND_COLOR);
            GreenButtonListener listener = new GreenButtonListener();
            pushGreen = new JButton("Change");
            pushGreen.addActionListener(listener);
            add(pushGreen);
            
        }
        /**.
         * <p>Paints out the actual traffic light. </p>
         * @param g graphics page to be printed too.
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            // replace this with your drawing code
            g.setColor(Color.black);
            g.fillOval(ALL_X, RED_Y, DIMENSION, DIMENSION);
            g.fillOval(ALL_X, YELLOW_Y, DIMENSION, DIMENSION);
            g.setColor(Color.green);
            g.fillOval(ALL_X, GREEN_Y, DIMENSION, DIMENSION);
        }

    }
    /**.
     * <p>This class creates the traffic light for the
     * traffic light if it was yellow.</p>
     * @author Leon Ho
     *
     */
    class DrawingPanelYellow extends JPanel {
        /**.
         * <p>Automatically generated serial version </p>
         */
        private static final long serialVersionUID = 8871353045253495823L;
        /**.
         * <p>This button is for the yellow traffic light</p>
         */
        private JButton pushYellow;
        /**.
         * <p>This sets up the button, and adds a listener to the button. </p>
         */
        public DrawingPanelYellow() {
            setPreferredSize(SIZE);
            setBackground(BACKGROUND_COLOR);
            YellowButtonListener listener = new YellowButtonListener();
            pushYellow = new JButton("Change");
            pushYellow.addActionListener(listener);
            add(pushYellow);
        }
        /**.
         * <p>This creates actually prints out the traffic light 
         * when it is yellow</p>
         * @param g Graphics page that will be printed to. 
         */ 
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            // replace this with your drawing code
            g.setColor(Color.black);
            g.fillOval(ALL_X, RED_Y, DIMENSION, DIMENSION);
            g.setColor(YELLOW);
            g.fillOval(ALL_X, YELLOW_Y, DIMENSION, DIMENSION);
            g.setColor(Color.black);
            g.fillOval(ALL_X, GREEN_Y, DIMENSION, DIMENSION);
        }

    }
    /**.
     * <p>This class creates the panel when the light is red. </p>
     * @author Leon
     * 
     */
    class DrawingPanelRed extends JPanel {
        /**
         * <p>This is a randomly generated serial version.</p>
         */
        private static final long serialVersionUID = -2532356932106567976L;
        /**.
         * <p>This button is for the red panel only. </p>
         */
        private JButton pushRed;
        /**.
         * <p>This constructor creates the sets up the button 
         * and adds a listener to it. </p>
         */
        public DrawingPanelRed() {
            setPreferredSize(SIZE);
            setBackground(BACKGROUND_COLOR);
            RedButtonListener listener = new RedButtonListener();
            pushRed = new JButton("Change");
            pushRed.addActionListener(listener);
            add(pushRed);
        }
        /**.
         * <p>This method draws the actual panel itself. </p>
         * @param g This is the actual component it is going to paint to. 
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            // replace this with your drawing code
            g.setColor(Color.red);
            g.fillOval(ALL_X, RED_Y, DIMENSION, DIMENSION);
            g.setColor(Color.black);
            g.fillOval(ALL_X, YELLOW_Y, DIMENSION, DIMENSION);
            g.setColor(Color.black);
            g.fillOval(ALL_X, GREEN_Y, DIMENSION, DIMENSION);
        }

    }
    /**.
     * <p>This listener triggers when the green button is activated. </p>
     * @author Leon
     *
     */
    private class GreenButtonListener implements ActionListener {
        /**.
         * <p>This method removes the content and redraws the yellow panel, 
         * then it refreshes the screen to show it. </p>
         * @param event when a button is clicked. 
         */
        public void actionPerformed(ActionEvent event) {
            getContentPane().removeAll();
            JPanel panel = new JPanel();

            panel.add(new DrawingPanelYellow());
            panel.setBackground(BACKGROUND_COLOR2);
            getContentPane().add(panel);
            pack();
        }
    }
    /**.
     * <p>This listener triggers when the yellow button is activated</p>
     * @author Leon
     *
     */
    private class YellowButtonListener implements ActionListener {
        /**.
         * <p>This method removes the content and redraws the red button 
         * on the panel </p>
         * @param event when the button is clicked.
         */
        public void actionPerformed(ActionEvent event) {
            getContentPane().removeAll();
            JPanel panel = new JPanel();

            panel.add(new DrawingPanelRed());
            panel.setBackground(BACKGROUND_COLOR2);
            getContentPane().add(panel);
            pack();
        }
    }
    /**.
     * <p>The listener triggers when the red button is hit. </p>
     * @author Leon
     *
     */
    private class RedButtonListener implements ActionListener {
        /**.
         * <p>This method removes the content and redraws the green button 
         * on to the panel</p>
         * @param event When the button is clicked.
         */
        public void actionPerformed(ActionEvent event) {
            getContentPane().removeAll();
            JPanel panel = new JPanel();

            panel.add(new DrawingPanelGreen());
            panel.setBackground(BACKGROUND_COLOR2);
            getContentPane().add(panel);
            pack();
        }
    }

    /**
     * <p>The main method.</p>
     * @param args not used. 
     */
    public static void main(String[] args) {
        new TrafficLight();
    }

};
