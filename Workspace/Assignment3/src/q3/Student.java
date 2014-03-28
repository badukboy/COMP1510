package q3;

/**
 * Represents a college student.
 * @author Leon Ho
 * @version 1
 */
public class Student {
    /**.
     * <p>This constants stand for the test1</p>
     */
    static final int TEST1 = 1;
    /**.
     * <p>This constant stands for the second test</p>
     */
    static final int TEST2 = 2;
    /**.
     * <p>This constant stands for the third test</p>
     */
    static final int TEST3 = 3;
    /**.
     * <p>This constant stands for the total amount of tests there are</p>
     */
    static final float NUMBEROFTESTS = 3.0f;
    /** First name of this student. */
    private String firstName;

    /** Last name of this student. */
    private String lastName;

    /** Home address of this student. */
    private Address homeAddress;

    /** School address of this student.  Can be shared by other students */
    private Address schoolAddress;
    /**.
     * This is the score for the first test
     */
    private float testScore1;
    /**.
     * This is the score for the second test. 
     */
    private float testScore2;
    /**.
     * This is the score for the third test. 
     */
    private float testScore3;
    /**
    * Constructor: Sets up this student with the specified values.
    * @param first The first name of the student
    * @param last The last name of the student
    * @param home The home address of the student
    * @param school The school address of the student
    * @param test1 The score for test1
    * @param test2 The score for test2
    * @param test3 The score for test3
    */
    public Student(String first
            , String last
            , Address home
            , Address school
            , float test1
            , float test2
            , float test3) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        testScore1 = test1;
        testScore2 = test2;
        testScore3 = test3;
    }
    /**.
     * This constructor makes a new student and sets all of the
     * test scores to 0
     */
    public Student() {
        testScore1 = 0;
        testScore2 = 0;
        testScore3 = 0;
    }
    /**.
     * This method sets the score for a given test.
     * @param score The score to be given to the student.
     * @param testNumber The test number to be assigned.
     */
    public void setTestScore(float score, int testNumber) {
        if (testNumber == TEST1) {
            testScore1 = score;
        } else if (testNumber == TEST2) {
            testScore2 = score;
        } else if (testNumber == TEST3) {
            testScore3 = score;
        }
    }
    /**.
     * This method gets the score for the a given test.
     * @param testNumber The test to be taken from.
     * @return the test score.
     */
    public float getTestScore(float testNumber) {
        if (testNumber == TEST1) {
            return testScore1;
        } else if (testNumber == TEST2) {
            return testScore2;
        } else if (testNumber == TEST3) {
            return testScore3;
        }
        return 0;
    }
    /**.
     * This returns the average of all of the tests. 
     * @return the average
     */
    public float average() {
        float average = (testScore1 + testScore2 + testScore3) / NUMBEROFTESTS;
        return average;
    }
    /**
    * Returns a string description of this Student object.
    * @return formatted name and addresses of student
    */
    public String toString() {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "Test1 Score " + testScore1 + "\n";
        result += "Test2 Score " + testScore2 + "\n";
        result += "Test3 Score " + testScore3 + "\n";
        result += average() + "\n";
        return result;
    }
}
