package ClassWork;

import java.util.Scanner;

public class classTasks {

    public static void banana() {
        // Write a banana with Letter....

        System.out.println("BBBB   ");
        System.out.println("B   B   ");
        System.out.println("BBBB    ");
        System.out.println("B   B   ");
        System.out.println("BBBB    ");

        System.out.println();

        System.out.println(" AAA    ");
        System.out.println("A   A   ");
        System.out.println("AAAAA   ");
        System.out.println("A   A   ");
        System.out.println("A   A   ");

        System.out.println();

        System.out.println("N   N  ");
        System.out.println("NN  N   ");
        System.out.println("N N N   ");
        System.out.println("N  NN   ");
        System.out.println("N   N   ");

        System.out.println();

        System.out.println(" AAA    ");
        System.out.println("A   A   ");
        System.out.println("AAAAA   ");
        System.out.println("A   A   ");
        System.out.println("A   A   ");

        System.out.println();

        System.out.println("N   N  ");
        System.out.println("NN  N   ");
        System.out.println("N N N   ");
        System.out.println("N  NN   ");
        System.out.println("N   N   ");

        System.out.println();

        System.out.println(" AAA    ");
        System.out.println("A   A   ");
        System.out.println("AAAAA   ");
        System.out.println("A   A   ");
        System.out.println("A   A   ");

    }

    public static void array() {


        Scanner userInput = new Scanner(System.in);
        int[] number = new int[3];
        int biggestNumber = 0;

        for (int i = 0; i < number.length; i++) {
            System.out.print("Enter a Number : ");
            number[i] = userInput.nextInt();

            if (number[i] > biggestNumber) {
                biggestNumber = number[i];
            }
        }

        System.out.println("The biggest Number is : " + biggestNumber);

        System.out.println(number);


        int[] numbers = new int[10];
        int[] counted = new int[10];


        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a Number : ");
            numbers[i] = userInput.nextInt();
        }


        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[i];
            int c = 1;
            boolean isCounted = false;


            for (int j = 0; j < counted.length; j++) {
                if (element == counted[j]) {
                    isCounted = true;
                }
            }


            if (!isCounted) {


                for (int j = i + 1; j < numbers.length; j++) {
                    counted[i] = element;
                    if (element == numbers[j]) {
                        c++;
                    }
                }
                System.out.println("The Number " + element + " is appeared " + c + " times");
            }
        }

    }


    public static void main(String[] args) {
//        banana();
        array();
    }
}
