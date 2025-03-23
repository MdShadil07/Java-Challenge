import java.util.Scanner;

public class pattern25 {
    // print the pattern

////    *****
//      ****
//      ***
//      **
//      *
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    patter2(num);
}

public static void patter2(int num){
    for(int i = 0; i<num; i++){
        for(int j =0; j<num-i; j++){
            System.out.print("*");
        }

        System.out.println();
    }

}
}
