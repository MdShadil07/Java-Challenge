import java.util.Scanner;

public class Challenge12 {
    //Create a program to check if a given number is even or odd using bitwise operators
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = sc.nextInt();

        if((num & 1) == 0){
            System.out.println("Even Number" + num);
        } else {
            System.out.println("Odd Number" + num);
        }
    }

}
