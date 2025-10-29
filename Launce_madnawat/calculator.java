import java.util.*;
class FirstClass {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int a = sc.nextInt();
        System.out.println("enter 2nd number");
        int b = sc.nextInt();
        
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        int operation = sc.nextInt();
       
        if( operation == 1) {
            int result = a + b ;
            System.out.println("Result : " + result);}
        else if( operation == 2) {
            int result = a - b ;
            System.out.println("result :" + result);}
        else if( operation == 3) {
            int result = a * b ;
            System.out.println("result :" + result);}
        else if ( operation == 4) {
            int result = a / b ;
            System.out.println("result :" + result);}
        else     {
        System.out.println("Invalid result");}
    }
} 


