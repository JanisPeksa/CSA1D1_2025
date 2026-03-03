import java.util.*;

public class Problems {
    public static void runTask() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Array Operations Menu:");
        System.out.println("1. Print Elements");
        System.out.println("2. Even Index Elements");
        System.out.println("3. Sum of Array");
        System.out.println("4. Count Positive Numbers");
        System.out.println("5. Find Maximum");
        System.out.println("6. Minimum and Maximum");
        System.out.println("7. Average Value");
        System.out.println("8. Reverse Array");
        System.out.println("9. Shift Left");
        System.out.println("10. Duplicate Detection");
        System.out.println("11. Bubble Sort (Ascending)");
        System.out.println("12. Bubble Sort Pass Output");
        System.out.println("13. Bubble Sort Swap Counter");
        System.out.println("14. Optimized Bubble Sort");
        System.out.println("15. Bubble Sort Descending");
        System.out.println("16. Selection Sort");
        System.out.println("17. Minimum Index Tracking");
        System.out.println("18. Selection Sort Swap Counter");
        System.out.println("19. Partial Selection Sort");
        System.out.println("20. Recursive Sum");
        System.out.println("21. Recursive Maximum");
        System.out.println("22. Recursive Print");
        System.out.println("23. Reverse Print (Recursion)");
        System.out.println("24. Factorial");
        System.out.println("25. Is Sorted");
        System.out.println("26. Compare Sorts");
        System.out.println("27. Recursive Array Length");
        System.out.println("28. Recursive Bubble Sort");

        System.out.print("\nChoose an operation (1-28): ");
        int choice = sc.nextInt();

        int[] arr = null;
        int n = 0;

        if (choice != 24) {
            System.out.print("Enter array size: ");
            n = sc.nextInt();
            arr = new int[n];
            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
        }

        System.out.println();

        switch (choice) {
            case 1:
                printElements(arr);
                break;
            case 2:
                evenIndexElements(arr);
                break;
            case 3:
                sumOfArray(arr);
                break;
            case 4:
                countPositive(arr);
                break;
            case 5:
                findMaximum(arr);
                break;
            case 6:
                minAndMax(arr);
                break;
            case 7:
                averageValue(arr);
                break;
            case 8:
                reverseArray(arr);
                break;
            case 9:
                shiftLeft(arr);
                break;
            case 10:
                duplicateDetection(arr);
                break;
            case 11:
                bubbleSortAscending(arr);
                break;
            case 12:
                bubbleSortPassOutput(arr);
                break;
            case 13:
                bubbleSortSwapCounter(arr);
                break;
            case 14:
                optimizedBubbleSort(arr);
                break;
            case 15:
                bubbleSortDescending(arr);
                break;
            case 16:
                selectionSort(arr);
                break;
            case 17:
                minimumIndexTracking(arr);
                break;
            case 18:
                selectionSortSwapCounter(arr);
                break;
            case 19:
                partialSelectionSort(arr);
                break;
            case 20:
                System.out.println(recursiveSum(arr, 0));
                break;
            case 21:
                System.out.println(recursiveMaximum(arr, 0));
                break;
            case 22:
                recursivePrint(arr, 0);
                System.out.println();
                break;
            case 23:
                reversePrintRecursion(arr, 0);
                System.out.println();
                break;
            case 24:
                System.out.print("Enter a number for factorial: ");
                int num = sc.nextInt();
                System.out.println(factorial(num));
                break;
            case 25:
                System.out.println(isSorted(arr));
                break;
            case 26:
                compareSorts(arr);
                break;
            case 27:
                System.out.println(recursiveArrayLength(arr, 0));
                break;
            case 28:
                recursiveBubbleSort(arr, n);
                printArray(arr);
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }

    // 1. Print Elements
    static void printElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    // 2. Even Index Elements
    static void evenIndexElements(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            if (i > 0) System.out.print(" ");
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    // 3. Sum of Array
    static void sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    // 4. Count Positive Numbers
    static void countPositive(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    // 5. Find Maximum
    static void findMaximum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    // 6. Minimum and Maximum
    static void minAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min: " + min + ", Max: " + max);
    }

    // 7. Average Value
    static void averageValue(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum / arr.length;
        System.out.println(avg);
    }

    // 8. Reverse Array
    static void reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        printArray(reversed);
    }

    // 9. Shift Left
    static void shiftLeft(int[] arr) {
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
        printArray(arr);
    }

    // 10. Duplicate Detection
    static void duplicateDetection(int[] arr) {
        boolean hasDuplicate = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    hasDuplicate = true;
                    break;
                }
            }
            if (hasDuplicate) break;
        }
        System.out.println(hasDuplicate);
    }

    // 11. Bubble Sort (Ascending)
    static void bubbleSortAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }

    // 12. Bubble Sort Pass Output
    static void bubbleSortPassOutput(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.print("Pass " + (i + 1) + ": ");
            printArray(arr);
        }
    }

    // 13. Bubble Sort Swap Counter
    static void bubbleSortSwapCounter(int[] arr) {
        int swaps = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }
        System.out.print("Sorted array ");
        printArray(arr);
        System.out.println("Swaps: " + swaps);
    }

    // 14. Optimized Bubble Sort
    static void optimizedBubbleSort(int[] arr) {
        int passes = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            passes++;
            if (!swapped) {
                break;
            }
        }
        System.out.println("Array already sorted after " + passes + " pass");
    }

    // 15. Bubble Sort Descending
    static void bubbleSortDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }

    // 16. Selection Sort
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        printArray(arr);
    }

    // 17. Minimum Index Tracking
    static void minimumIndexTracking(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            System.out.println("Pass " + (i + 1) + " min index: " + minIndex);
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // 18. Selection Sort Swap Counter
    static void selectionSortSwapCounter(int[] arr) {
        int swaps = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swaps++;
            }
        }
        System.out.print("Sorted array ");
        printArray(arr);
        System.out.println("Swaps: " + swaps);
    }

    // 19. Partial Selection Sort
    static void partialSelectionSort(int[] arr) {
        int halfLength = arr.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int minIndex = i;
            for (int j = i + 1; j < halfLength; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        printArray(arr);
    }

    // 20. Recursive Sum
    static int recursiveSum(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + recursiveSum(arr, index + 1);
    }

    // 21. Recursive Maximum
    static int recursiveMaximum(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int maxRest = recursiveMaximum(arr, index + 1);
        return Math.max(arr[index], maxRest);
    }

    // 22. Recursive Print
    static void recursivePrint(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        if (index > 0) System.out.print(" ");
        System.out.print(arr[index]);
        recursivePrint(arr, index + 1);
    }

    // 23. Reverse Print (Recursion)
    static void reversePrintRecursion(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        reversePrintRecursion(arr, index + 1);
        if (index < arr.length - 1) System.out.print(" ");
        System.out.print(arr[index]);
    }

    // 24. Factorial
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // 25. Is Sorted
    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // 26. Compare Sorts
    static void compareSorts(int[] arr) {
        int[] arr1 = arr.clone();
        int[] arr2 = arr.clone();

        int bubbleSwaps = 0;
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - 1 - i; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                    bubbleSwaps++;
                }
            }
        }

        int selectionSwaps = 0;
        for (int i = 0; i < arr2.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[j] < arr2[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr2[i];
                arr2[i] = arr2[minIndex];
                arr2[minIndex] = temp;
                selectionSwaps++;
            }
        }

        System.out.println("Bubble swaps: " + bubbleSwaps + ", Selection swaps: " + selectionSwaps);
    }

    // 27. Recursive Array Length
    static int recursiveArrayLength(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return 1 + recursiveArrayLength(arr, index + 1);
    }

    // 28. Recursive Bubble Sort
    static void recursiveBubbleSort(int[] arr, int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        recursiveBubbleSort(arr, n - 1);
    }

    // Helper method to print array
    static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }
}