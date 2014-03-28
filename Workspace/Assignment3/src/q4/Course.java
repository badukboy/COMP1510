package q4;
import q3.Student;

import java.util.ArrayList;
/**.
 * This class makes courses that can be filled with students
 * 
 * @author Leon
 * @version 1.0
 */
public class Course {
    /**.
     * This is the course name
     */
    private String courseName;
    /**.
     * This array lists holds all of the student objects 
     * that belonds to a course. 
     */
    private ArrayList<Student> students = new ArrayList<Student>();
    /**.
     * This constructor allows to set a course name without 
     * giving it any students
     * @param name The name of the course.
     */
    public Course(String name) {
        courseName = name;
    }
    /**.
     * This method allows you to add a student
     * @param student the student to add
     */
    public void addStudent(Student student) {
        students.add(student);
    }
    /**.
     * This method prints out all of the students 
     * in the the array list.
     */
    public void roll() {
        for (Student x : students) {
            System.out.println(x);
        }
    }
    /**.
     * This outputs the average of all of the students.
     * @return average
     */
    public double average() {
        float average = 0;
        int totalStudents = 0;
        for (Student x : students) {
            average += x.average();
            totalStudents++;
        }
        return average / totalStudents;
    }
    /**.
     * This outputs the name of the course.
     * @return name of course
     */
    public String getName() {
        return courseName;
    }
}
