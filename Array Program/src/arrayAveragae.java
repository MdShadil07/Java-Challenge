import java.util.Scanner;

public class arrayAveragae {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of column: ");
        int col = sc.nextInt();

        int arr2d[][] = new int[row][col];

        System.out.println("Enter the element of the Array: ");
        for(int i =0; i<arr2d.length; i++){
            for(int j=0; j<arr2d[i].length; j++){
                arr2d[i][j]= sc.nextInt();
            }
        }

        int size =0;
        for(int i =0; i<arr2d.length; i++){
            size += arr2d[i].length;
        }

        System.out.println("Number of element in the array :" + size);

        int sum = 0;
        for(int i = 0; i<arr2d.length; i++){
            for(int j= 0; j<arr2d[i].length; j++){
                sum += arr2d[i][j];

            }
            System.out.println(sum);
        }

        int average = sum/size;
        System.out.println("Averagae of the arary is: " + average);

    }

}
