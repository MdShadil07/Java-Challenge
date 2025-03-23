import java.util.Scanner;

public class deleteSpecific {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Delete the element and return new array ");

        System.out.println("Enter the size of the element");
        int size= sc.nextInt();
        System.out.println("Enter the elementL: ");
        int arr[]= new int[size];
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }

        System.out.print("Enter the index you want to delete: ");
        int target=sc.nextInt();

        int []res= newArr(arr,target);
        for(int num : res){
            System.out.print(num);
        }

        System.out.println();

    }

    public static int[] newArr(int[] arr, int target){
        int newArr[]= new int[arr.length-1];
        for(int i=0,j=0;i<arr.length;i++){
            if(i==target){
                continue;
            }
            newArr[j++] = arr[i];
        }
        return newArr;
    }
}
