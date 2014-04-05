package submission;
import java.util.Scanner;
public class TestWalk {
    public static void main (String[] args) {
        
        int maxSteps;
        int maxCoord;
        int x, y;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nRandom Walk Test Program");
        System.out.println();
          
        System.out.println("Enter the boundary for the square: ");
        maxCoord = scan.nextInt();
          
        System.out.println("Enter the maximum number of steps:");
        maxSteps = scan.nextInt();
           
        System.out.println("Enter the starting x and y coordingates with a"
                + "space between: ");
        x = scan.nextInt();
        y = scan.nextInt();
        //RandomWalk walk1 = new RandomWalk(10, 5, 0, 0);
        RandomWalk walk2 = new RandomWalk(maxSteps, maxCoord, x, y);
        while (walk2.moreSteps() && walk2.inBounds()) {
            walk2.takeStep();
            System.out.println(walk2);
            System.out.println(walk2.getMaxDistance());
        }
    }
}
