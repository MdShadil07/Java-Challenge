public class SumUnique {
    public static void main(String[] args) {
        int[]arr={12,2,12,3,12};
        System.out.println(uniqueSum(arr));
    }


    public static int uniqueSum(int[]arr){

        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for(int j=0; j<arr.length; j++){
                if(i==j){
                    continue;
                }
                if(arr[i]==arr[j]){
                   isUnique=false;
                   break;
                }
            }
            if(isUnique){
                sum+=arr[i];
            }
        }
        return sum;

    }
    
}
