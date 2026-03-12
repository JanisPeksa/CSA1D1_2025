import java.util.Scanner;
public class password_lenght {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();
        if (password.length() < 8) {
            System.out.println("Too short");
        } 
        else if (password.matches("[A-Za-z]+")) {
            System.out.println("Weak pasword");
        } 
        else if (password.length() >= 8 && password.matches("(?=.*[A-Za-z])(?=.*[0-9])[A-Za-z0-9]+")) {
            System.out.println("Okay pasword");
        } 
        else if (password.length() >= 10 && password.matches("(?=.*[A-Za-z])(?=.*[0-9])(?=.*[^A-Za-z0-9]).+")) {
            System.out.println("Strong pasword");
        } 
        else {
            System.out.println("Does not fit");
        }
        sc.close();
    }
}
