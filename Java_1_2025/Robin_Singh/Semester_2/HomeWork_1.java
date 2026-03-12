package Semester_2;

public class HomeWork_1 {

//      ********** My Approach ********
//      public static String reverseString(String str) {
//          if (str.length() <= 1) return str;
//          return reverseString(str.substring(1)) + str.charAt(0);
//      }

    // *********** Better Approach [ Learned from AI tool, not copied... ]***********

    public static String reverseString(String str) {
        if (str.isEmpty()) return str;
        return reverseHelper(str, 0, str.length() - 1);
    }

    public static String reverseHelper(String str, int left, int right) {
        if (left >= right) return str;

        char[] chars = str.toCharArray();
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;

        return reverseHelper(new String(chars), left + 1, right - 1);
    }


//      ****** My Approach *******
//      public static int findMax(int[] arr, int index) {
//        if (index == arr.length - 1) return arr[arr.length - 1];
//        return Math.max(arr[index], findMax(arr, index + 1));
//      }

//      ******* Improved Approach ********

    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannnot be null or Empty");
        }
        return findMaxHelper(arr, 0);
    }

    public static int findMaxHelper(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        return Math.max(arr[index], findMaxHelper(arr, index + 1));
    }


    //    ********** My Approach ************ - Already Optimized...
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) return true;

        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return isPalindrome(str.substring(1, str.length() - 1));
    }


//    ******* My Approach *******
//    public static int countOccurrence(int[] arr, int target) {
//        return countOccurrenceHelper(arr, 0, target);
//    }
//
//    public static int countOccurrenceHelper(int[] arr, int index, int target) {
//        if (index == arr.length - 1) {
//            if (arr[index] == target) {
//                return 1;
//            } else {
//                return 0;
//            }
//        }
//        if (target == arr[index]) {
//            return 1 + countOccurrenceHelper(arr, index + 1, target);
//        }
//        return countOccurrenceHelper(arr, index + 1, target);
//    }


    //    ********* Improved Approach *********
    public static int countOccurrence(int[] arr, int target) {
        if (arr == null || arr.length == 0) return 0;
        return countOccurrenceHelper(arr, 0, target);
    }

    public static int countOccurrenceHelper(int[] arr, int index, int target) {
        if (arr.length == index) return 0;
        int count = (arr[index] == target) ? 1 : 0;
        return count + countOccurrenceHelper(arr, index + 1, target);
    }

}
