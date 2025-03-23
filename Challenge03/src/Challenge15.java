import com.sun.source.doctree.EscapeTree;

import java.util.Scanner;

public class Challenge15 {
    //write a funciton that calculated the factorial of a given number
   public static long factorial(int num){
       int res = 1;
       for(int i = 1; i<=num; i++){
            res *=i;

       }
       return res;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        long result = factorial(num);
        System.out.println(result);

    }
}
