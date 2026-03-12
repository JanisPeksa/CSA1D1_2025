import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(result);
        }

        sc.close();
    }
}