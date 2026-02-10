package assignment.week2;

class BankAccount {

    
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    class Transaction {

        void deposit(double amount) {
            balance = balance + amount;   // accessing private variable
            System.out.println("Deposited: " + amount);
        }

        void withdraw(double amount) {
            if (amount <= balance) {
                balance = balance - amount;  
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }
}
public class Problem4 {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        BankAccount.Transaction transaction = account.new Transaction();

        account.showBalance();

        transaction.deposit(500);
        account.showBalance();

        transaction.withdraw(300);
        account.showBalance();

        transaction.withdraw(2000);
        account.showBalance();
    }
}
