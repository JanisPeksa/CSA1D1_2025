import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;
        if (b > max) {
            max = b;
        } else if (c > max) {
            max = c;
        } else {
            max = a;
        }
        System.out.println("The largest number is: " + max);

    }

}