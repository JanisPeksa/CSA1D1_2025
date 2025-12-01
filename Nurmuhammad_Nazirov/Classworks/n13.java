 public class n13 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int[] arr = new int[10];
        int max;
        System.out.println("enter 10 numbers");
       for (int i = 0 ; i< 10; i++) {
        System.out.print("number" + (i+1) + ":");
        arr [i] = number.nextInt();
       }
       max = arr [0];
       for(int i = 0; i <10;i++){
           if (arr [i]>max){

           }
       }
       System.out.println("The largest number is" + max);
    }
}
