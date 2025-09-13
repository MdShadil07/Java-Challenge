import java.util.Scanner;

public class mergeSortedArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int size1= sc.nextInt();
        System.out.println("Enter the Element of the first Array: ");
        int[] arr1=new int[size1];

        for(int i=0; i<size1; i++){
            arr1[i]=sc.nextInt();

        }

    }
}
