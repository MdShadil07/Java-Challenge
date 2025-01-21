import java.util.Scanner;

public class Challenge14 {
    //Create a program to sum all odd numbers form 1 to a specified number n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i<=num; i++){

            if(i % 2 != 0){
                sum += i;

            }
        }
        System.out.println(sum);
    }
}
