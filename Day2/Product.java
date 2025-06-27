class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    Product(String name, double price) {
        this.productName = name;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}
