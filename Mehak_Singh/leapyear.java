import java.util.Scanner;

class Leapyear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println("It is a leap year");
            System.out.println("This year has 366 days");
        }
        else {
            System.out.println("It is not a leap year");
        }
    }
}
