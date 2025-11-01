import java.util.Scanner;

public class practiceTask_1 {


// ================================================================================================
// |                                          PART 1                                              |
// ================================================================================================

    public static void part1() {

//      Task 1 - Predict the output

        int x = 5;
        if (x > 10) {
            System.out.println("A");
        } else if (x > 3) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }


        // What will be printed ? - B
        // What happens if x = 11 or x = 2? - It will print A if x equals 11 or C if x equals 2


        // Task 2 - Debug the Code

        int number = 7;
        if (number % 2 == 0) {   // There will be double equals to compare not single.
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }


// ================================================================================================
// |                                          PART 2                                              |
// ================================================================================================


    public static void part2() {
        // Task 3 - Grading System
        // Write a Java program that takes an exam score and prints the letter grades.


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter you grade between 0 to 100 : ");
        int grade = scan.nextInt();

        if (grade < 0 || grade > 100) {
            System.out.println("Invalid Score. Please enter a value between 0 and 100");
        } else {
            if (grade >= 90) {
                System.out.println("Your grade is : A");
                System.out.println("Excellent Work");
            } else if (grade >= 80) {
                System.out.println("Your grade is : B");
            } else if (grade >= 70) {
                System.out.println("Your grade is : C");
            } else if (grade >= 60) {
                System.out.println("Your grade is : D");
            } else {
                System.out.println("Your grade is : F");
            }
        }


        // Task 4 - Temperature Checker
        // Ask the user for a temperature in Celsius and print.


        System.out.print("Enter the temperature in celsius : ");
        int temperature = scan.nextInt();

        if (temperature < 0) {
            System.out.println("Its Freezing!");
        } else if (temperature < 15) {
            System.out.println("Its Cold!");
        } else if (temperature < 25) {
            System.out.println("Its warm");
        } else {
            System.out.println("Its hot!");
        }


        // Task 5 - Number Comparator
        // Ask the user for three numbers and print which one is larger or smaller.

        System.out.print("Enter the first number : ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = scan.nextInt();

        if (num1 == num2) {
            System.out.println("Both the numbers are equal");
        } else {
            if (num1 > num2) {
                System.out.println(num1 + " is bigger.");
            } else {
                System.out.println(num2 + " is bigger.");
            }
        }


        // Same task but with 3 numbers

        System.out.print("Enter the first number : ");
        int n1 = scan.nextInt();
        System.out.print("Enter the second number : ");
        int n2 = scan.nextInt();
        System.out.print("Enter the third number : ");
        int n3 = scan.nextInt();

        if (n1 == n2 && n2 == n3){
            System.out.println("All the numbers are equal....");
        } else{
            if (n1 > n2){
                if (n1 > n3){
                    System.out.println(n1 + " is the biggest number....");
                    if (n2 > n3){
                        System.out.println(n3 + " is the smallest number....");
                    } else {
                        System.out.println(n2 + " is the smallest number....");
                    }
                } else {
                    System.out.println(n3 + " is the biggest number....");
                    System.out.println(n2 + " is the smallest number....");
                }
            } else {
                if (n2 > n3){
                    System.out.println(n2 + " is the biggest number....");
                    if (n1 > n3){
                        System.out.println(n3 + " is the smallest number....");
                    } else {
                        System.out.println(n1 + " is the smallest number....");
                    }
                } else {
                    System.out.println(n3 + " is the biggest number....");
                    System.out.println(n1 + " is the smallest number....");
                }
            }
        }


        // Closing the scanner in the end
        scan.close();


    }


// ================================================================================================
// |                                          PART 3                                              |
// ================================================================================================


    public static void part3() {
        // Task 6 - Simple Login and Sign Up System
        // Allow three login attempts before lockout


        Scanner scan = new Scanner(System.in);

        int attempts = 0;

        System.out.println("Welcome to the Java simple Login System.");
        System.out.println("------------------------Sign Up------------------------");

        System.out.print("Enter your username : ");
        String storedUsername = scan.nextLine();
        System.out.print("Enter your Password : ");
        String storedPassword = scan.nextLine();

        System.out.println("User created successfully !");
        System.out.println("Now you can login with your credentials.");

        while (attempts < 3) {


            System.out.println("------------------------Login------------------------");
            System.out.print("Enter your username : ");
            String username = scan.nextLine();
            System.out.print("Enter your Password : ");
            String password = scan.nextLine();

            if (username.equals(storedUsername) && password.equals(storedPassword)) {
                System.out.println("Successfully Logged in as " + username);
                return;
            } else if (!username.equals(storedUsername)) {
                System.out.println("Invalid Username.");
            } else if (!password.equals(storedPassword)) {
                System.out.println("Incorrect Password.");
            } else {
                System.out.println("Some error occurred!");
            }

            attempts++;

        }

        if (attempts >= 3) {
            System.out.println("You ran out of attempts, due to multiple login attempts, try later!");
        }

        // Task 7 - Simple Decision Game


        System.out.println("Welcome to the mini game.....");
        System.out.println("You are in a dark forest. Do you go left or right.");
        System.out.println("Enter you choice here (left, right).....");
        String choice = scan.nextLine();

        if (choice.toLowerCase().equals("left")) {
            System.out.println("You found a river!");
        } else if (choice.toLowerCase().equals("right")) {
            System.out.println("You meet a wolf");
        } else {
            System.out.println("You stand still and nothing happens.");
        }


        // Task 8 - Leap Year Checker

        System.out.print("Enter the year : ");
        int year = scan.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("This is a leap year....");
                    System.out.println("It have 366 days....");
                } else {
                    System.out.println("This is not a leap year.....");

                }
            } else {
                System.out.println("This is a leap year....");
                System.out.println("It have 366 days....");
            }
        } else {
            System.out.println("This is not a leap year.....");
        }

        // Closing the scanner in the end
        scan.close();
    }


// ================================================================================================
// |                                          PART 4                                              |
// ================================================================================================


    public static void part4() {


        // Task 9 - Combined Challange
        // Based on a person age and citizenship status check that if they are eligible to vote, drive and retire.....


        Scanner inp = new Scanner(System.in);

        System.out.print("Are you a citizen (yes or no) : ");
        String isCitizen = inp.nextLine();
        System.out.print("Enter you age : ");
        int age = inp.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to drive......");
            if (isCitizen.toLowerCase().equals("yes")) {
                System.out.println("You are eligible to vote.....");
            } else if (isCitizen.toLowerCase().equals("no")) {
                System.out.println("You are not eligible to vote......");
            } else {
                System.out.println("You didn't enter correct citizenship....");
            }


            if (age >= 65) {
                System.out.println("You are eligible to retire.....");
            } else {
                System.out.println("You are not eligible to retire.....");
            }

        } else if (age >= 16) {
            System.out.println("You are eligible to drive......");

        } else {
            System.out.println("You are not eligible to drive, vote and retire.....");
        }

    }



    public static void main(String[] args) {


        //TODO: Java Practise Task - IF, ELSE, IF-ELSE Statements
        // Uncomment the parts to run them

//        part1();
//        part2();
//        part3();
//        part4();
    }
}
