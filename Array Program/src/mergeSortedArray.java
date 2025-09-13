import java.util.Scanner;

public class mergeSortedArray {
    public static void main(String[] args) {
        Scanner sc =new  Scanner(System.in);
        System.out.println("Enter the size of the first Array:\n ");
        int size= sc.nextInt();
        int []arr1=new int[size];
        System.out.println("Enter the size of the second Array\n: ");
        int size1 = sc.nextInt();
        int []arr2= new int[size1];

        System.out.print("Enter the first array element: ");

        for(int num:arr1){
            arr1[num]=sc.nextInt();
            System.out.print(num);
        }

        System.out.println();

        System.out.println("Enter the second Array Element: ");

        for(int nums:arr2){
            arr2[nums]= sc.nextInt();
            System.out.print(nums);
        }
        System.out.println();

        int[] mergedArr=merger(arr1,arr2);
        System.out.println("Your merged array:");
        for(int nums:mergedArr){
            System.out.println(nums + " ");
        }
        System.out.println();

    }

    public static int[] merger(int[] arr1, int[] arr2){
          int newSize= arr1.length+arr2.length;
          int[] newArr = new int[newSize];

          int i=0,j=0,k=0;
          while(i<arr1.length || j<arr2.length){
              if(j== arr2.length || (i< arr1.length && arr1[i]<arr2[j])){
                  newArr[k]=arr1[i];
                  i++;
                  k++;
              }else{
                  newArr[k]=arr2[j];
                  k++;
                  j++;
              }
          }
          return newArr;

    }

    
}
