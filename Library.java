/**
 * Represents a library that holds and manages books.
 */
class Library {
    private final String name;
    private String location;

    /**
     * Constructs a Library with a given name and location.
     * 
     * @param name     The name of the library.
     * @param location The location of the library.
     */
    public Library(String name, String location) {
        this.name = name;
        this.location = location;
    }

    /**
     * Adds a new book to the library based on the given BookInfo.
     * 
     * @param info The BookInfo object containing book details.
     */
    public void addBook(BookInfo info) {
        Book book = new Book(info.title, info.author, info.year, info.price);
        System.out.println("Adding book to library: " + name);
        book.displayDetails();
    }
}