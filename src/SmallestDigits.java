import java.util.Scanner;
public class SmallestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int smallest = 9;

        while (n != 0) {
            int d = n % 10;

            if (d < smallest)
                smallest = d;

            n = n / 10;
        }

        System.out.println(smallest);
    }
}