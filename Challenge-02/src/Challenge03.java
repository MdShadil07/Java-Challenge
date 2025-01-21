import java.util.Scanner;

public class Challenge03 {
    public static void main(String[] args) {
        //Create a program to calculate perimeter of a rectangle
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        float length = sc.nextFloat();
        System.out.print("Enter the Width: ");
        float width = sc.nextFloat();

        float result = length * width;
        float perimeter = 2*result;

        System.out.println("Perimeter of a rectangle: " + perimeter);
    }
}
