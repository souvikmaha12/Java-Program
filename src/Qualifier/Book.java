package Qualifier;
import java.util.*;
public class Book {

    private String bookId;
    private String bookName;
    private double pricePerUnit;
    private int quantity;

    // Constructor
    public Book(String bookId, String bookName, double pricePerUnit, int quantity) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    // Getters
    public String getBookId() {
        return bookId;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public int getQuantity() {
        return quantity;
    }
}