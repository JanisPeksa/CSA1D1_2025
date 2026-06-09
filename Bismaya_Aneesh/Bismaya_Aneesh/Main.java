import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Inventory inv = new Inventory();

        while (true) {
            System.out.println("\n1. Add Product  2. Display Products  3. Remove Product  4. Exit");
            int choice = input.nextInt();
            input.nextLine(); // consume newline

            if (choice == 1) {
                inv.addProduct(input);
            } else if (choice == 2) {
                inv.displayProducts();
            } else if (choice == 3) {
                inv.removeProduct(input);
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }

        input.close();
    }
}
