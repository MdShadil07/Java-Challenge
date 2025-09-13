
import java.util.Scanner;

public class checkPalindrome {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []original= new int[size];
        int []reversed= new int[size];

        for(int i=0; i<size; i++){
             System.out.println("Enter the"+ i+"element");
            original[i]=sc.nextInt();
           
        }

        palindromecheck(original, size);
    }

    public static void palindromecheck(int[]arr, int size){
        int left=0;
        int right= arr.length-1;
        while(left<right){
            int temp=arr[left];
        
            arr[left]=arr[right];
            arr[right]=temp;
         
            left++;
            right--;
            
            
        }

         System.out.print("Reversed array: ");
    for (int value : arr) {
        System.out.print(value + " ");
    }
    System.out.println();
         
    }
    
}
