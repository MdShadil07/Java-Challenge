import java.util.Arrays;
import java.util.Scanner;

public class quick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();
        int []arr= new int[size];

        System.out.println("Enter the Array Element : ");
        for(int i =0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        int low = 0;
        int high = arr.length-1;
        quickSort(arr,low, high);
        System.out.println(Arrays.toString(arr));
    }


    public static void quickSort(int[] arr, int low, int  high){
        if(low < high){
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }

    }


    public static int partition (int []arr, int low , int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j]= arr[i];
                arr[i]= temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return  i+1;
    }
}
