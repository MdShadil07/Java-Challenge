import java.util.Scanner;

public class sumAverage2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the average of the Array");
        System.out.println("Enter the number of rows :");
        int row= sc.nextInt();
        System.out.println("Enter the number of col :");
        int col = sc.nextInt();

        int arr[][]=new int[row][col];

        System.out.println("Enter the element :");
        for(int i =0; i<row; i++){
            for(int j=0; j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int sum =0;
        for(int i =0; i<row; i++){
            for(int j=0; j<col;j++){
               sum += arr[i][j];
            }
        }

        System.out.println("Sum of the Array: "+ sum);

        int count = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                count++;
            }
        }

        System.out.println(count);

        double average = (double) sum/count;
        System.out.println("Average Of the Array :" + average);

        sc.close();
    }
}
