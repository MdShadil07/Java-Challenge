public class leetCode1672 {
    public static void main(String[] args) {
        int [][]arr= {
            {12,12,1,3,4},
            {34,1,3,9,0},
            {1,56,2,4,1}
        };

        System.out.println(maxWealth(arr));


    }

    static int maxWealth(int[][]arr){
        int max=0;
       
       
        for (int i = 0; i < arr.length; i++) {
             int sum =0;
            for(int j =0 ; j<arr[i].length; j++){
                
                sum +=arr[i][j];
                
                
            }
            // max = Math.max(max, sum);
            if(sum > max){
                max = sum;
            }
            
        }
        return max;
    }
}
