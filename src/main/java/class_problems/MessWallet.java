package class_problems;

import java.util.Scanner;

public class MessWallet {
    private double balance;

    public MessWallet(double balance) {
        if (balance < 0) {
            System.out.println("Warning: negative opening balance; starting at 0");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public void topUp(double amount) {
        if (amount <= 0) {
            System.out.println("Top-up rejected: amount must be positive");
            return;
        }
        balance += amount;
        System.out.println("Balance after top-up: " + balance);
    }

    public void deduct(double amount) {
        if (amount > balance) {
            System.out.println("Deduct rejected: insufficient balance");
            return;
        }
        if (amount <= 0) {
            System.out.println("Deduct rejected: amount must be positive");
            return;
        }
        balance -= amount;
        System.out.println("Balance after deduction: " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double opening = sc.nextDouble();
        double topUpAmount = sc.nextDouble();
        double deductAmount = sc.nextDouble();

        MessWallet wallet = new MessWallet(opening);
        wallet.topUp(topUpAmount);
        wallet.deduct(deductAmount);
        System.out.println("Final balance: " + wallet.getBalance());

        sc.close();
    }
}
