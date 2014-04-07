package q3;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.text.DecimalFormat;
/**
 * <p>This class makes a new stopwatch.</p>
 *
 * @author Leon Ho
 * @version 1.0
 */
public class StopWatch extends JFrame {
    /**.
     * <p>Delay for the timer</p>
     */
    static final int DELAY = 1;
    /**.
     * <p>This sets the default length of the panel</p>
     */
    static final int SIZE_X = 400;
    /**.
     * <p>This sets the default height of the panel</p>
     */
    static final int SIZE_Y = 100;
    /**.
     * <p>This modifier changes the output according to the delay 
     * so that the output is more accurate</p>
     */
    static final float DELAY_MODIFER = 0.002f;
    /**.
     * <p>Default generated serial version</p>
     */
    private static final long serialVersionUID = -5988529613895414199L;

    /**.
     * <p>This inner is the actual stop watch panel.</p>
     * @author Leon
     *
     */
    private final class StopWatchPanel extends JPanel {
        /**
         * <p>Default generated serial version.</p>
         */
        private static final long serialVersionUID = 8381340655597275349L;
        /**.
         * <p>This is the start button for the stop watch </p>
         */
        private JButton start = new JButton("Start!");
        /**.
         * <p>This is the stop button for the stop watch</p>
         */
        private JButton stop =  new JButton("Stop!");
        /**.
         * <p>This is the label where the out put is to be set</p>
         */
        private JLabel time = new JLabel("0.00");
        /**.
         * <p>This sets the format of the output</p>
         */
        private DecimalFormat fmt = new DecimalFormat("0.##");
        /**.
         * <p>This is the button listener to be used by the two buttons</p>
         */
        private ButtonListener listener = new ButtonListener();
        /**.
         * <p>This is the starting variable that the timer will start at</p>
         */
        private float timeSet;
        /**.
         * <p>This is the timer that we will be using to keep track of time</p>
         */
        private Timer timer = new Timer(DELAY, new TimerListener());
        /**.
         * <p>This constructor adds the different listeners 
         * and elements onto the panel</p>
         */
        private StopWatchPanel() {
            setLayout(new GridLayout(2, 2));
            start.addActionListener(listener);
            stop.addActionListener(listener);
            add(start);
            add(stop);
            add(time);

        }
        /**.
         * <p>This class updates the timer</p>
         * @author Leon
         *
         */
        private class TimerListener implements ActionListener {
            /**.
             * <p>This change the time on the JLabel</p>
             * @param event The timer change
             */
            public void actionPerformed(ActionEvent event) {
                timeSet += DELAY * DELAY_MODIFER;
                time.setText(fmt.format(timeSet));
                
            }
        }
        /**.
         * <p>This is the button listener for the start and stop buttons</p>
         * @author Leon
         *
         */
        private class ButtonListener implements ActionListener {
            /**.
             * <p>This method start and stop the timer</p>
             * @param event The button clicks.
             */
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == start) {
                    timer.start();
                } else {
                    timer.stop();
                }
            }
        }
    }
    /**.
     * This is the constructor for the panel.
     */
    public StopWatch() {
        super("Leon Ho");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new StopWatchPanel());
        setSize(SIZE_X, SIZE_Y);
        setVisible(true);
    }
    /**.
     * <p>This creates a new stopwatch</p>
     *
     * @param args not used
     */
    public static void main(String[] args) {
        new StopWatch();
    }

};
