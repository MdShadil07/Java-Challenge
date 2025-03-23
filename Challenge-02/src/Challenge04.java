import java.util.Scanner;

public class Challenge04 {
    public static void main(String[] args) {
        //Create a program to calculate the area of a triangle;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Base:");
        float base = sc.nextFloat();
        System.out.print("Enter the height: ");
        float height = sc.nextFloat();
        float result = base * height;
        float area = result/2;

        System.out.println("The area of a triangle: " + area);
    }
}