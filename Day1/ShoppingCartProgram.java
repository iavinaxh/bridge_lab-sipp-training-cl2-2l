import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
    }

    void removeItem() {
        itemName = null;
        price = 0;
        quantity = 0;
    }

    void displayTotalCost() {
        if (itemName == null) {
            System.out.println("Cart is empty.");
        } else {
            double total = price * quantity;
            System.out.println("Item: " + itemName);
            System.out.println("Quantity: " + quantity);
            System.out.println("Price per item: " + price);
            System.out.println("Total Cost: " + total);
        }
    }
}

public class ShoppingCartProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CartItem item = new CartItem();

        System.out.print("Enter item name: ");
        String name = sc.nextLine();
        System.out.print("Enter item price: ");
        double price = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        item.addItem(name, price, quantity);
        item.displayTotalCost();

        item.removeItem();
        item.displayTotalCost();
    }
}
