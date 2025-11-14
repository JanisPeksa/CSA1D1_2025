import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Are you a citizen? Yes or No:");
        String answer = sc.next().toLowerCase();
        boolean isCitizen = answer.equals("yes");

        if (age >= 65) {
            System.out.println("You are retired");
        } else if (age >= 18 && isCitizen) {
            System.out.println("You are eligible for voting");
        } else if (age >= 16) {
            System.out.println("You are eligible to drive");
        }

        sc.close();
    }
}

