package submission;

public class RandomWalk {
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
    
}
