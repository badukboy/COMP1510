package submission;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class VoteCounterPanel extends JPanel{
    private int votesForJoe;
    private JButton joe;
    private JLabel labelJoe;
    private int votesForSam;
    private JButton sam;
    private JLabel labelSam;
    private JLabel winning;
    public VoteCounterPanel() {
        votesForJoe = 0;
        joe = new JButton("Vote for Joe");
        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        sam = new JButton("Vote for Sam");
        labelSam = new JLabel("Votes for Sam: " + votesForSam);
        winning = new JLabel("No Votes Yet");
        add(joe);
        add(labelJoe);
        add(sam);
        add(labelSam);
        add(winning);
        setPreferredSize(new Dimension(300,100));
        setBackground(Color.cyan);
        VoteButtonListener listener = new VoteButtonListener();
        joe.addActionListener(listener);
        sam.addActionListener(listener);
    }
    private class VoteButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == joe) {
                votesForJoe++;
                labelJoe.setText("Votes for joe: " + votesForJoe);
            }
            else {
                votesForSam++;
                labelSam.setText("Votes for sam:" + votesForSam);  
            }
            if (votesForJoe >= votesForSam) {
                winning.setText("Joe is currently winning"); 
            
            } else if (votesForSam >= votesForJoe) {
                winning.setText("Sam is currently winning");
            
            } else {
                winning.setText("It is currently a tie");
            }
        }
    }
}

