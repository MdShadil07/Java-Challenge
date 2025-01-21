import java.util.Scanner;

public class Challenge03 {
    public static void main(String[] args) {
        //Create a program to determine the greated of the three number;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your first Number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter Your Second Number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter The Third Number: ");
        double num3 = sc.nextDouble();


        if(num1 > num2 && num1 > num3){
            System.out.println("The Greatest Number is: " + num1);

        } else if(num2 > num1 && num2 > num3){
            System.out.println("The Greatest Number: "+ num2);
        }else{
            System.out.print("The Greates number: "+num3);
        }
    }
}
