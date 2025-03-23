import java.util.Scanner;

public class Challenge02 {
    public static void main(String[] args) {
        //Create a program that a number is odd or even--

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your number: ");
        double num = sc.nextDouble();
        if(num%2 == 0){
            System.out.println("The Number is Even " + num);
        } else{
            System.out.println("The Number is odd " +num);
        }

    }
}
