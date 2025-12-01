import java.util.Scanner;

public class ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age < 5) {
            System.out.println("Ticket price: priceless");
        } 
        else if (age <= 17) {
            System.out.println("Ticket price: 5 euro");
        }
        else if (age <= 64) {
            System.out.println("Ticket price: 12 euro");
        } 
        else {
            System.out.println("Ticket price: 7 euros");
        }
        sc.close();
    }
}
