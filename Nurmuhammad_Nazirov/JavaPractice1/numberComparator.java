import java.util.Comparator;
import java.util.Scanner;

public class numberComparator {

    public static void main(String[] args) {
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        x = scanner.nextInt();
        System.out.print("Enter second number: ");
        y = scanner.nextInt();

        if (x>y)
        {
            System.out.println("First Number is Larger than Second Number");
        }
        else if (x<y)
        {
            System.out.println("Second Number is Larger than First Number");
        }
        else
        {
            System.out.println("Numbers are same");
        }


    }

}
