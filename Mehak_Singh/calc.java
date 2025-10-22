import java.util.Scanner;
class Sums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = scanner.nextInt();
        System.out.println("enter second number:");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("sum:"+sum);
        int subtraction = a - b;
        System.out.println("subtraction:"+subtraction);
        int divide = a / b;
        System.out.println("divide:"+divide);
        int multiply = a * b;
        System.out.println("multiply:"+multiply);
        if (sum > 20) {
            System.out.println("big numbers!!");
        } else if(sum > 10) {
            System.out.println("The sum is in between 20 and 10");
        } else if (sum > 5) {
            System.out.println("The sum is in between 5 and 10");
        } else {
            System.out.println("It is less than 5");
        }
    }
}
