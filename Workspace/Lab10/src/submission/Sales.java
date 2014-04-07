package submission;
import java.util.Scanner;
public class Sales {
    public static void main(String[] args) {
        final int SALESPEOPLE = 5;
        int[] sales = new int[SALESPEOPLE];
        int sum;
        int highestID = 0;
        int highestSum = 0;
        int lowestSum = 999999999;
        int lowestID = 0;
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<sales.length; i++) {
            System.out.print("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum= 0;
        for (int i=0; i<sales.length; i++) {
            System.out.println("     " + i + "    " + sales[i]);
            sum +=sales[i];
            if (sales[i] > highestSum) {
                highestSum = sales[i];
                highestID = i;
            }
            if(sales[i] <lowestSum) {
                lowestSum = sales[i];
                lowestID = i;
            }
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("Average: " + sum/SALESPEOPLE);
        System.out.println("Salesperson " + highestID + " had the higest sale with "
                + "$" + highestSum);
        System.out.println("Salesperson " + lowestID + " had the higest sale with "
                + "$" + lowestSum);
    }
}
