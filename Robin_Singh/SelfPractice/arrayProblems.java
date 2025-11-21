package SelfPractice;

public class arrayProblems {

    public static void problem_1() {
//        Sum of all elements in a 2D array

        int[][] array = {
                {1, 2, 3, 4},
                {5, 3, 4, 6}
        };

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }

        System.out.println("The total sum is : " + sum);

    }


    public static void problem_2() {
//        Print a matrix diagonally (primary diagonal)
        int[][] array = {
                {6, 2, 3},
                {5, 8, 4},
                {6, 3, 6}
        };

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + " ");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][array[i].length - 1 - i] + " ");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            int ele = array[i][0];
            for (int j = 0; j < array[i].length - 1; j++) {
                if (ele < array[i][j + 1]) {
                    ele = array[i][j + 1];
                }
            }
            System.out.printf("The max value in %d row is %d \n", i + 1, ele);
        }


    }


    public static void problem_3() {
//        Transpose of a Matrix
        int[][] array = {
                {6, 2, 3, 4},
                {5, 8, 4, 7},
                {6, 3, 6, 1}
        };

        int[][] transpose = new int[array[0].length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int ele = array[i][j];
                transpose[j][i] = ele;
            }
        }

        System.out.println("Original Array....");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Transposed Array.....");

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }


    public static void problem_4() {
//        Search for an Element in a Sorted 2D Matrix
        int[][] array = {
                {1, 4, 7, 10},
                {3, 6, 8, 12},
                {5, 7, 9, 15},
                {9, 11, 14, 18}

        };

        int ele = 13;


        boolean found = false;

        int i = 0;
        int j = array[i].length - 1;


        while (i < array.length && j >= 0) {

            int currentElement = array[i][j];

            if (ele == currentElement) {
                found = true;
                System.out.println("The Element Found...");
                break;
            } else if (ele > currentElement) {
                i++;
            } else {
                j--;
            }

        }

        if (!found) System.out.println("The Element is not Found...");
    }



    public static void problem_5(){
//    Rotate a Matrix by 90 Degrees (Clockwise)
        int[][] array = {
                {6, 2, 3, 7},
                {5, 8, 4, 4},
                {6, 3, 6, 2},
                {7, 1, 8, 4}
        };


        System.out.println("Original Array....");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i > j){
                    int cur = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = cur;
                }
            }
        }






        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length / 2; j++) {
                int ele = array[i][j];
                array[i][j] = array[i][array[i].length - 1 - j];
                array[i][array[i].length - 1 - j] = ele;
            }
        }

        System.out.println();
        System.out.println("Rotated Array.....");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


    }













    public static void main(String[] args) {
//        problem_1();
//        problem_2();
//        problem_3();
//        problem_4();
        problem_5();
    }
}
