import java.util.Scanner;

public class Challenge11 {
    public static void main(String[] args) {
        System.out.println("Bitwise Right-shift");
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//to understand this better once understand the concept of right and left shift
        int result = num >> 2;
        System.out.println(result);

    }
}
