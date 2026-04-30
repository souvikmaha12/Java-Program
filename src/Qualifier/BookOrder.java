package Qualifier;
import java.util.*;
public class BookOrder {

ArrayList<Book> bookList = new ArrayList<>();
    double discount;

    // Add books to list
    public void bookBooking(Book[] books) {
        for (Book b : books) {
            if (b != null) {
                bookList.add(b);
            }
        }
    }

    // Find discount based on payment method
    public void findDiscount(String paymentMethod) {

        if (paymentMethod.equalsIgnoreCase("CreditCard")) {
            discount = 20;
        } else if (paymentMethod.equalsIgnoreCase("DebitCard")) {
            discount = 15;
        } else if (paymentMethod.equalsIgnoreCase("NetBanking")) {
            discount = 10;
        } else {
            discount = 0;
        }
    }

    // Calculate final bill
    public double calculateTotalBill() {

        double total = 0;

        for (Book b : bookList) {
            total = total + (b.getPricePerUnit() * b.getQuantity());
        }

        return total - (total * discount / 100);
    }
}

