import java.util.Scanner;

interface Product {
    void addProduct(String name, double price);
}

interface Cart {
    void displayCart();
}

class OnlineStore implements Product, Cart {
    private String productName;
    private double productPrice;

    @Override
    public void addProduct(String name, double price) {
        this.productName = name;
        this.productPrice = price;
        System.out.println("Product Added: " + name);
    }

    @Override
    public void displayCart() {
        System.out.printf("Cart: %s - $%.2f%n", productName, productPrice);
    }
}

public class Interface_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OnlineStore store = new OnlineStore();
        
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();
        
        store.addProduct(name, price);
        store.displayCart();
        
        sc.close(); // Close the scanner to prevent resource leaks
    }
}