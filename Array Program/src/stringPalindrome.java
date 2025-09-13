import java.util.Scanner;

public class stringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = sc.nextLine();


        System.out.println("Your String is: "+ str);

        if(!checkPalindrome(str)){
            System.out.println("your string is not palindrome ");
        }else {
            System.out.println("Your string is palindrome");
        }


    }

    public static boolean checkPalindrome(String str){
        int i =0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){

                return false;
            }
            i++;
            j--;
        }
        return true;


    }
}
