package submission;
import java.util.ArrayList;
import java.util.Scanner;
public class Shop {
    public static void main (String[] args) {
        Item item; 
        String itemName;
        double itemPrice;
        int quantity;
        int index = 0;
        double totalPrice = 0;
        ArrayList<Item> cart = new ArrayList<Item>();
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        String keepShopping = "y";
        
        do {
            keepShopping = "y";
            System.out.println ("Enter the name of the item: ");
            itemName = scan2.nextLine();
            System.out.println ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.println("Enter the quantity: ");
            quantity = scan.nextInt();
            item = new Item(itemName, itemPrice, quantity);
            cart.add(item);
            System.out.println ("Continue shopping (y/n) ?");
            keepShopping = scan.next();
        }
        while (keepShopping.equalsIgnoreCase("y"));  
        
        while (index < cart.size()) {
            System.out.println (cart.get(index));
            totalPrice = (cart.get(index).getPrice() *
                    cart.get(index).getQuantity()) + totalPrice;
            index++;
        }
        System.out.println("----------------------");
        System.out.println("Your total comes to: $" + totalPrice);
    }
}