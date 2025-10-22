import java.util.Objects;
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        double number1, number2;

        System.out.println("Please enter number 1:");
        int Number1 = scanner.nextInt();
        System.out.println("Please enter number 2:");
        int Number2 = scanner.nextInt();
        System.out.println("Select the operation +, -, /, * ");
        String op = scanner2.nextLine();
         if (Objects.equals(op, "+")) {
             System.out.println(Number1+Number2);
         } else if(Objects.equals(op, "-")) {
             System.out.println(Number1-Number2);
         } else if(Objects.equals(op, "*")) {
             System.out.println(Number1*Number2);
         } else if (Objects.equals(op, "/") && Number2 != 0) {
             System.out.println(Number1/Number2);
         }
    }
}
