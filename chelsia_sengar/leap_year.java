import java.util.*;

class FirstClass {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // to check if an year is leap year or not
     
      System.out.print("enter an year : ");
      int year = sc.nextInt();

      if(year % 4 == 0) {
         System.out.println("It's a leap year");
      } else {
         System.out.println("it's not a leap year");
      }
      
   
  } 
}
