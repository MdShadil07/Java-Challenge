import java.util.Scanner;

public class Challenge10 {
    public static void main(String[] args) {
        //Left-Shift bitwise operator
            System.out.println("Bitwise Left-shift");
            System.out.print("Enter the number: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            int result = num<< 2;
            System.out.println(result);


    }
}
