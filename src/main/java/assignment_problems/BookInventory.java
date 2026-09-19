package assignment_problems;

import java.util.Scanner;

public class BookInventory {
    String title;
    String author;
    int copiesAvailable;

    public BookInventory(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    void printEntry() {
        System.out.println(title + " by " + author + " - " + copiesAvailable + " copies available");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookInventory[] books = new BookInventory[4];

        for (int i = 0; i < books.length; i++) {
            String[] input = sc.nextLine().split(",\\s*");
            books[i] = new BookInventory(input[0], input[1], Integer.parseInt(input[2]));
        }

        for (BookInventory book : books) {
            book.printEntry();
        }
        sc.close();
    }
}
