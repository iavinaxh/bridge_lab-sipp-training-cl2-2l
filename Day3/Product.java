class Product {
    static double discount = 10.0;
    final int productID;
    String productName;
    double price;
    int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayProduct(Object obj) {
        if (obj instanceof Product) {
            System.out.println("Product ID: " + productID + ", Name: " + productName + ", Price: " + price + ", Quantity: " + quantity + ", Discount: " + discount + "%");
        }
    }
}
