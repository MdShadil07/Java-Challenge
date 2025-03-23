import java.util.Scanner;

public class deleteAtspecific {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Delete an element and return a new array");

        System.out.print("Enter the size of the Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the index of the element you want to delete: ");
        int pos = sc.nextInt();

        if (pos < 0 || pos >= size) {
            System.out.println("Invalid index! Please enter a valid index.");
        } else {
            int[] newArray = deleteElement(arr, pos);

            System.out.println("New Array after deletion: ");
            for (int num : newArray) {
                System.out.print(num + " ");
            }
        }
        sc.close();
    }

    public static int[] deleteElement(int[] arr, int pos) {
        int newArr[] = new int[arr.length - 1]; // New array with one less element
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == pos) {
                continue; // Skip the element at 'pos'
            }
            newArr[j++] = arr[i]; // Copy elements to the new array
        }
        return newArr;
    }
}
