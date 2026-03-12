import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        x = scanner.nextInt();
        System.out.print("Enter second number: ");
        y = scanner.nextInt();
        //System.out.println("First number: " + x);
        //System.out.println("Second number: " + y);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please Enter The Operation");
        String operation = scanner2.next();

        if (operation.equals("+"))
        {
            System.out.println("Your Answer is "+(x + y));
        }
        else if (operation.equals("-"))
        {
            System.out.println("Your Answer is "+(x - y));
        }
        else if (operation.equals("*"))
        {
            System.out.println("Your Answer is "+(x * y));
        }
        else if (operation.equals("/"))
        {
            System.out.println("Your Answer is "+(x / y));
        }

    }

}
