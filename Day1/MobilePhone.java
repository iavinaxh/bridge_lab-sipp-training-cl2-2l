import java.util.Scanner;

class MobilePhones {
    String brand;
    String model;
    double price;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }
}

public class MobilePhone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MobilePhones phone = new MobilePhones();
        System.out.print("Enter Brand: ");
        phone.brand = sc.nextLine();
        System.out.print("Enter Model: ");
        phone.model = sc.nextLine();
        System.out.print("Enter Price: ");
        phone.price = sc.nextDouble();

        System.out.println("\nMobile Phone Details:");
        phone.displayDetails();

        sc.close(); // Best practice: closing the scanner
    }
}