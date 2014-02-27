package q5;
import java.awt.event.*;
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
        super("Leon Ho");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        button = new JButton("Change");
        JPanel panel = new JPanel();

        //panel.add(button);

        panel.add(new DrawingPanelGreen());
        panel.setBackground(new Color(236, 118, 0));
        getContentPane().add(panel);

        setSize(200, 420);
        setVisible(true);
    }
    
    class DrawingPanelGreen extends JPanel {
        private JButton pushGreen;
        public DrawingPanelGreen() {
            setPreferredSize(new Dimension(150, 365));
            setBackground(new Color(193, 97, 0));
            GreenButtonListener listener = new GreenButtonListener();
            pushGreen = new JButton("Change");
            pushGreen.addActionListener(listener);
            add(pushGreen);
            
        }
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            // replace this with your drawing code
            g.setColor(Color.black);
            g.fillOval(25, 40, 100 ,100);
            g.fillOval(25, 150, 100 ,100);
            g.setColor(Color.green);
            g.fillOval(25, 260, 100 ,100);
        }

    }
    class DrawingPanelYellow extends JPanel {
        private JButton pushYellow;
        public DrawingPanelYellow() {
            setPreferredSize(new Dimension(150, 365));
            setBackground(new Color(193, 97, 0));
            YellowButtonListener listener = new YellowButtonListener();
            pushYellow = new JButton("Change");
            pushYellow.addActionListener(listener);
            add(pushYellow);
        }
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            // replace this with your drawing code
            g.setColor(Color.black);
            g.fillOval(25, 40, 100 ,100);
            g.setColor(new Color(255, 126, 0));
            g.fillOval(25, 150, 100 ,100);
            g.setColor(Color.black);
            g.fillOval(25, 260, 100 ,100);
        }

    }
    class DrawingPanelRed extends JPanel {
        private JButton pushRed;
        public DrawingPanelRed() {
            setPreferredSize(new Dimension(150, 365));
            setBackground(new Color(193, 97, 0));
            RedButtonListener listener = new RedButtonListener();
            pushRed = new JButton("Change");
            pushRed.addActionListener(listener);
            add(pushRed);
        }
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            // replace this with your drawing code
            g.setColor(Color.red);
            g.fillOval(25, 40, 100 ,100);
            g.setColor(Color.black);
            g.fillOval(25, 150, 100 ,100);
            g.setColor(Color.black);
            g.fillOval(25, 260, 100 ,100);
        }

    }
    private class GreenButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            getContentPane().removeAll();
        }
    }
    private class YellowButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            
        }
    }
    private class RedButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            getContentPane().removeAll();
            getContentPane().add(new DrawingPanelGreen());
        }
    }

    /**
     * <p>The main method.</p>
     */
    public static void main(String[] args) {
        new TrafficLight();
    }

};
