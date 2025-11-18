import java.util.Scanner;

public class grade {
    static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        IO.print("Enter your score: ");
        int grade = sc.nextInt();
        if (0 > grade && grade > 100) {
            IO.println("Your score can't exist");
        } else if (grade > 90) {
            IO.println("Your score is A");
        } else if (grade > 80) {
            IO.println("Your score is B");
        } else if (grade >70) {
            IO.println("Your score is C");
        } else if (grade > 60) {
            IO.println("Your score is D");
        } else if (grade >59) {
            IO.println("Your score is F");
        }

    }
}




