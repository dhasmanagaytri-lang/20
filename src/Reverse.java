 import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int numb = sc.nextInt();

        int reverse = 0;

        while (numb != 0) {
            int digit = numb % 10;
            reverse = reverse * 10 + digit;
            numb = numb / 10;
        }

        System.out.println("Reverse = " + reverse);
    }
}

