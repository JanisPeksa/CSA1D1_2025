import java.util.Scanner;

public class SimpleLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // preset credentials
        String correctUsername = "student";
        String correctPassword = "java123";

        int attempts = 0;
        final int MAX_ATTEMPTS = 3;
        boolean loggedIn = false;

        while (attempts < MAX_ATTEMPTS && !loggedIn) {
            System.out.print("Enter username: ");
            String username = input.nextLine();

            System.out.print("Enter password: ");
            String password = input.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("✅ Login successful! Welcome, " + username + "!");
                loggedIn = true;
            } else {
                attempts++;
                if (!username.equals(correctUsername) && password.equals(correctPassword)) {
                    System.out.println("Incorrect username.");
                } else if (username.equals(correctUsername) && !password.equals(correctPassword)) {
                    System.out.println("Incorrect password.");
                } else {
                    System.out.println("Both username and password are incorrect.");
                }

                if (attempts < MAX_ATTEMPTS) {
                    System.out.println("You have " + (MAX_ATTEMPTS - attempts) + " attempt(s) left.\n");
                } else {
                    System.out.println("Too many failed attempts. Access denied.");
                }
            }
        }

        input.close();
    }
}