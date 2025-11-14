import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i)== 'u') {
                result++;
            }
        }

        System.out.println(result);

        sc.close();
    }
}