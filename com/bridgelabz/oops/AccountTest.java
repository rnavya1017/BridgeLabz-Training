import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Account Management System");
        System.out.println("Enter current balance: ");
        int balance = sc.nextInt();
        Account acc = new Account(balance);

        System.out.println("Current Balance: " +
                acc.getBalance());

        System.out.print("Enter debit amount: ");
        double amount = sc.nextDouble();

        acc.debit(amount);

        System.out.println("Remaining Balance: " +
                acc.getBalance());
    }
}