import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        String[] arr = {"Bread", "Apple", "Fork"};
        Arrays.sort(arr);

        for (String i : arr) {
            System.out.print(i + ", ");
        }
    }
}
