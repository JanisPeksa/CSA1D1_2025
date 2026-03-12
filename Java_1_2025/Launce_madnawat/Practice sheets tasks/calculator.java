import java.util.*;

public class  Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print("Enter an operator (+ , - , * , / , ^ ): ");
        char symbol = sc.next().charAt(0);

        switch(symbol){
            case '+' :
                System.out.println( a + b);
                break;
            case '-' :
                System.out.println( a - b);
                break;
            case '*':
                System.out.println( a * b );
                break;
            case '/':
                if ( b == 0 ){
                    System.out.println("you can't divide by 0");
                }
                else {
                    System.out.println(a / b);
                }
                break;
            case '^':
                System.out.println(Math.pow(a , b));
                break;
            default:
                System.out.println("you didn't use the write symbol");
                break;

        }

        }

      }
