

        import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        int Number1 = scanner.nextInt();
        int Number2 = scanner.nextInt();


        int sum = Number1 + Number2;
        int subtract = Number1 - Number2;
        int multplication = Number1 * Number2;
        int divison = Number1 / Number2;
        int modulus = Number1 % Number2;
        int power = (int) Math.pow(Number1, Number2);

        System.out.println(sum);
    }
}
