public class leetCode26 {
    public static void main(String[] args) {
        
    }

    static int[]Dublicate(int[]arr){
        int[]NewArr = new int[arr.length];
    
        for (int i = 0; i < arr.length; i++) {
          if(arr[i]!=arr[i+1]){
            NewArr[i] = arr[i];
          }
        }

        
    }
    
}
