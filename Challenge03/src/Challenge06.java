import java.util.Scanner;

public class Challenge06 {
    public static void main(String[] args) {
        //Create a program that shows bitwise AND of two number.

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num1 = sc.nextInt();

        int result = num & num1;
        System.out.println(result);

    }
}
