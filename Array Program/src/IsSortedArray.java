import java.util.Scanner;

public class IsSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("finding sorted Array:" );
        System.out.print("Enter the size of the Array: ");
        int size= sc.nextInt();
        int[] numArr = new int[size];

        System.out.println("Enter the Element of the Array ");
        for(int i=0;i<size; i++){
            numArr[i]=sc.nextInt();

        }

        boolean isInc = isIncreasing(numArr);
        boolean isDec = isDecreasing(numArr);

        if(isInc || isDec){
            System.out.println("Your Array is sorted");
        }else {
            System.out.println("Your array is not sorted");
        }

    }
    public static boolean isIncreasing(int[] numArr){
       int i=1;
       while(i<numArr.length){
           if(numArr[i]<numArr[i-1]){
               return false;
           }
           i++;
       }
        return true;
    }
    public static boolean isDecreasing(int[] numArr){
        int i=1;
        while(i<numArr.length){
            if(numArr[i]<numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;


    }

}
