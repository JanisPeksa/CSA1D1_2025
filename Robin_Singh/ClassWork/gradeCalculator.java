package ClassWork;

import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you grade between 0 to 100 : ");
        int grade = scan.nextInt();

        if (grade < 0 && grade > 100){
            System.out.println("Invalid Score. Please enter a value between 0 and 100");
        } else{
            if (grade >= 90){
                System.out.println("Your grade is : A");
                System.out.println("Excellent Work");
            } else if (grade >= 80){
                System.out.println("Your grade is : B");
            } else if (grade >= 70){
                System.out.println("Your grade is : C");
            } else if (grade >= 60){
                System.out.println("Your grade is : D");
            } else{
                System.out.println("Your grade is : F");
            }
        }



    }
}
