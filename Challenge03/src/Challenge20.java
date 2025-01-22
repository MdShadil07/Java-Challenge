import java.util.Scanner;

public class Challenge20 {
    public static void main(String[] args) {
        //Create a program to reverse the digits of a numeber

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        int result = reverse(num);
        System.out.println(result);
    }

    public static int reverse(int num){
        int newNum = 0;
        while (num > 0){
           int digit = num % 10;
           newNum = newNum * 10 + digit;
           num /= 10;

        }
        return newNum;
    }
}
