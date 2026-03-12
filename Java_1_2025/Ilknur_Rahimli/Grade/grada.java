import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your exam score: ");
        int grade = input.nextInt();

        if (grade >= 90 && grade <= 100) {
            System.out.println("You got an A");
            System.out.println("Excellent Work!");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("You got a B");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("You got a C");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("You got a D");
        } else if (grade >= 0 && grade < 60) {
            System.out.println("You got an F");
        } else {
            System.out.println("Invalid score. Please enter a number between 0 and 100");
        }

        input.close();
    }
}
