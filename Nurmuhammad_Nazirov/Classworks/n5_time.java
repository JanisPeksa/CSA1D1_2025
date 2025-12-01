public class n5_time {
    public static void main(String[] args) {
        int time = 8;

        if (time >= 6 && time <= 12) {
            System.out.println("Good morning!");
        } else if (time >= 12 && time <= 18) {
            System.out.println("Good afternoon!");
        } else if (time >= 18 && time <= 24) {
            System.out.println("Good evening!");
        }
    }
}
