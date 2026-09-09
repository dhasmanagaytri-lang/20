import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 4-digit number: ");
        int n = sc.nextInt();

        int firstTwo = n / 100;
        int lastTwo = n % 100;

        int sumFirst = (firstTwo / 10) + (firstTwo % 10);
        int sumLast = (lastTwo / 10) + (lastTwo % 10);

        if (sumFirst == sumLast) {
            System.out.println("Yes, sum is equal");
        } else {
            System.out.println("No, sum is not equal");
        }
    }
}

