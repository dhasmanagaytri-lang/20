import java.util.Scanner;
public class StrongNumber {
    static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int temp = n;
                int sum = 0;
                while (temp != 0) {
                    int d = temp % 10;
                    int fact = 1;
                    for (int i = 1; i <= d; i++)
                        fact = fact * i;
                    sum = sum + fact;
                    temp = temp / 10;
                }
                if (sum == n)
                    System.out.println("Strong");
                else
                    System.out.println("Not Strong");
            }
        }
