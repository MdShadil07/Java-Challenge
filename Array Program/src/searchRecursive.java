public class searchRecursive {
    public static void main(String[] args) {
        int[]arr= {2,3,1,4,4,5};
        int target = 4;
        System.out.println(findIndexlast(arr,target, arr.length-1));
    }

    static int findIndexlast(int [] arr, int target , int index){
        if(index == -1){
            return -1;
        }
        if(arr[index]== target){
            return index;

        }else {
            return findIndexlast(arr, target, index -1);
        }
    }
}
