import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        boolean isLeap = false;

        // Leap year rules:
        // - Divisible by 4 → possible leap year
        // - But if divisible by 100 → not a leap year
        // - Unless divisible by 400 → leap year again
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                } else {
                    isLeap = false;
                }
            } else {
                isLeap = true;
            }
        }

        if (isLeap) {
            System.out.println(year + " is a leap year.");
            System.out.println("It has 366 days.");
        } else {
            System.out.println(year + " is not a leap year.");
            System.out.println("It has 365 days.");
        }

        input.close();
    }
}