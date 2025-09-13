import java.util.Scanner;

public class MinMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Maximum And Minimum Element\n");
        System.out.println("Enter the Size of the Element");
        int size= sc.nextInt();
        int arr[]= new int[size];

        System.out.print("Enter the element of array: ");

        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
            System.out.print("Element of the arr is:" + arr[i]);

        }

        int max=arr[0];
        int min=arr[0];
      for(int i=0;i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];


            }if (arr[i]<min){
                min=arr[i];
          }

        }

        System.out.println("Maximum element is "+max);
        System.out.println("Minimum element is "+min);


    }
}
