 void main() {

    Scanner sc = new Scanner(System.in);
    IO.print("Enter your temperature in Celsius: ");
    int temp = sc.nextInt();
    if (0 > temp) {
        IO.println("it's freazing");
    } else if (0 <= temp && temp < 15) {
        IO.println("it's cold");
    } else if (15 <= temp && temp < 25) {
        IO.println("it's warm");
    } else if (25 <= temp) {
        IO.println("it's hot");
    } else if (temp >= 70) {
        IO.println(("C"));
    } else if (temp >= 60) {
        IO.println(("D"));
    } else {
        IO.println(('F'));

    }

}

void main() {
}

void main() {
}
