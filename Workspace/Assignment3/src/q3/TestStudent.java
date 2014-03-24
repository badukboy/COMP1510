package q3;
import java.util.Scanner;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class TestStudent {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    static final int TEST3 = 3;
    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("THIS CLASS DRIVES STUDENT\n");
        Student leon = new Student();
        System.out.println("Outputing empty student with default constructor" 
                + leon);
        leon = initalizeStudent();
        System.out.println("Now outputting the test scores using the getter");
        System.out.println("Score for test 1: " + leon.getTestScore(1));
        System.out.println("Score for test 2: " + leon.getTestScore(2));
        System.out.println("Score for test 3: " + leon.getTestScore(TEST3));
        System.out.println("Average test score: " + leon.average());
        System.out.println("Outputting using the toString method");
        System.out.println(leon);
        System.out.println("Setting all of the test scores to 0");
        leon.setTestScore(0, 1);
        leon.setTestScore(0, 2);
        leon.setTestScore(0, TEST3);
        System.out.println("Outputting again with the new information changed");
        System.out.println(leon);
    }
    static Student initalizeStudent() {
        String fName;
        String lName;
        Address hAddress = new Address();
        Address sAddress = new Address();
        float testScore1;
        float testScore2;
        float testScore3;

        System.out.println("What is the students first name");
        fName = scan.nextLine();
        System.out.println("What is the students last name");
        lName = scan.nextLine();
        System.out.println("Now setting home address");
        hAddress = initalizeAddress();
        System.out.println("Now setting the school address");
        sAddress = initalizeAddress();
        System.out.println("What is the score for the first test");
        testScore1 = scan.nextFloat();
        System.out.println("What is the score for the second test");
        testScore2 = scan.nextFloat();
        System.out.println("What is the score for the third test");
        testScore3 = scan.nextFloat();
        Student temp = new Student(fName, lName, hAddress, sAddress, testScore1, testScore2, testScore3);
        return temp; 
    }
    static Address initalizeAddress() {
        
        String streetAddress;
        String city;
        String state;
        String postalCode;
        System.out.println("What is street address");
        streetAddress = scan.nextLine();
        System.out.println("What is the city");
        city = scan.nextLine();
        System.out.println("What is the state");
        state = scan.nextLine();
        System.out.println("What is the postal code");
        postalCode = scan.nextLine();
        Address temp  = new Address(streetAddress, city, state, postalCode);
        return temp;
    }
};
