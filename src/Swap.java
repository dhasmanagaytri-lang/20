import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int last = n % 10;
        int temp = n;
        int power = 1;

        while (temp >= 10) {
            temp = temp / 10;
            power = power * 10;
        }

        int first = temp;

        n = n - first * power;
        n = n - last;
        n = n + last * power;
        n = n + first;

        System.out.println(n);
    }
}