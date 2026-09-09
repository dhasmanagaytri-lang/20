import java.util.Scanner;
public class AutomorphicNumber {
   public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int square = n * n;
                int temp = n;
                int power = 1;
                while (temp != 0) {
                    power = power * 10;
                    temp = temp / 10;
                }
                if (square % power == n)
                    System.out.println("Automorphic");
                else
                    System.out.println("Not Automorphic");
            }
        }

