import java.util.Scanner;

public class Challenge01 {
    public static void main(String[] args) {
        //Create a program that determines if a number is positive, negative, or zero
        Scanner sc=new  Scanner(System.in);
        System.out.print("Enter your number: ");
        double num = sc.nextDouble();
        if(num > 0){
            System.out.println("The number is positive" + num);
        } else if ( num < 0){
            System.out.println("The number is negative" + num);

        } else {
            System.out.println("The entered number is Zero" + num);
        }

    }
}