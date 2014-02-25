package submission;
/**.
 * This class creates the Name object and has a couple of methods to be
 * run with it.
 * @author leonho
 * @version 1.0
 */
public class Name {
    /**.
     * FirstName
     */
    private final String fName;
    /**.
     * Middle name
     */
    private final String mName;
    /**.
     * Last Name
     */
    private final String lName;
    /**. 
    * This constructor sets up their first, middle and last name. 
    * @param first first name
    * @param middle middle name
    * @param last last name
    */
    public Name(String first, String middle, String last) {
        fName = first;
        mName = middle;
        lName = last;
    }
    /**.
     * This method returns the first name
     * @return first name
     */
    public String getFirst() {
        return fName;
    }
    /**.
     * This method returns the middle name
     * @return middle name
     */
    public String getMiddle() {
        return mName;
    }
    /**.
     * Thie returns the last name
     * @return last name
     */
    public String getLast() {
        return lName;
    }
    /**.
     * This method returns their first name, middle name then last name
     * @return first name middle name last name
     */
    public String firstMiddleLast() {
        return fName + " " + mName + " " + lName;
    }
   /**.
    * This method returns their last name, first name, then their middle name
    * @return Last name, first name, middle name
    */
    public String lastFirstMiddle() {
        return lName + ", " + fName + " " + mName;
    }
    /**.
     * This checks if two names are the same
     * @param otherName name to be compared with
     * @return true if same false if not same
     */
    public boolean equals(Name otherName) { 
        String inputName1 = fName + mName + lName;
        String inputName2 = otherName.fName + otherName.mName + otherName.lName;
        return inputName1.equalsIgnoreCase(inputName2);
    }
    /**.
     * Returns the inials of name
     * @return inials
     */
    public String initals() {
        return fName.substring(0, 1).toUpperCase() 
                + "." + mName.substring(0, 1).toUpperCase()
                + "." + lName.substring(0, 1).toUpperCase();
    }
    /**.
     * Returns the length of their name
     * @return length of name
     */
    public int length() {
        return fName.length() + mName.length() + lName.length();
    }
    /**.
     * Converts their name to string
     * @return returns firstname, middlename, lastname
     */
    public String toString() {
        return firstMiddleLast();
    }
}
