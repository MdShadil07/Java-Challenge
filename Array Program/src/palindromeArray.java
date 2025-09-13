import java.util.Scanner;

public class palindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WE  ARE CHECKING WHEATHER A ARARY IS PLINDROME OR NOT");
        System.out.print("Enter the size of the array :");
        int size= sc.nextInt();
        int [] arrr= new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the" +i+"element :" );
            arrr[i]=sc.nextInt();
        }

        for(int num : arrr){
            System.out.print("Your Array is: " + num);
        }
        System.out.println();

        if (checkPalindrome(arrr)) {
            System.out.println("The given array is palindrome");
        }else {
            System.out.println("The given array is not palindrome");
        }
    }

//jtwo pointers approach
    public static boolean checkPalindrome(int []arrr){
     int left=0,right=arrr.length-1;
     while(left<right){
         if(arrr[left] != arrr[right]){
             return false;
         }
         left++;
         right--;
     }
     return true;
    }
}
