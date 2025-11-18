import java.util.Scanner;

public class temperature {
    static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        IO.print("Enter your temperature in Celsius: ");
        int temp = sc.nextInt();
        if (0 > temp) {
            IO.println("it's freazing");
        } else if (temp < 15) {
            IO.println("it's cold");
        } else if (temp < 25) {
            IO.println("it's warm");
        } else {
            IO.println("it's hot");
        }

    }
}

