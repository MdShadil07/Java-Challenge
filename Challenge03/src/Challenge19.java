import java.util.Scanner;

public class Challenge19 {
    //Create a program to cehck whether a  given number is prime .
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        boolean result = prime(num);
        if(result){
            System.out.println("The Given Number is Prime: " + num);
        }else{
            System.out.println("The given number is not prime: " + num);
        }
    }

    public static boolean prime(int num){
       if (num <= 1){
           return  false;
        }
//here we have started loop from 2 because 1 can divisible any number
       for (int i =2 ; i <num; i++){
           if (num%i == 0){
               return false;
           }
       }
        return true;
    }
}
