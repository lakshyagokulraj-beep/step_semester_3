package class_problems;

import java.util.Scanner;

public class Course {
    String code;
    String title;
    int credits;
    int labCredits;

    public Course(String code, String title, int credits, int labCredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    public Course(String code, String title, int credits) {
        this(code, title, credits, 0);
    }

    public int totalCredits() {
        return credits + labCredits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] theoryInput = sc.nextLine().split(",\\s*");
        String[] labInput = sc.nextLine().split(",\\s*");

        Course theoryOnly = new Course(
                theoryInput[0], theoryInput[1], Integer.parseInt(theoryInput[2])
        );
        Course withLab = new Course(
                labInput[0], labInput[1], Integer.parseInt(labInput[2]), Integer.parseInt(labInput[3])
        );

        System.out.println(theoryOnly.code + " total credits: " + theoryOnly.totalCredits());
        System.out.println(withLab.code + " total credits: " + withLab.totalCredits());

        sc.close();
    }
}
