import java.util.Scanner;

public class pattern24 {
    //print the pattern

    /*
    *
    **
    ***
    *****
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        pattern(num);

    }

    public static void pattern(int num){
        for(int i = 1; i<=num; i++){
            for(int j =1 ; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
