package submission;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**.
 * This class makes the vote counter panel
 * and has listeners to detect input. 
 * @author Leon
 * @version 1
 */
public class VoteCounterPanel extends JPanel {
    /**.
     * Serial version code
     * 
     */
    private static final long serialVersionUID = 154060589315057415L;
    /**.
     * Amount of votes for joe
     */
    private int votesForJoe;
    /**.
     * Joe's button
     */
    private JButton joe;
    /**.
     * label for joe
     */
    private JLabel labelJoe;
    /**.
     * Number of votes for same
     */
    private int votesForSam;
    /**.
     * Button for input for sam
     */
    private JButton sam;
    /**.
     * Label for sam 
     */
    private JLabel labelSam;
    /**.
     * The dimension for X
     */
    private final int dimensionX = 300;
   /**.
    * The dimension for Y
    */
    private final int dimensionY = 80;
    /**.
     * This constructor sets up the panel and names the labels.
     */
    public VoteCounterPanel() {
        votesForJoe = 0;
        joe = new JButton("Vote for Joe");
        joe.addActionListener(new JoeButtonListener());
        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        votesForSam = 0;
        sam = new JButton("Vote for Sam");
        sam.addActionListener(new SamButtonListener());
        labelSam = new JLabel("Votes for Sam: " + votesForSam);
        add(joe);
        add(labelJoe);
        add(sam);
        add(labelSam);
        setPreferredSize(new Dimension(dimensionX, dimensionY));
        setBackground(Color.cyan);
    }
    /**.
     * This listener checks if Joe has been pressed
     * @author Leon
     *
     */
    private class JoeButtonListener implements ActionListener {
        /**.
         * This method outputs the amount of votes for joe
         * @param event Event of when button is pressed
         */
        public void actionPerformed(ActionEvent event) {
            votesForJoe++;
            labelJoe.setText("Votes for Joe: " + votesForJoe);
        }
    }
    /**.
     * This listener checks if Sam has been pressed
     * @author Leon
     *
     */
    private class SamButtonListener implements ActionListener {
       /**.
        * this method outputs the amount of votes for joe
        *  @param event Event of when button is pressed
        */
        public void actionPerformed(ActionEvent event) {
            votesForSam++;
            labelSam.setText("Votes for Sam: " + votesForSam);
        }
    }
}