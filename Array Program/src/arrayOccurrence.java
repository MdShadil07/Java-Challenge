import java.util.Scanner;

public class arrayOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Array Occurrences\n");
        System.out.println("Enter the size of the Element: ");
        int size = sc.nextInt();
        int[] numArr = new int[size];
        

        System.out.println("Enter the element of the array....");
        for (int i = 0; i < size; i++) {
           int res=  numArr[i] = sc.nextInt();
            System.out.print("Element of the array is: " + numArr[i]);
        }

        System.out.println("Enter the value you want to check occurness: ");
        int target= sc.nextInt();
        int count = 0;

        for(int i=0; i<numArr.length; i++){
            if(numArr[i]==target){
                count++;

            }

            
    }
        System.out.print ("The number " + target +" occured "+ count+" Times");



    }
}
