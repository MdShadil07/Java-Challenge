import java.util.Scanner;

public class singleNumber136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array :");
//        int size = sc.nextInt();
        int arr[]= {4,1,2,1,2};


        System.out.println(SingleNumber(arr));
    }


    static int SingleNumber(int []arr){
        int num=0;
        if(arr.length==1){
            return arr[0];
        }
        for (int i = 0; i < arr.length; i++) {
            boolean same = false;
            for(int j=1; j<arr.length; j++){
                if(i != j && arr[i]==arr[j]){
                    same = true;
                    break;
                }


            }
            if(!same){
                num =arr[i];

            }
        }
        return num;
    }



    static int singleNumber1(int []arr){

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];

        }
        return ans;
    }
}
