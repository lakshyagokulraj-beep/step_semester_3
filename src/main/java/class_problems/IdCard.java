package class_problems;

import java.util.Scanner;

public class IdCard {
    String name;
    int booksIssued;

    public IdCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int initialBooks = sc.nextInt();
        int updatedBooks = sc.nextInt();

        IdCard ravi = new IdCard(name, initialBooks);
        IdCard duplicate = ravi;
        duplicate.booksIssued = updatedBooks;
        IdCard separate = new IdCard(name, updatedBooks);

        System.out.println("Ravi's booksIssued (via first variable): " + ravi.booksIssued);
        System.out.println("duplicate == ravi: " + (duplicate == ravi));
        System.out.println("separate == ravi: " + (separate == ravi));

        sc.close();
    }
}
