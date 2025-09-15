public class removeDublicate {
    public static void main(String[] args) {
        int []arr= {12,12,3,2,1};
        System.out.println(removeDub(arr));

        //array must be sort in non-decreasing order 

    }

    static int removeDub(int []arr){
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            
            if(arr[i] != arr[j]){
                j++;
                arr[j]=arr[i];
            }

        }
        return j+1;
    }
}
