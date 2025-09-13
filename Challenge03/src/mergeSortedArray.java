
import java.util.Scanner;

public class mergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int size1= sc.nextInt();
        int[]arr1=new int[size1];
        System.out.println("Enter the Element of the First array ");

        for(int i=0;i<size1; i++){
            System.out.println("Entered"+i+" "+ "Element");
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter the size of the second array");

        int size2 = sc.nextInt();

        int []arr2= new int[size2];

        System.out.println("Enter the Element of the Second Array ");
        for(int i=0;i<size2; i++){
            System.out.println("Entered"+i+" "+ "Element");
            arr2[i]=sc.nextInt();
        }

       int[]result =  merge(arr1, arr2);
       for(int value : result){
         System.out.println("Your Merged Array is"+ value);
       }
    }

    public static int[ ] merge (int[] arr1, int[] arr2){

        int newsize = arr1.length + arr2.length;
        int [] newarr = new int[newsize];
        int i = 0, j= 0, k= 0;
        while(i < arr1.length || j < arr2.length){
            if(j== arr2.length ||(i< arr1.length && arr1[i] < arr2[j])){
               newarr[k]=arr1[i];
               i++;
               k++;
            }else{
                
                newarr[k]=arr2[j];
                j++;
                k++;
            }
        }

        return newarr;
    }
    
}
