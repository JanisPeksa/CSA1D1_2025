import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your temperature in Celsius: ");
        int temp = sc.nextInt();
        if (0>temp) {
            System.out.println("it's freazing");
        } else if (0<=temp && temp<15) {
            System.out.println("it's cold");
        } else if (15<=temp && temp<25) {
            System.out.println("it's warm");
        } else if (25<=temp) {
            System.out.println("it's hot");
        } else if (temp>=70) {
            System.out.println(("C"));
        }else if (temp>=60) {
            System.out.println(("D"));
        } else  {
            System.out.println(('F'));

        }

    }
}
