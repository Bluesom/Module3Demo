/**
 * Main class that demonstrates library and book management.
 * It creates a Library object and adds a Book to it.
 * 
 * @author Ganezh
 * @version 1.0
 * @since 2025-10-27
 */
public class Main {
    /**
     * Entry point of the application.
     * Creates a Library and adds a BookInfo object to it.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Library lib = new Library("City Library", "Downtown");
        BookInfo info = new BookInfo("The Great Gatsby", "F. Scott Fitzgerald", 1925, 20.0);

        lib.addBook(info);
    }
}