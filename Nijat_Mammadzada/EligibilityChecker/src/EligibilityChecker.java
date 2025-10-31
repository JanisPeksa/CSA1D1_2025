import java.util.Scanner;

public class EligibilityChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Are you a citizen? (true/false): ");
        boolean isCitizen = input.nextBoolean();

        System.out.println(); // just for spacing

        // Check voting eligibility
        if (age >= 18 && isCitizen) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // Check driving eligibility
        if (age >= 16) {
            System.out.println("You are eligible to drive.");
        } else {
            System.out.println("You are not eligible to drive.");
        }

        // Check retirement eligibility
        if (age >= 65) {
            System.out.println("You are eligible to retire.");
        } else {
            System.out.println("You are not eligible to retire.");
        }

        input.close();
    }
}