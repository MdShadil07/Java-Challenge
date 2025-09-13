public class LeetCode2529 {
    public static void main(String[] args) {
        int arr[]= {5,20,66,1314};
        System.out.println(CheckPosNeg(arr));
    }


    static int CheckPosNeg(int[]arr){
        int pos=0;
        int neg=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                pos++;
            }else if(arr[i]<0){
                neg++;
            }
            
        }
        if(pos>=neg){
                return pos;
            }
        return neg;
    }
    
}
