import java.util.Scanner;

public class Challenge22 {
    public static void main(String[] args) {
        //create a program to check if a number is an Armstrong number;

        /*Armstrong number
         example = 153 - here no of digits is 3 so

         we will -- 1^3+5^3+3^3 this should be equal to the number given by user if both the number is equal than the
         number is armstrong number
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        boolean result = Armstrong(num);
        if(result){
            System.out.println("The given number is Armstrong " + num);
        }else{
            System.out.println("The given number is not  Armstrong " + num );
        }

    }

    public static boolean Armstrong(int num){
        int digit = noOfDigits(num);
        int finalNo = 0;
        int copyNum = num;
        while (num >0){
          int lastDigit = num % 10;
          num /= 10;
          finalNo += power(lastDigit, digit);

        }
        System.out.println("Final number is" + finalNo);
        return finalNo == copyNum;

    }

    public static int power(int num1, int num2){
        int result = 1;
        int i =0;
        while(i<num2){
            result *= num1;
            i++;
        }
        System.out.println("Power is" + result);
        return result;
    }


    public static int noOfDigits(int num){
        int digit = 0;
        while(num > 0){
            digit++;
            num /= 10;
        }
        return  digit;
    }
}
