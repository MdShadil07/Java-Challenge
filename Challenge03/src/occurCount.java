
import java.util.Scanner;

public class occurCount {

    public static void insertNum (int[]arr, int size, Scanner sc){
     for(int i=0; i<size; i++){
        System.out.println("Enter the"+i+"number");
        arr[i]= sc.nextInt(); 
     }

    } 

     public static void OccurCount(int[]arr, int size, int check){
        int count=0;
        for(int i=0; i<=size; i++){
            if(arr[i]==check){
                count++;
                System.out.println("The given number occuers "+ count + " "+ arr[i]) ;
            }
            
        }
        

     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the number: ");
        int size= sc.nextInt();
        int[]arr= new int[size];
        System.out.println("Enter the number you want to check occuerence ");
        int check = sc.nextInt();
        insertNum(arr, size, sc);
        OccurCount(arr, size, check);

    }


}
