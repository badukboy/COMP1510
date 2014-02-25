package q4;

/**.
 * <p>This drives the box class and tests all of its functionality</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class BoxTest {
    /**.
     * Setting the dimensions of Box1
     */
    private static final int BOX_1_DIMENSION = 5;
    /**.
     * Setting the dimensions of Box2
     */
    private static final int BOX_2_DIMENSION = 10;
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */

    public static void main(String[] args) {
        Box box1 = new Box(BOX_1_DIMENSION, BOX_1_DIMENSION, BOX_1_DIMENSION);
        Box box2 = new Box();
        box2.setHeight(BOX_2_DIMENSION);
        box2.setDepth(BOX_2_DIMENSION);
        box2.setWidth(BOX_2_DIMENSION);
        box2.setFull(true);
        box1.setFull(true);
        System.out.println("Info about box1: ");
        System.out.println(box1);
        System.out.println("\nInfo about box2: ");
        System.out.println("Box2 width: " + box2.getWidth()
                + "\nBox2 Height: " + box2.getHeight() 
                + "\nBox2 Depth: " + box2.getDepth()
                + "\nBox2 Full: " + box2.getFull());
    }

};
