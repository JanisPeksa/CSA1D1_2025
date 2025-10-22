import java.util.Objects;
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter number 1 ");
        int Number1 = scanner.nextInt();
        System.out.println("Enter number 2");
        int Number2 = scanner.nextInt();
        System.out.println("Select: +, -, *, /");
        String op = scanner2.nextLine();
        if (Objects.equals(op,"+") );
...
