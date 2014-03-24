package q3;

/**
 * Represents a college student.
 * @author Leon Ho
 * @version 1
 */
public class Student {
    static final int TEST1 = 1;
    static final int TEST2 = 2;
    static final int TEST3 = 3;
    static final float NUMBEROFTESTS = 3.0f;
    /** First name of this student. */
    private String firstName;

    /** Last name of this student. */
    private String lastName;

    /** Home address of this student. */
    private Address homeAddress;

    /** School address of this student.  Can be shared by other students */
    private Address schoolAddress;

    private float testScore1;
    private float testScore2;
    private float testScore3;
    /**
    * Constructor: Sets up this student with the specified values.
    * @param first The first name of the student
    * @param last The last name of the student
    * @param home The home address of the student
    * @param school The school address of the student
    */
    public Student(String first, String last, Address home, Address school, float test1, float test2, float test3) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        testScore1 = test1;
        testScore2 = test2;
        testScore3 = test3;
    }
    public Student() {
        testScore1 = 0;
        testScore2 = 0;
        testScore3 = 0;
    }
    public void setTestScore(int score, int testNumber) {
        if (testNumber == TEST1) {
            testScore1 = score;
        } else if (testNumber == TEST2) {
            testScore2 = score;
        } else if (testNumber == TEST3) {
            testScore3 = score;
        }
    }
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
