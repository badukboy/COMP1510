package q5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
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
public class BusinessCard extends JFrame {
    /**.
     * Setting serialVersionID
     */
    private static final long serialVersionUID = 7062469334560391173L;
    /**.
     *<p>Sets the red color for background </p>
     */
    private static final int BACK_R = 255;
    /**. 
     * <p>Sets the green color for background</p> 
     */
    private static final int BACK_G = 255;
    /**.
     * <p>Sets the blue color for the background </p>
     */
    private static final int BACK_B = 255;
   /**.
    * <p>Sets the red color for text</p>
    */
    private static final int PAGE_R = 0;
    /**.
     * <p>Sets the green color for text</p>
     */
    private static final int PAGE_G = 0;
    /**.
     * <p>Sets the blue color for text</p>
     */
    private static final int PAGE_B = 0;
    /**.
     * <p>Sets the X coordinate for Name</p>
     */
    private static final int NAME_X = 25;
    /**.
     * <p>Sets the Y coordinate for Name</p>
     */
    private static final int NAME_Y = 25;
    /**.
     * <p>Sets the X coordinate for campany name</p>
     */
    private static final int COMPANY_NAME_X = 25;
    /**.
     * <p>Sets the Y coordinate for company name</p>
     */
    private static final int COMPANY_NAME_Y = 60;
    /**.
     * <p>Sets the X coordinate for company address</p>
     */
    private static final int COMPANY_ADDRESS_X = 25;
    /**.
     * <p>Sets the Y coordinate for company addresss</p>
     */
    private static final int COMPANY_ADDRESS_Y = 80;
    /**.
     * <p>Sets the X coordinate for the phone number</p>
     */
    private static final int PHONE_X = 25;
    /**.
     * <p>Sets the Y coordinate for the phone number</p>
     */
    private static final int PHONE_Y = 100;
    /**.
     * <p>Sets the X coordinate for the fax number</p>
     */
    private static final int FAX_X = 25;
    /**.
     * <p>Sets the Y coordinate for the fax number</p>
     */
    private static final int FAX_Y = 120;
    /**.
     * <p>Sets the X coordinate for email</p>
     */
    private static final int EMAIL_X = 25;
    /**.
     * <p>Sets the Y coordinate for email</p>
     */
    private static final int EMAIL_Y = 140;
    
    /**.
     * <p>Sets the X coordinate for max windows size</p>
     */
    private static final int SIZE_X = 400;
    /**.
     * <p>Sets the Y coordinate for max window size</p>
     */
    private static final int SIZE_Y = 220;
    /**.
     * <p>Sets the X coordinate for image</p>
     */
    private static final int IMG_X = 200;
    /**.
     * <p>Sets the Y coordinate for image</p>
     */
    private static final int IMG_Y = 0;
    /**
     * <p>The default constructor which sets the title of this app, sets the
     * default close operation to exit, creates a new content pane and finally
     * sets size and sets the visibility of this frame to true (show).</p>
     */
    public BusinessCard() {
        super("Leon Ho");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new BusinessCardPanel());
        setSize(SIZE_X, SIZE_Y);
        setVisible(true);
    }

    /**
     * <p>A panel that acts as the Frame's content pane.</p>
     */
    class BusinessCardPanel extends JPanel {

        /**.
         * Setting Serial Version ID
         */
        private static final long serialVersionUID = 3627537743017520273L;
        /**
         * <p>An image object that can be used to paint to the panel.</p>
         */
        private Image img;

        /**
         * <p>The default contructor that retreives an image to draw.</p>
         */
        public BusinessCardPanel() {
            // NOTE: IF YOU ADD AN IMAGE YOU NEED TO LEAVE 'q5' IN THE STRING!
            img = new ImageIcon(BusinessCardPanel.class.getResource(
                "/q5/running-robot.gif")).getImage();
        }

        /**
         * <p>Called by the environment when the frame needs to be updated.</p>
         *
         * @param g the graphics context with which we paint into.
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBackground(new Color(BACK_R, BACK_G, BACK_B));
            g.setColor(new Color(PAGE_R, PAGE_G, PAGE_B));
            g.drawString("Leon Ho", NAME_X, NAME_Y);
            g.drawString("Robot Animation Studios", COMPANY_NAME_X,
                    COMPANY_NAME_Y);
            g.drawString("1111 Broadway Vancouver", COMPANY_ADDRESS_X,
                    COMPANY_ADDRESS_Y);
            g.drawString("Phone: 604 444 4444", PHONE_X, PHONE_Y);
            g.drawString("Fax: 604 444 4445", FAX_X, FAX_Y);
            g.drawString("Leon@robotanimators.com", EMAIL_X, EMAIL_Y);
            
            g.drawImage(img, IMG_X, IMG_Y, this);
        }
    }

    /**
     * <p>The main method. Calls to make a new BusinessCard object</p>
     * @param args arguments
     */
    public static void main(String[] args) {
        new BusinessCard();
    }

};
