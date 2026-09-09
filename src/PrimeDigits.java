import java.util.Scanner;
public class PrimeDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean prime = true;

        while (n != 0) {
            int d = n % 10;

            if (d != 2 && d != 3 && d != 5 && d != 7) {
                prime = false;
                break;
            }

            n = n / 10;
        }

        if (prime)
            System.out.println("All Prime");
        else
            System.out.println("Not All Prime");
    }
}
