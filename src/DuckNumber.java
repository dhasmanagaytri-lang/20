import java.util.Scanner;
public class DuckNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean duck = false;
        while (n != 0) {
            if (n % 10 == 0) {
                duck = true;
                break;
            }
            n = n / 10;
        }
        if (duck)
            System.out.println("Duck");
        else
            System.out.println("Not Duck");
    }
}