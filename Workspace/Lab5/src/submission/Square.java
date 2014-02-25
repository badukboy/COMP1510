package submission;
import java.awt.*;
import java.util.Random;
import java.awt.Graphics;

/**.
 * THis class creates random squares and has a method to 
 * print them out.
 * @author Leon
 * @version 1.0
 */
public class Square{
    /**.
     * Sets the size of the square
     */
    private int size;
    /**.
     * Sets the x coordinate of the square
     */
    private int x;
    /**.
     * Sets the y coordinate of the square
     */
    private int y;
    /**.
     * A new Color object to be defined later
     */
    private Color color;
    /**.
     * Maximum value for each RGB value
     */
    private final int maxRGB = 256;
    /**.
     * The maximum position for each square
     */
    private final int xyMax = 601;
    /**.
     * The maximum size for each square
     */
    private final int sizeMax = 101;
    /**.
     * The minimum size for each square
     */
    private final int sizeMin = 100;
    /**.
     * Creating generator for random
     */
    private static Random generator = new Random();
    /**.
     * Creates square given
     */
    public Square() {
        color = new Color(generator.nextInt(maxRGB), 
                generator.nextInt(maxRGB), generator.nextInt(maxRGB));
        x = generator.nextInt(xyMax);
        y = generator.nextInt(xyMax);
        size = generator.nextInt(sizeMax) + sizeMin;
    }
    /**.
     * Paints the square to the inputed page.
     * @param page Graphics page to printed onto. 
     */
    public void draw(Graphics page) {
        page.setColor(color);
        page.drawRect(x, y, size, size);
    }
}
