package submission;
import java.awt.*;
import javax.swing.*;
public class TelephonePanel extends JPanel{
    public TelephonePanel() {
        setLayout(new BorderLayout());
        JPanel telephone = new JPanel();
        JPanel key = new JPanel();
        JLabel label1 = new JLabel("Telephone");
        //telephone.setLayout(new BorderLayout());
        telephone.add(label1);
        key.setLayout(new GridLayout(4, 3));
        //key.setLayout(new BorderLayout());
        JButton bStar = new JButton("*");
        JButton bHash = new JButton("#");
        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        key.add(b1);
        key.add(b2);
        key.add(b3);
        key.add(b4);
        key.add(b5);
        key.add(b6);
        key.add(b7);
        key.add(b8);
        key.add(b9);
        key.add(bStar);
        key.add(b0);
        key.add(bHash);
        add(telephone, BorderLayout.NORTH);
        add(key, BorderLayout.CENTER);
    }
}
