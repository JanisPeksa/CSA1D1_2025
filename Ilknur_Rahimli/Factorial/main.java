import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int result = 1;

        if (number >= 12) {
            System.out.println("Warning overflow.");
        } else {
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }
            System.out.println("Factorial of " + number + " is " + result + ".");
        }
        sc.close();
    }
}