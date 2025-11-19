import java.util.Scanner;

public class decisionGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You are in Dark Forest. Do you go LEFT or RIGHT? : ");
        String input = scanner.nextLine();
        if ((input.equals("LEFT")))
        {
            System.out.println("You found river");
        }
        else if ((input.equals("RIGHT")))
        {
            System.out.println("You meet wolf");
        }
        else
        {
            System.out.println("Nothing hapening");
        }


    }

}
