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
     * Title of the book
     */
    private String title;
    /**.
     * Author of the book
     */
    private String author;
    /**.
     * Publisher of the book
     */
    private String publisher;
    /**.
     * Copyright date of the book
     */
    private String copyDate;
    /**.
     * <p>This constructor is empty just to create the object.
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
     * This method sets the title of the book
     * @param title2 This is the title to be set to. 
     */
    public void setTitle(String title2) {
        title = title2;
    }
    /**.
     * This returns the title of the book
     * @return title of book
     */
    public String getTitle() {
        return title;
    }
    /**.
     * This method sets the author of the book
     * @param author2 author name to be set
     */
    public void setAuthor(String author2) {
        author = author2;
    }
    /**.
     * This method gets the author of the book
     * @return the author
     */
    public String getAuthor() {
        return author;
    }
    /**.
     * This sets the publisher of the book
     * @param publisher2 name of publisher to be set
     */
    public void setPublisher(String publisher2) {
        publisher = publisher2;
    }
    /**.
     * This gets the published of the book
     * @return publisher of book
     */
    public String getPublisher() { 
        return publisher;
    }
    /**.
     * This sets the copy right date of the book
     * @param copyDate2 Copy right date of book
     */
    public void setCopyDate(String copyDate2) {
        copyDate = copyDate2;
    }
    /**.
     * This gets the copyright date of the book
     * @return copy right date to be returned
     */
    public String getCopyDate() {
        return copyDate;
    }
    /**.
     * This out puts all of the info inside of the book
     * when called 
     * @return All info about book
     */
    public String toString() {
        return "Book name: " + title
                + "\nAuthor: " + author
                + "\nPublisher: " + publisher
                + "\nCopyright Date: " + copyDate;
    }
}
