import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int[] numbers = new int[10];
        int max;
        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = number.nextInt();

        }
        max = numbers[0];
        for (int i = 0; i < 10; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The largest number is " + max);


    }
}