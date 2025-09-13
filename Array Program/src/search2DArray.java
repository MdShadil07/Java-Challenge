import java.util.Scanner;

public class search2DArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Create a 2D array and search for a target value");
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns");
        int col = sc.nextInt();

        int [][]arr= new int[row][col];

        System.out.print("Enter the element of the 2D Array: ");

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Your Array is ");
       for(int i = 0; i<row; i++){
           for(int j=0; j<col; j++){
               System.out.print(arr[i][j]+ " ");
           }
       }

        System.out.print("Enter the Element you want to search...");
       int target = sc.nextInt();

       boolean found = false;
       for(int i=0;i<row; i++){
           for(int j=0; j<col; j++){
               if(target== arr[i][j]){
                   System.out.println("Element " + target + " found at position (" + i + ", " + j + ")");
                   found = true;
               }
           }
           if (!found){

               System.out.println("The number is not there");
           }
       }

    }
}
