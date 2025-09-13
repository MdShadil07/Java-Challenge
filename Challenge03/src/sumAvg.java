import java.util.Scanner;

public class sumAvg {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the row");
        int row = sc.nextInt();
        System.out.println("Enter the size of the Column");
        int col = sc.nextInt();

        int [][] arr= new int[row][col];
        Insert2D(arr, row, col, sc);
        int result=SumAvg(arr);
        System.out.println("The sum is"+ result);

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

    public static int SumAvg(int[][]arr){
        int sum=0;
        // int avg =0;
        int totalno =0;
        int i=0;
        while(i < arr.length){
            int j=0;
            while(j<arr[i].length){
                sum += arr[i][j];
                totalno++;
                j++;
            }
            i++;
            // double avg = (double) sum/totalno;
            // System.out.println("The Average is "+ avg);

        }
         double avg = (double) sum/totalno;
            System.out.println("The Average is "+ avg);
        return sum;
    }
}