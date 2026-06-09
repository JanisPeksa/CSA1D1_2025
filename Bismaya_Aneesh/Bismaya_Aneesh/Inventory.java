import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {

    ArrayList<Product> list = new ArrayList<>();

    // Add a product
    public void addProduct(Scanner input) {
        System.out.print("Enter ID: ");
        String id = input.nextLine();

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = input.nextInt();
        input.nextLine();

        System.out.print("Enter Price: ");
        double price = input.nextDouble();
        input.nextLine();

        Product p = new Product(id, name, quantity, price);
        list.add(p);
        System.out.println("Product added!");
    }

    // Remove a product
    public void removeProduct(Scanner input) {
        System.out.print("Enter ID to remove: ");
        String id = input.nextLine();

        Product toRemove = null;
        for (Product p : list) {
            if (p.id.equals(id)) {
                toRemove = p;
                break;
            }
        }

        if (toRemove != null) {
            list.remove(toRemove);
            System.out.println("Product removed!");
        } else {
            System.out.println("Product not found!");
        }
    }

    // Display all products
    public void displayProducts() {
        if (list.isEmpty()) {
            System.out.println("No products in inventory!");
            return;
        }

        System.out.println("ID\tName\tQty\tPrice");
        for (Product p : list) {
            System.out.println(p.id + "\t" + p.name + "\t" + p.quantity + "\t" + p.price);
        }
    }
}
