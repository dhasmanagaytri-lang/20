/*
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int numb = sc.nextInt();

        int count = 0;

        while (numb != 0) {
            numb = numb / 10;
            count++;
        }

        System.out.println("Number of digits = " + count);
    }
}
*/
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int even = 0, odd = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 == 0)
                even++;
            else
                odd++;

            n = n / 10;
        }

        System.out.println("Even digits = " + even);
        System.out.println("Odd digits = " + odd);
    }
}
