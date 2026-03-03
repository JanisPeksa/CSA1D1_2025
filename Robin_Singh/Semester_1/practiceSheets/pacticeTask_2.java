package practiceSheets;

import java.util.Scanner;

public class pacticeTask_2 {

    //TODO------ Java Practice Sheet Number 2 -----------------------------------------------


    public static void checkSign() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer : ");
        int number = input.nextInt();
        if (number == 0) {
            System.out.println("The number is 0");
        } else if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }

        input.close();

    }


    public static void getTicketPrice() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = input.nextInt();


        if (age < 0) {
            System.out.println("Enter a valid age...");
        } else if (age > 100) {
            System.out.println("Enter a valid age...");
        } else if (age < 5) {
            System.out.println("Your ticket is FREE!");
        } else if (age < 17) {
            System.out.println("Your ticket is 5 EUROS");
        } else if (age < 64) {
            System.out.println("Your ticket is 12 EUROS");
        } else {
            System.out.println("Your ticket is 7 EUROS");
        }


        input.close();
    }

    public static void passwordChecker() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter you Password : ");
        String password = input.nextLine();

        int length = password.length();
        boolean containsNumber = false, containsSymbol = false;

        if (length < 8) {
            System.out.println("The password is too short..");
        }

        for (int i = 0; i < length; i++) {
            char c = password.charAt(i);

            if (!containsNumber) {
                containsNumber = Character.isDigit(c);
            }

            if (!containsSymbol) {
                containsSymbol = !Character.isLetterOrDigit(c) && !Character.isWhitespace(c);
            }
        }


        if (length >= 8) {
            if (containsNumber && !containsSymbol) {
                System.out.println("The password is Okay!");
            } else if (containsNumber && containsSymbol) {
                System.out.println("The password is Strong!");
            } else {
                System.out.println("The password is Weak!");
            }
        }


        input.close();
    }

//    ---------------Exercise Set B---------------------

    public static void multiplicationTable() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int number = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }

        input.close();


    }

    public static void factorial() {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter any number : ");
        int number = input.nextInt();

        int factorial = 1;

        for (int i = number; i >= 1; i--) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is : " + factorial);


        input.close();
    }

    public static void countVowels() {

        Scanner input = new Scanner(System.in);


        String word = input.nextLine().toLowerCase();
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                count++;
            }

        }

        System.out.println("There are total " + count + " vowels in " + word);

        input.close();
    }

    public static void fizzBuzz() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int number = input.nextInt();

        boolean fizz = number % 3 == 0;
        boolean buzz = number % 5 == 0;

        if (fizz && buzz) {
            System.out.println("FizzBuzz");
        } else if (fizz) {
            System.out.println("Fizz");
        } else if (buzz) {
            System.out.println("Buzz");
        } else {
            System.out.println("Unexpected error occured !");
        }


        input.close();
    }

    public static void stars() {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter the Width : ");
        int width = input.nextInt();
        System.out.print("Enter the Height : ");
        int height = input.nextInt();


        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == height) {
                    System.out.print("*");
                } else {
                    if (j == 1 || j == width) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }


        input.close();
    }


    public static void countPrime() {
        Scanner input = new Scanner(System.in);


        System.out.println("Note: The first number should be either equals or less than the second.");
        System.out.println("Enter numbers greater than 1.");
        System.out.print("Enter the first number : ");
        int x = input.nextInt();
        System.out.print("Enter the second number : ");
        int y = input.nextInt();


        if (x <= y) {
            int count = 0;

            for (int i = x; i <= y; i++) {
                boolean prime = true;
                for (int j = 2; j < i; j++) {
//                    System.out.println(j);
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }

                if (prime) {
                    System.out.println(i + "  ");
                    count++;
                }

            }
            System.out.println("Total Prime number : " + count);
        }


        input.close();
    }


    public static void main(String[] args) {
//        checkSign();
//        getTicketPrice();
//        passwordChecker();
//        multiplicationTable();
//        factorial();
//        countVowels();
//        fizzBuzz();
//        stars();
//        countPrime();
    }


}
