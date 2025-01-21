import java.util.Scanner;

public class Challenge05 {
    public static void main(String[] args) {
        // Create a program to calculate simple & compound interest
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the loan amount (Principal): ");
        float amount = sc.nextFloat();

        System.out.print("Enter the duration for the loan (in years): ");
        float time = sc.nextFloat();

        float rate = 5; // Fixed rate of interest (in %)

        // Calculate simple interest
        float result = (amount * rate * time) / 100;
        float result2 = amount*(1+rate/100)*time;
        // Display the result
        System.out.println("\nSimple Interest Calculation:");
        System.out.println("Principal Amount: " + amount);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Time Duration: " + time + " years");
        System.out.println("Calculated Simple Interest: " + result);
        System.out.println("Calculated Compound Interest: " + result2);


    }
}
