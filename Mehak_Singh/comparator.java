import java.util.Scanner;

class Comparator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        System.out.println("Enter second number:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("First is larger");
        }

        else {

            if (num1 < num2) {
                System.out.println("Second is larger");
            }
            else {
                System.out.println("Numbers are equal");
            }

        }
    }
}
