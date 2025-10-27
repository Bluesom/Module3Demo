/**
 * Represents book information used when adding a book to the library.
 */
class BookInfo {
    String title;
    String author;
    int year;
    double price;

    /**
     * Constructs a BookInfo object with the given details.
     * 
     * @param title  The book title.
     * @param author The book author.
     * @param year   The publication year.
     * @param price  The book price.
     */
    public BookInfo(String title, String author, int year, double price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }
}