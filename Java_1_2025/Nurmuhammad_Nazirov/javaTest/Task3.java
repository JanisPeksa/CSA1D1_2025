import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter size of first array: ");
    int nA = scanner.nextInt();
    int[] A = new int[nA];
    System.out.println("Enter " + " sorted integers for A:" + nA);
    for (int i = 0; i < nA; i++) {
        A[i] = scanner.nextInt();
    }
    System.out.println("Enter size of second array: ");
    int nB = scanner.nextInt();
    int[] B = new int[nB];
    System.out.println("Enter " + " sorted integers for B:" + nB);
    for (int i = 0; i < nB; i++) {
        B[i] = scanner.nextInt();
    }
    int[] C = new int[nA + nB];
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < nA && j < nB) {
        if (A[i] <= B[j]) {
            C[k] = A[i];
            i++;
        } else {
            C[k] = B[j];
            j++;
        }
        k++;
    }

    while (i < nA) {
        C[k] = A[i];
        i++;
        k++;
    }
    while (j < nB) {
        C[k] = B[j];
        j++;
        k++;
    }
    System.out.println("Merged Result: ");
    for (int value : C) {
        System.out.println(value + " ");
    }
}
