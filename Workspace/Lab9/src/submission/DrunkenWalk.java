package submission;
import java.util.Scanner;
public class DrunkenWalk {
    public static void main(String[] args) {
        int maxSteps;
        int boundry;
        int timesToTest;
        int fallen = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Drunken Walk tester"
                + "\n Please enter the max steps");
        maxSteps = scan.nextInt();
        System.out.println("Please enter the boundry of the platform");
        boundry = scan.nextInt();
        System.out.println("Please enter the amount of times to test");
        timesToTest = scan.nextInt();
        for (int i = 0; i < timesToTest; i++) {
            RandomWalk walk = new RandomWalk(maxSteps, boundry);
            walk.walk();
            if(!walk.inBounds())
                fallen++;
        }
        System.out.println("Number of times fallen:"
                + "\n" + fallen);
       
    }
}
