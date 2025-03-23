import java.util.Scanner;

public class Challenge05 {
    public static void main(String[] args) {
        //Create a program that calculates grades based on marks

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your percentage: ");
        int grade = sc.nextInt();

        if(grade > 90){
            System.out.println("A");
        }else if(grade > 75){
            System.out.println("B");
        }else if(grade > 60){
            System.out.println("C");
        }else if(grade > 30){
            System.out.println("D");
        }else {
            System.out.println("F");
        };
    }
}
