public class SimpleCalculator {
    public static void main(String[] args) {
        int x = 5; // 5
        System.out.println(x);
        //System.out.println("x = x + x + 2 " + "= x =" + "+x" + "+x" + "+ 2" );
        System.out.println("x = x + x + 2  →  " + x + " + " + x + " + 2 = " + (x + x + 2));
        x= x + x + 2; // 12
        System.out.println(x);
        System.out.println("x = x + x + 6  →  " + x + " + " + x + " + 6 = " + (x + x + 6));
        x= x + 6 + x; // 30
        System.out.println(x);
        System.out.println("x = x + x + x  →  " + x + " + " + x + " + x = " + (x + x + x));
        x= x + x + x; // 90
        System.out.println(x);
    }
}