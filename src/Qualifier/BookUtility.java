package Qualifier;
import java.util.*;
public class BookUtility {

    public static boolean validateBookId(String bookId) throws InvalidBookIdException {

        // Length must be 7 (BOOK + 3 digits)
        if (bookId.length() != 7) {
            throw new InvalidBookIdException("Book Id " + bookId + " is not valid");
        }

        // Must start with BOOK
        if (!bookId.startsWith("BOOK")) {
            throw new InvalidBookIdException("Book Id " + bookId + " is not valid");
        }

        // Last 3 characters must be digits
        for (int i = 4; i < 7; i++) {
            char ch = bookId.charAt(i);
            if (ch < '0' || ch > '9') {
                throw new InvalidBookIdException("Book Id " + bookId + " is not valid");
            }
        }

        return true;
    }
}