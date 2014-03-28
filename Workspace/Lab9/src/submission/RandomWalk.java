package submission;
import java.util.Random;
public class RandomWalk {
    static final int UP = 0;
    static final int LEFT = 1;
    static final int RIGHT = 2;
    static final int DOWN = 3;
    static final int POSSIBLE_DIRECTIONS = 4;
    private static Random gen = new Random();

    private int maxSteps;    
    private int currentX;
    private int currentY;
    private int totalSteps;
    private int boundry;

    public RandomWalk(int max, int edge) {
        maxSteps = max;
        boundry = edge;
        currentX = 0;
        currentY = 0;
    }
    public RandomWalk(int max, int edge, int startX, int startY) {
        maxSteps = max;
        boundry = edge;
        currentX = startX;
        currentY = startY;
    }
    public String toString() {
        return "Steps:" + totalSteps
                + "\nPosition: (" + currentX + "," + currentY + ")";
    }
    public void takeStep() {
        int direction = gen.nextInt(POSSIBLE_DIRECTIONS);
        switch(direction) {
        case UP: 
            currentY++;
            totalSteps++;
            break;
        case LEFT:
            currentX--;
            totalSteps++;
            break;
        case RIGHT:
            currentX++;
            totalSteps++;
            break;
        case DOWN:
            currentY--;
            totalSteps++;
            break;
            
        }
    }
    public boolean moreSteps() {
        if (totalSteps < maxSteps) {
            return true;
        } else {
            return false;
        }
    }
    public boolean inBounds() {
        if(currentX > boundry 
                || currentX < -boundry
                || currentY > boundry
                || currentY < -boundry) {
            return false;
        } else {
            return true;
        }
    }
    public void walk() {
        while (inBounds() && moreSteps()) {
            takeStep();
        }
    }
}
