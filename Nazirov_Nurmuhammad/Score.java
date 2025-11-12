import java.util.Scanner;

public class Score {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score(0-100): ");
        int number = sc.nextInt();
        if (100<number) {
            System.out.println("wrong number");
        } else if (0>number) {
            System.out.println("wrong number");
        }else if (number>=90) {
            System.out.println(("A"));
        }else if (number>=80) {
            System.out.println(("B"));
        } else if (number>=70) {
            System.out.println(("C"));
        }else if (number>=60) {
            System.out.println(("D"));
        } else  {
            System.out.println(('F'));

        }

    }
}