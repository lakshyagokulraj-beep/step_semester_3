package class_problems;

import java.util.Scanner;

public class PlacementRecord {
    String studentName;
    String company;
    double packageLpa;

    public PlacementRecord(String studentName, String company, double packageLpa) {
        this.studentName = studentName;
        this.company = company;
        this.packageLpa = packageLpa;
    }

    void printRecord() {
        System.out.println(studentName + " -> " + company + " @ " + packageLpa + " LPA");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlacementRecord[] records = new PlacementRecord[3];

        for (int i = 0; i < records.length; i++) {
            String[] input = sc.nextLine().split(",\\s*");
            records[i] = new PlacementRecord(input[0], input[1], Double.parseDouble(input[2]));
        }

        for (PlacementRecord record : records) {
            record.printRecord();
        }
        sc.close();
    }
}
