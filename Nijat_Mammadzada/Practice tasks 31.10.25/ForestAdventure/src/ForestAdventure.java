import java.util.Scanner;

public class ForestAdventure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("You're in a dark forest...");
        System.out.print("Do you go LEFT or RIGHT? (input answer in full caps) ");

        String choice = input.nextLine().trim().toLowerCase(); // normalize input

        if (choice.equals("LEFT")) {
            System.out.println("You go left and find a river.");
        } else if (choice.equals("RIGHT")) {
            System.out.println("You turn right and find a wolf");
        } else {
            System.out.println("You stand still and nothing happens");
        }

        input.close();
    }
}