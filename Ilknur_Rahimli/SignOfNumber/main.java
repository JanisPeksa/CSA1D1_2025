import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("It's a negative number");
        } else if (n > 0) {
            System.out.println("It's a positive number");
        } else {
            System.out.println("It's zero");
        }
    }
}