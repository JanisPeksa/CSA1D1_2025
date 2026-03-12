import java.util.Scanner;

public class password {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();
        if (password.length() < 8) {
            System.out.println("Password is too short");
        } else if (password.matches("[A-Za-z]+")) {
            System.out.println("Your pasword is weak");
        } else if (password.length() >= 8 && password.matches("(?=.*[A-Za-z])(?=.*[0-9])[A-Za-z0-9]+")) {
            System.out.println("Okay password");
        } else if (password.length() >= 10 && password.matches("(?=.*[A-Za-z])(?=.*[0-9])(?=.*[^A-Za-z0-9]).+")) {
            System.out.println("Strong password");
        } else {
            System.out.println("not valid password");
        }

        sc.close();

    }

}
