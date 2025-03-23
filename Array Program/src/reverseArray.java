import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to the reverse Array");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size= sc.nextInt();
        int[] arr= new int[size];

        System.out.println("Enter the elment of the aray: ");
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }

        for(int nums:arr){
            System.out.print("Arrays are: " + nums);
        }
        System.out.println();

        reversedArray(arr);
        System.out.println("Array after reversing: "+  Arrays.toString(arr));
    }

    public static void reversedArray(int[] arr){
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move pointers
            left++;
            right--;
        }



    }
}
