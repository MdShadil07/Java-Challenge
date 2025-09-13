
import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the row");
        int row = sc.nextInt();
        System.out.println("Enter the size of the Column");
        int col = sc.nextInt();

        int [][] arr= new int[row][col];
        Insert2D(arr, row, col, sc);
        System.out.println("Enter the element You want to Search ");
        int search = sc.nextInt();
        Search2d(arr, search, row, col);



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

    public static void Search2d(int [][]arr, int search, int row, int col){
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j]==search){
                    System.out.println("Your Element found At Position" + i + " "+ j);
                }else{
                    System.out.println("Your Element does not found");
                }
            }
        }
    }


}
