import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your username and password: ");
        String username = sc.next();
        String password = sc.next();

        if (username.equals("student") && password.equals("java123")) {
            System.out.println("Welcome!");
        } else if (username.equals("student") && !password.equals("java123")) {
            System.out.println("Invalid password!");
        } else if (!username.equals("student") && password.equals("java123")) {
            System.out.println("Invalid username!");
        } else {
            System.out.println("Something went wrong!");
        }
    }
}