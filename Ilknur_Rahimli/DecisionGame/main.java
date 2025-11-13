import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You're in a dark forest. Do you go LEFT or RIGHT?");
        String direction = sc.next().toUpperCase();

        if (direction.equals("LEFT")) {
            System.out.println("You found a river");
        } else {
            System.out.println("You meet a wolf");
        }
    }
}