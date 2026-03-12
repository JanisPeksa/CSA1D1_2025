package Semester_2;

public class Main {
    static void main(String[] args) {

//      ********** Reverse String *********
        var reversedString = HomeWork_1.reverseString("Hello");
        System.out.println(reversedString);

//      ********** Find Max From Array *********
        int[] arr = {5, 2, 4, 5, 9, 6, 5, 3, 5, 5};
        var maximumElement = HomeWork_1.findMax(arr);
        System.out.println(maximumElement);

//      ********** isPalindrome *********
        var palindromeString = HomeWork_1.isPalindrome("aurfufa");
        System.out.println(palindromeString);

//      ********** Count Occurrence of a Number *********
        var count = HomeWork_1.countOccurrence(arr, 5);
        System.out.println(count);

//        Task_1.runTask();
//        Task_2.runTask();
        Problems.runTask();
    }


}
