package B1;
import java.util.Scanner;

public class TestCodeBankAccInputs {
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        BankAccount myAccount = new BankAccount(100, "Bank of America Checking");
        System.out.print("Enter a amount: ");
        double newDeposit = inStream.nextDouble();
        myAccount.deposit(newDeposit);

        System.out.printf("%s has %9.2f", myAccount.displayName(), myAccount.getBalance());
        //System.out.printf("%3s", "abc");
    }

    static class BankAccount {

        private double balance;
        private String name;

        public BankAccount(double balance, String name) {
            this.balance = balance;
            this.name = name;
        }

        public String displayName() {
            return name;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double newDeposit) {
            this.balance += newDeposit;
        }
    }
}