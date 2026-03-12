import java.util.Objects;
import java.util.Scanner;

class Age {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        System.out.println("Enter your citizenship:");
        int age = sc.nextInt();
        String citizen = sc.nextLine();
        citizen = "latvian";

        if (age >= 18) {
            if (Objects.equals(citizen, citizen)) {
                System.out.println("You are eligible to vote");
            }
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
}
