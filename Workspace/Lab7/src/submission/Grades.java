package submission;
import java.util.Scanner;
/**.
 * <p>This program grabs student scores, gives the averages, number of passes,
 * and number of fails. </p>
 * @author Leon Ho A00879122 Set1B
 * @version 1.0
 */
public class Grades {
    /**.
     * <p>This is the mark to be used when determining if students pass
     * or fail</p>
     */
    static final int FAILING_GRADE = 60;
    /**.
     * <p>This is the main program that does everything</p>
     * @param args not used
     */
    public static void main(String[] args) {
        double grade;
        double sumOfGrades;
        int numStudents;
        int numPass;
        int numFail;
        int holder;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nGrade Processing Program\n");
        // Initialize summing and counting variables
        sumOfGrades = 0;
        numStudents = 0;
        numPass = 0;
        numFail = 0;
        
        System.out.println("Enter the first student's grade: ");
        grade = scan.nextDouble();
        
        while (grade >= 0) {
            sumOfGrades += grade;
            numStudents += 1;
            
            holder = (grade < FAILING_GRADE) ? numFail++ : numPass++;
                 
            System.out.print("Enter the next grade (a negative to quit): ");
            grade = scan.nextDouble();
        }
        
        if (numStudents > 0) {
            System.out.println("\nGrade Summary: ");
            System.out.println("Class Average: " + sumOfGrades / numStudents);
            System.out.println("Number of Passing Grades: " + numPass);
            System.out.println("Number of Failing Grades: " + numFail);
        } else { 
            System.out.println("No grades processed.");
        }
    }
}
