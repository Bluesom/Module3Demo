/**
 * Abstract base class representing a general item in the library.
 * Other items (like books, magazines) can extend this class.
 */
abstract class Item {
    protected String title;
    protected double price;

    /**
     * Constructs an Item with a title and price.
     * 
     * @param title The title of the item.
     * @param price The price of the item.
     */
    public Item(String title, double price) {
        this.title = title;
        this.price = price;
    }

    /**
     * Displays the details of the item.
     * This method must be implemented by subclasses.
     */
    public abstract void displayDetails();
}
