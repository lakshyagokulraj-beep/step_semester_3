package assignment_problems;

import java.util.Scanner;

public class HallTicket {
    String studentName;
    int seatNumber;

    public HallTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String studentName = sc.next();
        int initialSeatNumber = sc.nextInt();
        int updatedSeatNumber = sc.nextInt();

        HallTicket priya = new HallTicket(studentName, initialSeatNumber);
        HallTicket copy = priya;
        copy.seatNumber = updatedSeatNumber;
        HallTicket separate = new HallTicket(studentName, updatedSeatNumber);

        System.out.println("Priya's seatNumber (via first variable):");
        System.out.println(priya.seatNumber);
        System.out.println("copy == priya: " + (copy == priya));
        System.out.println("separate == priya: " + (separate == priya));

        sc.close();
    }
}
