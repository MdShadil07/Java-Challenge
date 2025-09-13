import java.util.Arrays;
import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();
        int []arr= new int[size];
        System.out.println("Enter the Element: ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();


        }
//       Arrays.sort(arr);

      for(int num: arr){
          System.out.print(num+ " ");
      }
        System.out.println();
        int largest = arr[0];
        int secondLargest = arr[0];
        for(int i=0;i <arr.length; i++){

            if(largest < arr[i]){

                secondLargest = largest;
                largest = arr[i];
            }else if (secondLargest <=arr[i] && arr[i] != largest){
                secondLargest =arr[i];

            }


    }
        System.out.print("largest "+largest);
        System.out.println("Second largest :" +secondLargest);
    }

}
