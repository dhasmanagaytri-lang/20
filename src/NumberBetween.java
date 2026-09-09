import java.util.Scanner;
public class NumberBetween {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        if(number>= 10 && number<=50){
            System.out.println("Number is between 10 and 50");

        }
        else{
            System.out.println("Not between 10 and 50");
        }
    }
}
