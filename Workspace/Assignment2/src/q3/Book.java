package q3;
/**.
 * <p> This class creates books that will be read
 * by the book shelf class. </p>
 * 
 * @author Leon Ho
 * @version 1.0
 */
public class Book {
    /**.
     * <p>Title of the book</p>
     */
    private String title;
    /**.
     * <p>Author of the book</p>
     */
    private String author;
    /**.
     * <p>Publisher of the book</p>
     */
    private String publisher;
    /**.
     * <p>Copyright date of the book</p>
     */
    private String copyDate;
    /**.
     * <p>This constructor is empty just to create the object.</p>
     */
    public Book() {
    }
    /**.
     * <p>This constructor creates the book with the 
     * parameters to set what the book is. </p>
     * @param title2 Title of the book to be put into object
     * @param author2 Author of the book to be put into object
     * @param publisher2 Publisher of the book to be put into object
     * @param copyDate2 copyright date to be put into the object
     */
    public Book(String title2, String author2, 
            String publisher2, String copyDate2) {
        title = title2;
        author = author2;
        publisher = publisher2;
        copyDate = copyDate2;
    }
    /**.
     * <p>This method sets the title of the book</p>
     * @param title2 This is the title to be set to. 
     */
    public void setTitle(String title2) {
        title = title2;
    }
    /**.
     * <p>This returns the title of the book</p>
     * @return title of book
     */
    public String getTitle() {
        return title;
    }
    /**.
     * <p>This method sets the author of the book</p>
     * @param author2 author name to be set
     */
    public void setAuthor(String author2) {
        author = author2;
    }
    /**.
     * <p>This method gets the author of the book</p>
     * @return the author
     */
    public String getAuthor() {
        return author;
    }
    /**.
     * <p>This sets the publisher of the book</p>
     * @param publisher2 name of publisher to be set
     */
    public void setPublisher(String publisher2) {
        publisher = publisher2;
    }
    /**.
     * <p>This gets the published of the book</p>
     * @return publisher of book
     */
    public String getPublisher() { 
        return publisher;
    }
    /**.
     * <p>This sets the copy right date of the book</p>
     * @param copyDate2 Copy right date of book
     */
    public void setCopyDate(String copyDate2) {
        copyDate = copyDate2;
    }
    /**.
     * <p>This gets the copyright date of the book</p>
     * @return copy right date to be returned
     */
    public String getCopyDate() {
        return copyDate;
    }
    /**.
     * <p>This out puts all of the info inside of the book
     * when called </p>
     * @return All info about book
     */
    public String toString() {
        return "Book name: " + title
                + "\nAuthor: " + author
                + "\nPublisher: " + publisher
                + "\nCopyright Date: " + copyDate;
    }
}
