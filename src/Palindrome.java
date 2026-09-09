import java.util.Scanner;
public class Palindrome {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("number");
        int n = sc.nextInt();
        int count = n;
        int reverse = 0;
        while(n>0){
            int d = n % 10;
            reverse = reverse * 10 + d;
            n= n/10;
        }
        if(count == reverse) {
            System.out.println(" no. is palindrome");
        }
        else {
            System.out.println("no. is not a palindrome");
        }

    }
}
