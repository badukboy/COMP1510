package submission;
import java.util.Scanner;
public class TestWalk {
    public static void main (String[] args) {
        int stepsToTake = 5;
        int maxSteps;
        int maxCoord;
        int x;
        int y;
        Scanner scan = new Scanner(System.in);
        /*System.out.println("\nRandom Walk Test Program\n"
                + "Enter the boundary for the square");
        maxCoord = scan.nextInt();
        System.out.println("Enter the maximum number of steps: ");
        maxSteps = scan.nextInt();
        
        System.out.print("Enter the starting x and y coordinates with "
                + "a space between: ");
        x = scan.nextInt();
        y = scan.nextInt();*/
        //RandomWalk walk1 = new RandomWalk(maxCoord, maxSteps, x, y);
        RandomWalk walk1 = new RandomWalk(200, 50, 0, 0);
        walk1.walk();
        System.out.println(walk1);
        /*RandomWalk walk2 = new RandomWalk(5, 10, 0, 0);
        System.out.println(walk1 + "\n" + walk2);
        for (int i = 0; i < stepsToTake; i++) {
            walk1.takeStep();
            System.out.println(walk1);
        }*/
    }
}
