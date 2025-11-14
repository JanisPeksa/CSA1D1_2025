import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = scanner.nextInt();
        if (age <= 5) {
            System.out.println("It's free");
        } else if (age <= 17) {
            System.out.println("You have to pay 5€");
        } else if (age <= 64) {
            System.out.println("You have to pay 12€");
        } else {
            System.out.println("You have to pay 7€");
        }

    }
}