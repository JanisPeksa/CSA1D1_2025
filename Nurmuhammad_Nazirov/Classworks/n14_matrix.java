import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class n14_matrix {
    public static void main(String[] args) {
        int a [] = {3,5};
        int[] b = new int[5];
        int [][] matrix = new int [5][5];
        for(int i = 0; i<5; i++ ){
            for(int j = 0; j<5; j++ ){
                System.out.print(matrix[i][i]);
            }
            System.out.println();
        }
    }
  
}
