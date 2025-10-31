import java.util.Scanner;

public class TemperatureChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temp = input.nextDouble();

        if (temp < 0) {
            System.out.println("Invalid temperature (too low)");
        } else if (temp <= 15) {
            System.out.println("It's cold");
        } else if (temp <= 25) {
            System.out.println("It's warm");
        } else {
            System.out.println("It's hot");
        }

        input.close();
    }
}