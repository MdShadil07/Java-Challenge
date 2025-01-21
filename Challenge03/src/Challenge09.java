import java.util.Scanner;

public class Challenge09 {
    //Bitwise NOT (Complement)
    public static void main(String[] args) {
        System.out.println("Bitwise NOT");
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result = ~num;
        System.out.println(result);
    }

}
