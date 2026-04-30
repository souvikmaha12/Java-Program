package Qualifier;

import java.util.Scanner;

public class BookHavenMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of books needed");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[n];
        int count = 0;

        System.out.println("Enter the Book details");

        for (int i = 0; i < n; i++) {

            String input = sc.nextLine();
            String[] data = input.split(":");

            try {
                BookUtility.validateBookId(data[0]);

                books[count] = new Book(
                        data[0],
                        data[1],
                        Double.parseDouble(data[2]),
                        Integer.parseInt(data[3])
                );
                count++;

            } catch (InvalidBookIdException e) {
                System.out.println(e.getMessage());
            }
        }

        if (count == 0) {
            System.out.println("Your booking is empty");
            return;
        }

        System.out.println("Enter the payment method");
        String paymentMethod = sc.nextLine();

        BookOrder order = new BookOrder();
        order.bookBooking(books);
        order.findDiscount(paymentMethod);

        double bill = order.calculateTotalBill();
        System.out.printf("Total Bill Amount: %.2f", bill);
    }
}