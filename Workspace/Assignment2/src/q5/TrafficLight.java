package q5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class TrafficLight  extends JFrame {

    private JButton button;

    /**
     * <p>The default constructor which sets the title of this app, sets the
     * default close operation to exit, creates a new content pane and finally
     * sets size and sets the visibility of this frame to true (show).</p>
     */
    public TrafficLight() {
        super("INSERT YOUR NAME HERE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        button = new JButton("Change");
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(new DrawingPanel());
        panel.setBackground(new Color(236, 118, 0));


        getContentPane().add(panel);

        setSize(200, 420);
        setVisible(true);
    }

    class DrawingPanel extends JPanel {
        public DrawingPanel() {
            setPreferredSize(new Dimension(150, 340));
            setBackground(new Color(193, 97, 0));
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            // replace this with your drawing code
            g.drawString("Traffic light!", 20, 40);
        }
    }


    /**
     * <p>The main method.</p>
     */
    public static void main(String[] args) {
        new TrafficLight();
    }

};
