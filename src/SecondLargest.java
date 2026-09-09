import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest, secondLargest;

        if (a > b && a > c) {
            largest = a;
            secondLargest = Math.max(b, c);
        } else if (b > a && b > c) {
            largest = b;
            secondLargest = Math.max(a, c);
        } else {
            largest = c;
            secondLargest = Math.max(a, b);
        }

        System.out.println("Second largest = " + secondLargest);
    }
}
