package q3;

/**
 * <p>This is the program that drives the book class
 * It will create a couple of books, then insert data 
 * into each one. Afterwards it will drive each method 
 * inside of the book class.</p>
 *
 * @author Leon Ho
 * @version 1.0
 */
public class Bookshelf {
    
    /**.
     * <p>Calling the books itself</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Book book1;
        Book book2;
        book1 = new Book();
        book2 = new Book("One Second After", "William R. Forstchen"
                , "Tom Doherty Associates", "March 17 2009");
        book1.setTitle("Harry Potter");
        book1.setAuthor("J.K Rowling");
        book1.setPublisher("Bloomsbury Publishing");
        book1.setCopyDate("June 29 1997");
        System.out.println("The first book");
        System.out.println("\nTitle: " + book1.getTitle()
                + "\nAuthor: " + book1.getAuthor() 
                + "\nPublisher: " + book1.getPublisher() 
                + "\nCopyright Date: " + book1.getCopyDate());
        System.out.println("\nThe Second book");
        System.out.println("\n" + book2);
    }
};
