package assignment_problems;

import java.util.Scanner;

public class PayrollAccount {
    private double basicSalary;
    private double bonus;

    public PayrollAccount(double basicSalary) {
        if (basicSalary < 0) {
            System.out.println("Warning: negative basic salary; starting at 0");
            this.basicSalary = 0;
        } else {
            this.basicSalary = basicSalary;
        }
        this.bonus = 0;
    }

    public void creditBonus(double amount) {
        if (amount <= 0) {
            System.out.println("Bonus rejected: amount must be positive");
            return;
        }
        bonus += amount;
        System.out.println("Bonus credited: Rs " + amount);
    }

    public void deductTax(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Tax rejected: percent must be between 0 and 100");
            return;
        }
        basicSalary -= basicSalary * percent / 100;
        System.out.println("Tax deducted: " + percent + "%");
    }

    public double getNetSalary() {
        return basicSalary + bonus;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double basicSalary = sc.nextDouble();
        double bonus = sc.nextDouble();
        double tax = sc.nextDouble();

        PayrollAccount account = new PayrollAccount(basicSalary);
        account.creditBonus(bonus);
        account.deductTax(tax);
        System.out.println("Net salary: Rs " + account.getNetSalary());

        sc.close();
    }
}
