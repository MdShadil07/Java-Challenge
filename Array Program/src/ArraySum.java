import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows");

        int row = sc.nextInt();
        System.out.print("Enter the number of column");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];
        System.out.println("Enter the element of the Array");

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();

            }
        }

        System.out.println("This is your Entered input");
        for(int i =0; i< arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }


        int sum = 0;
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                sum += arr[i][j];
            }
        }

        System.out.print("The Sum of the element is: "+ sum);


    }
}