public class LeetCode35 {
    public static void main(String[] args) {
        int[]ar={1,3,5,6};
        int target=7;
        System.out.println(SearchIndex(ar, target));
        
    }

 static  int SearchIndex(int[] arr, int target){
    int size = arr.length;
    for (int i = 0; i < arr.length;) {
        while(arr[i]<=size){
            if(arr[i]<target){
                i++;
            }
       
    }
        i++;
    }
   return size;
    
    }
}