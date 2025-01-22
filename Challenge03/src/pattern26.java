import java.util.Scanner;

public class pattern26 {
    public static void main(String[] args) {
        //print the patten
//
//        *
//       **
//      ***
//     ****
//    *****

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        pattern3(num);
    }

    public static void pattern3(int num){
        for(int i = 0; i<num; i++){
            for(int j =0; j<num-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k<i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
