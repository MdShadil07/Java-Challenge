import java.util.Scanner;

public class Challenge13 {
    public static void tableNo(int num){
 //        int i = 1;
//        while (i<=10){//using while loop
//           int res = i*num;
//            System.out.println(res);
//            i++;
//        }
        for(int i = 1; i<=10; i++){ //using for loop
            int res = i*num;
            System.out.println( num + "x" + i +"=" +res);

        }
    }
    public static void main(String[] args) {
        //Develop a program that prints the multiplication table for a given number.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        tableNo(n);


    }
}
