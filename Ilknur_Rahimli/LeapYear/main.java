import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the year");
        int year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println("It's a leap year");
        } else if (year % 4 == 0) {
            System.out.println("It's a leap year");
        } else if (year % 100 == 0) {
            System.out.println("It's not a leap year");
        } else {
            System.out.println("This year has 366 days");
        }
    }
}