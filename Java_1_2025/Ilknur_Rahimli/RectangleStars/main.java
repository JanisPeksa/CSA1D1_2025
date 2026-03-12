import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter width: ");
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}