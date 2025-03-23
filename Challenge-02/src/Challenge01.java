import java.util.Scanner;

public class Challenge01 {
    public static void main(String[] args) {
        //Create a program that takes two number and shows result of all arithmetic operator(+,-,/,%);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");

        int num1 = sc.nextInt();

        System.out.println("Enter the Second Number: ");

        int num2 = sc.nextInt();

        int Result = num1+num2;

        System.out.println("Addition: "+ Result);

        Result = num1 - num2;

        System.out.println("Subtraction: " + Result);

        Result = num1*num2;

        System.out.println("Multiplication: "+ Result);

        Result = num1 / num2;

        System.out.println("Division: " + Result);

        Result = num1 % num2;

        System.out.println("Modules: "+ Result);
    }
}