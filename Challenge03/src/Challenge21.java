import java.util.Scanner;

public class Challenge21 {
    //Create a program to print the fibonacci series upto a certain number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Your result: ");
        fibonacci(num);
    }

    public  static void fibonacci(int num){
        if(num < 0) return;
        System.out.print("0 ");
        if(num == 0) return;
        System.out.print("1 ");

        int first = 0;
        int second = 1;

        while(first + second <= num){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }

    }

}
