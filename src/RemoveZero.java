import java.util.Scanner;
public class RemoveZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = 0;
        int place = 1;

        while (n != 0) {
            int d = n % 10;

            if (d != 0) {
                result = result + d * place;
                place = place * 10;
            }

            n = n / 10;
        }

        System.out.println(result);
    }
}
