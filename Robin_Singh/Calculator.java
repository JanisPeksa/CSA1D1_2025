import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);


        System.out.println("Enter your first number :");
        int num1 = numbers.nextInt();
        System.out.println("Enter your second number :");
        int num2 = numbers.nextInt();

        System.out.println("What operation do you want to use : ");
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");

        int option = numbers.nextInt();
        int output = 0;

        if (option == 1){
            output = num1 + num2;
        } else if (option == 2) {
            output = num1 - num2;
        } else if (option == 3) {
            output = num1 * num2;
        } else if (option == 4) {
            output = num1 / num2;
        } else {
            System.out.println("Opps ! some error occurred.....");
        }


        System.out.println("Your output is : " + output);


    }
}