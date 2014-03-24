package q4;

import q3.Address;
import q3.Student;
import java.text.DecimalFormat;
import java.util.Random;
/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class TestCourse {
    static final int MAXSCORE = 100;
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        DecimalFormat fmt = new DecimalFormat("0.##");
        Random rand = new Random();
        // your code will go here!!!
        Address address = new Address("1111 Kingsway Ave", "Vancouver"
                , "BC" , "V5X 2C1");
        Student jerry = new Student("Jerry", "Chan", address, address
                , rand.nextInt(MAXSCORE) + 1
                , rand.nextInt(MAXSCORE) + 1
                , rand.nextInt(MAXSCORE) + 1);
        Student suzy = new Student("Suzy", "Smith", address, address
                , rand.nextInt(MAXSCORE) + 1
                , rand.nextInt(MAXSCORE) + 1
                , rand.nextInt(MAXSCORE) + 1);
        Student kary = new Student("Kary", "Mackenzie", address, address
                , rand.nextInt(MAXSCORE) + 1
                , rand.nextInt(MAXSCORE) + 1
                , rand.nextInt(MAXSCORE) + 1);
        Student kyle = new Student("Kyle", "Arrl", address, address
                , rand.nextInt(MAXSCORE) + 1
                , rand.nextInt(MAXSCORE) + 1
                , rand.nextInt(MAXSCORE) + 1);
        Course math = new Course("math");
        math.addStudent(jerry);
        math.addStudent(suzy);
        math.addStudent(kary);
        math.addStudent(kyle);
        System.out.println("Printing course roll");
        math.roll();
        System.out.println("The test score average is: " 
                + fmt.format(math.average()) + "%");
    }
};
