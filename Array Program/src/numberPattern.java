import java.util.Scanner;

public class numberPattern {
////    1
//    21
//    321
//    4321
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of row :");
    int num= sc.nextInt();

    for(int i=1;i<=num;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i-j+1);
        }
        System.out.println();
    }
}
}
