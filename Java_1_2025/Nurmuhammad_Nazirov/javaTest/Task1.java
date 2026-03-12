import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lenght of arrey: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (n <= 1) {
            System.out.println("Longest increasing run  = " + n);
            return;
        }
        int longestLenght = 1;
        int currentLenght = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                currentLenght++;
            }
            else {
                currentLenght = 1;
            }
            longestLenght = Math.max(longestLenght, currentLenght);
        }
        System.out.println("Longest increasing run is " + longestLenght);
    }

}