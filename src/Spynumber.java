import java.util.Scanner;
public class Spynumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int temp = n;
                int sum = 0;
                int product = 1;
                while (temp != 0) {
                    int d = temp % 10;
                    sum = sum + d;
                    product = product * d;
                    temp = temp / 10;
                }
                if (sum == product)
                    System.out.println("Spy");
                else
                    System.out.println("Not Spy");
            }
        }
