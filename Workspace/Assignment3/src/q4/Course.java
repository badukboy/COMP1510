package q4;
import q3.Address;
import q3.Student;

import java.util.ArrayList;
public class Course {
    private String courseName;
    private ArrayList<Student> students = new ArrayList<Student>();
    public Course(String name) {
        courseName = name;
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void roll() {
        for (Student x : students) {
            System.out.println(x);
        }
    }
    public double average() {
        float average = 0;
        int totalStudents = 0;
        for(Student x : students) {
            average += x.average();
            totalStudents++;
        }
        return average / totalStudents;
    }
}
