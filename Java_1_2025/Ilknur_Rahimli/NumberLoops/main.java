import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int[] numbers = new int[20];
        System.out.println("Enter 20 numbers");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = number.nextInt();


        }
    }
}