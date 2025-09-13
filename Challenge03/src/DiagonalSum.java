
import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        // create a program to find the sum of two diagonal element 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the row ");
        int row = sc.nextInt();
        System.out.println("Enter the size of the column ");

    int col= sc.nextInt();
        int [][] arr= new int[row][col];
        Insert2D(arr, row, col, sc);
        long sumDiagonal =  sumOfDiagonal(arr);
        System.out.println("Sum of the diagonal is"+ sumDiagonal);

    }

     public static int[][] Insert2D(int[][]arr, int row, int col, Scanner sc){
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                arr[i][j]=sc.nextInt();
                System.out.println("Your Indices "+ i + j + " " +"Element are"+ arr[i][j]);
            }
        }
        return arr;
    }

    public static long sumOfDiagonal(int[][]arr){
        long leftsum = sumOfLeftDiagonal(arr);
        long rightsum = sumOfRightDiagonal(arr);
        long sum = leftsum + rightsum;
        if(arr.length % 2 != 0){
            int ind = arr.length / 2;
            sum -= arr[ind][ind];

        }


        return sum;
    }

     public static long sumOfLeftDiagonal(int[][]arr){
        long sum =0;
        int i=0;
        while(i<arr.length){
            sum += arr[i][i];
            i++;
        }
        return sum;
    }

     public static long sumOfRightDiagonal(int[][]arr){
        long sum =0;
        int i=0;
        while(i < arr.length){
            int col = arr.length -1 -i;
            sum += arr[i][col];
            i++;
        }
        
        return sum;
    }
    
}
