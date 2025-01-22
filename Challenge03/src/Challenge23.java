import java.util.Scanner;

public class Challenge23 {
    //create a program to verify if a number is a palindrome.

//    palindrome are the number which are equal even when it it reversed -- ex
//    131 if you reverse it it will be the same

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number");
        int num = sc.nextInt();
        boolean result = isPalindrome(num);
        if(result){
            System.out.println("The given number is palindrome");
        }else System.out.println("The given number is not palindrome");
    }

    public static boolean isPalindrome(int num){
        int i = 0;
        int newNum = 0;
        int copyNum = num; // here we have store the num for comparison
        while(i<num){
           int digits = num % 10;
            newNum = newNum* 10 + digits;
            num /= 10;

        }
        return newNum == copyNum;
    }
}
