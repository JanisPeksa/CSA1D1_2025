import java.util.Scanner;

class Login {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Login system");
        System.out.println("Enter your username:");
        System.out.println("Enter password:");
        String username = sc.nextLine();
        String password = sc.nextLine();

        if (username.equals("java123") && password.equals("java123")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Invalid username or password");
        }
    }
}
