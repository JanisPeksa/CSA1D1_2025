import java.util.Scanner;

public class NumberComparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        if (num1 > num2) {
            System.out.println("The first number is greater than the second number.");
        } else if (num1 < num2) {
            System.out.println("The first number is less than the second number.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        input.close();
    }
}