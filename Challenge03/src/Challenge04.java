import java.util.Scanner;

public class Challenge04 {
    public static void main(String[] args) {
        //Create a program to check that a given year is a leap yaer or not

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");

        int year = sc.nextInt();

        if((year%4==0 && year%100 !=0  ) || (year % 400 == 0)){
            System.out.print("the leap year is: " + year);
        }else {
            System.out.print("The given year is not a leap year: " + year);
        }
    }
}
