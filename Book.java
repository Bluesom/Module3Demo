/**
 * Represents a specific type of Item: a Book.
 * Inherits from the abstract class Item.
 */
class Book extends Item {
    private final String author;
    private final int year;
    private static final double DISCOUNT_RATE = 0.1; // Constant discount rate (10%)

    /**
     * Constructs a Book object.
     * 
     * @param title  The title of the book.
     * @param author The author of the book.
     * @param year   The publication year of the book.
     * @param price  The price of the book.
     */
    public Book(String title, String author, int year, double price) {
        super(title, price);
        this.author = author;
        this.year = year;
    }

    /**
     * Calculates the price of the book after discount.
     * 
     * @return The discounted price.
     */
    public double calculateDiscountedPrice() {
        return price - (price * DISCOUNT_RATE);
    }

    /**
     * Displays detailed information about the book.
     * Includes title, author, year, price, and discounted price.
     */
    @Override
    public void displayDetails() {
        System.out.println("Title            : " + title);
        System.out.println("Author           : " + author);
        System.out.println("Year             : " + year);
        System.out.println("Price            : $" + price);
        System.out.println("Discounted Price : $" + calculateDiscountedPrice());
    }
}