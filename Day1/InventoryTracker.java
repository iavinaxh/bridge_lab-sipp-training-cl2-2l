import java.util.Scanner;

class Item {
    int itemCode;
    String itemName;
    double price;

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class InventoryTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item item = new Item();
        System.out.print("Enter Item Code: ");
        item.itemCode = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Item Name: ");
        item.itemName = sc.nextLine();
        System.out.print("Enter Price: ");
        item.price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        item.displayDetails();
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " items: " + totalCost);
    }
}
