import java.util.Scanner;

public class leetcode540 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size fo the array :");
        int size = sc.nextInt();

        int[]arr = new int[size];

        System.out.println("Enter the element :");

        for(int i = 0 ; i< size; i++){
            arr[i]=sc.nextInt();
        };

        //QUESTION -- YOU HAVE GIVEN A SET OF ARRAY YOU HAVE TO RETURN THE ELEMENT WHICH APPEAR ONCE IN THE ARRAY
//        arr= {1,1,2,3,3,8,8}
//          OUTPUT SHOULD BE --- 2  YOUR SOLUTION MUST RUN N(NlOGN) and SPACE COMPLEXITY SHOULD BE O(1)
//
//          arr = [3,3,7,7,10,11,11]
//          OUTPUT SHOULD BE =---  10







 }

 static int singleNonDublicate(int[]arr){
        int num = 0;

     for (int i = 0; i < arr.length; i++) {

         num ^=arr[i];
     }
        return num;
 }
 }
