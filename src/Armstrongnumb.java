import java.util.Scanner;
public class Armstrongnumb {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int digits = 0;
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }
        temp = n;
        int sum = 0;
        while (temp != 0) {
            int d = temp % 10;
            int power = 1;
            for (int i = 1; i <= digits; i++)
                power = power * d;
            sum = sum + power;
            temp = temp / 10;
        }
        if (sum == n)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
