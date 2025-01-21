import java.util.Scanner;

public class Challenge16 {
    //Create a program that computes the sum of the digits of an integer;
     public static  int sumOfDigits(int num){
         int sum = 0;
         while(num > 0){
             sum += num % 10;
             num /= 10;
         }
         return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int result = sumOfDigits(n);
        System.out.println(result);
    }

}
