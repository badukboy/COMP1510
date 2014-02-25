package q4;
/**.
 * <p>This class creates box</p> 
 * @author Leon Ho
 * @version 1.0
 */
public class Box {
    /**.
     * <p>Initializing the height of the box</p>
     */
    private int height;
    /**.
     * <p>Initializing the depth of the box</p>
     */
    private int depth; 
    /**.
     * <p>Initializing the width of the box</p>
     */
    private int width;
    /**.
     * Initializing if the box is full
     */
    private boolean full;
    /**.
     * <p>This constructor sets the height width and depth 
     * of the box.</p>
     * @param height2 height to be entered
     * @param width2 width to be entered
     * @param depth2 depth to be entered
     */
    public Box(int height2, int width2, int depth2) {
        height = height2;
        width = width2;
        depth = depth2;
        full = false;
    }
    /**.
     * <p>This constructor defaults all values to 0
     * if no parameters are entered.</p> 
     * 
     */
    public Box() {
        height = 0;
        width = 0;
        depth = 0;
        full = false;
    }
    /**.
     * <p>This sets if the box is full or not.</p> 
     * @param full2 boolean value to be set
     */
    public void setFull(Boolean full2) {
        full = full2;
    }
    /**.
     * <p>This gets if the box is full or not and returns it</p>
     * @return returns if the value is full in boolean format
     */
    public boolean getFull() {
        return full;
    }
    /**.
     * <p>This sets the height of the box</p>
     * @param height2 This paramater sets the height
     */
    public void setHeight(int height2) {
        height = height2;
    }
    /**.
     * <p>When this method is called it will return the height of the object</p>
     * @return height of the object
     */
    public int getHeight() {
        return height;
    }
    /**.
     * <p>This sets the width of the box </p>
     * @param width2 This is the parameter that will set the height
     */
    public void setWidth(int width2) {
        width = width2;
    }
    /**.
     * <p>This gets the height of the object and returns it.</p>
     * @return widht of box.0
     */
    public int getWidth() {
        return width;
    }
   /**.
    * <p>This sets the depth of the box</p>
    * @param depth2 The depth to be set 
    */
    public void setDepth(int depth2) {
        depth = depth2;
    }
    /**.
     * This gets the depth of the box
     * @return depth of box
     */
    public int getDepth() {
    return depth;
    }
    /**.
     * Returns box values in strong format.
     * @return The boxs value
     */
    public String toString() {
        return "Width: " + width
                + "\nHeight: " + height
                + "\nDepth: " + depth
                + "\nFull: " + full;
    }
}
