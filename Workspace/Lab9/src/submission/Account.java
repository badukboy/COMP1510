package submission;
import java.util.Random;
public class Account {
    private double balance;
    private String name;
    private long acctNum;
    static Random gen = new Random();
    private static int numAccounts = 0;
    public Account (double initBal, String owner, long number) {
        balance = initBal;
        name = owner;
        acctNum = number;
        numAccounts++;
    }
    public Account (double initBal, String owner) {
        balance = initBal;
        name = owner;
        acctNum = gen.nextLong();
        numAccounts++;
    }
    public Account (String owner) {
        name = owner;
        balance = 0;
        acctNum = gen.nextLong();
        numAccounts++;
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    public void withdraw(double amount, double fee) {
        balance -= amount + fee;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public double getBalance() {
        return balance;
    }
    
    public String toString() {
        return "Name: " + name + 
                "\nAccount Number: " + acctNum +
                "\nBalance: " + balance;
    }
    public static int getNumAccounts() {
        return numAccounts;
    }
    public void close() {
        name = "CLOSED";
        balance = 0;
        numAccounts--;
    }
    
    public static Account consolidate(Account acct1, Account acct2) {
        Account newAcct;
        if ((acct1.acctNum != acct2.acctNum) && acct1.name == acct2.name) {
        newAcct = new Account(acct1.balance + acct2.balance, 
                acct1.name);
        } else {
            newAcct = null;
            System.out.println("Error the two accounts don't" 
                    + "have the same name or have the same ID");
        }
        
        return newAcct;
    }
}
