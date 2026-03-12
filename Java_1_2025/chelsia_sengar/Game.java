import java.util.Scanner;

class Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("You are in a dark forest. Do you go LEFT or RIGHT");
        String choose = sc.nextLine();

        if (choose.equals("LEFT")) {
            System.out.println("You found a river.");
        }
        else if (choose.equals("RIGHT")) {
            System.out.println("You meet a wolf.");
        }
        else {
            System.out.println("You stand still and nothing happens.");
        }
    }
}
