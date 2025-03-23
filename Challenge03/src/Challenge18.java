import java.util.Scanner;

public class Challenge18 {
    //Create a program to find the Greatest Common Divisor (GCD) of two integers.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = sc.nextInt();
        System.out.print("Enter the second number: ");
        int second = sc.nextInt();
        int result = greatestCommonDivisor(first, second);
        System.out.println(result);
    }

    public static  int greatestCommonDivisor(int first, int second){
         int gcd = 1;
         int i = 1;
         int least = least(first, second);

         while (i <= least){
             if(first % i == 0 && second % i == 0){
                 gcd = i;
             }
             i++;
         }
         return gcd;
    }

    public static int least(int first, int second){
        if(first < second) return  first;
        else return second;
    }
}
