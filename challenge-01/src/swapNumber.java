import java.util.Scanner;

public class swapNumber {
    public static void main(String[] args) {
       //swap two number using assignment operator
       // if a=5 , b=45 than after swap it should be a=45, b=5;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of B: ");
        int b = sc.nextInt();
        int c=a ;
        a=b;
        b=c;

        System.out.println("Changed Value of A:" +  a);
        System.out.println("Changed Value of B:" +  b);

    }
}