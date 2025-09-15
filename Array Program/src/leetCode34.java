import java.util.Arrays;

public class leetCode34 {
    public static void main(String[] args) {
        int[]arr = {2,3,4,2,4,9};
        int target = 4;
        
        System.out.println(Arrays.toString(SearchRand(arr, target)));
        
    }

    static int[] SearchRand(int []arr, int target){
        int first =-1; 
        int last= -1;
        for (int i = 0; i <arr.length;i++) {
            if(arr[i] == target){
              if(first == -1){
                first=i;
              }
              last =i;
            }
            
        }
        return new int[]{first, last};
    }
}
