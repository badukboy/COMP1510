package submission;
import java.util.Scanner;
public class TestAccounts1 {
    public static void main(String[] args) {
        Account testAcct1 = new Account(100, "Leon"); 
        Account testAcct2 = new Account(50, "Leon");
        Account testAcct3 = new Account(100000, "Jerry");
        Account newAcct;
        System.out.println("I currently have 3 accounts");
        System.out.println(testAcct1 + "\n\n" + testAcct2 + "\n\n" + testAcct3);
        System.out.println("I am now consolidating the first two");
        newAcct = Account.consolidate(testAcct1, testAcct2);
        System.out.println(newAcct);
    }
}
