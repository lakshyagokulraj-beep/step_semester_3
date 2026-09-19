package class_problems;

import java.util.Scanner;

public class Student {
    String name;
    double attendance;
    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount = 0;

    public Student(String name, double attendance) {
        this.name = name;
        this.attendance = attendance;
        studentCount++;
    }

    static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = sc.next();
        double firstAttendance = sc.nextDouble();
        String secondName = sc.next();
        double secondAttendance = sc.nextDouble();

        Student first = new Student(firstName, firstAttendance);
        Student second = new Student(secondName, secondAttendance);

        System.out.println("2 Student objects created");
        Student.printCollegeInfo();

        sc.close();
    }
}
