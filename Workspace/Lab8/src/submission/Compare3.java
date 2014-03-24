package submission;

/**.
 * This class compares the length of three 
 * strings and returns the longest.
 * @author Leon
 * @version 1.0
 */
public class Compare3 {
    /**.
     * This method compares three different Comparable 
     * parameters and returns the largest lexicographically
     * @param input1 input1
     * @param input2 input2
     * @param input3 input3
     * @return the largest
     */
    static Comparable largest(Comparable input1, 
            Comparable input2, 
            Comparable input3) {
        
        Comparable largest = input3;
        if (input1.compareTo(input2) >= 0 
                && input1.compareTo(input3) >= 0) {
            largest = input1;
        } 
        if (input2.compareTo(input1) >= 0 
                && input2.compareTo(input3) >= 0) {
            largest = input2;
        }
        return largest;
    }
}
