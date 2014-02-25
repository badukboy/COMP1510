package submission;
import java.util.Scanner;
/**.
 * <p>This program allows for users to create student objects
 * that can hold up to two test scores and calculate their average</p>
 * @author Leon Ho A00879122 Set1b
 * @version 1.0
 */
public class Student {
   /**.
    * student is the name of the student
    */
    private String student;
    /**.
     * testScore1 is the score for the first test
     */
    private int testScore1;
    /**.
     * testScore2 is the score for the second test
     */
    private int testScore2;
    /**.
     * Setting up a new scanner class
     */
    private Scanner scan = new Scanner(System.in);
    /**.
     * This constructor sets up the variables 
     * <ul>
     *  <li>student </li>
     *  <li>testScore1</li>
     *  <li>testScore2</li>
     * </ul>
     * @param studentName gets the student name for the object
     */
    public Student(String studentName) {
        student = studentName;
        testScore1 = 0;
        testScore2 = 0;
    }
    /**.
     * <p>This method asks for the student's test score and saves
     * the input into testScore1, and testScore2</p>
     */
    public void inputGrades() {
        System.out.println("Please enter " + student + "'s first test score: ");
        testScore1 = scan.nextInt();
        System.out.println("Please enter " + student 
                + "'s second test score: ");
        testScore2 = scan.nextInt();
    }
    /**.
     * <p>This method calculates the average of the two inputed scores
     * by adding the two test scores together and dividing by two</p>
     * @return This returns the calculated average
     */
    public int getAverage() {
        int average = (testScore1 + testScore2) / 2;
        return average;
    }
    /**.
     * <p> This method simpily returns the student name</p>
     * @return This returns the student name
     */
    public String printName() {
        return student;
    }
    /**.
     * <p>This method outputs the object's name, and test score when the object
     * is asked to be printed</p>
     * @return Returns string: Student name, testScore1, and testScore2
     */
    public String toString() {
        return "Student name: \t" + student + "\nScore for test 1: \t"
               + testScore1 + "\nScore for test 2: \t" + testScore2;
    }
}


