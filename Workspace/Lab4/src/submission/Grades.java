package submission;
/**.
 * <p>This program runs student.java and lets your make students 
 * and set test scores</p>
 * @author leonho A00879122 Set1B
 * @version 1.0
 */
public class Grades {
    /**.
     * <p>This class asks sets up two students and asks the user 
     * what their score is.</p>
     * @param args arguments
     */
    public static void main(String[] args) {
        Student student1 = new Student("Mary");
        Student student2 = new Student("Mike");
        student1.inputGrades();
        System.out.println(student1.printName() + "'s average is " 
                + student1.getAverage());
        System.out.println();
        student2.inputGrades();
        System.out.println(student2.printName() + "'s average is " 
                + student2.getAverage());
        System.out.println("Student 1:\n" + student1);
    }
}
