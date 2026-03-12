import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please add temperature in Celsius:");
        int temp = sc.nextInt();

        if (temp < 0) {
            System.out.println("It's freezing");
        } else if (temp <= 15) {
            System.out.println("It's cold");
        } else if (temp > 15 && temp <= 25) {
            System.out.println("It's warm");
        } else {
            System.out.println("It's hot");
        }
        sc.close();
    }
}