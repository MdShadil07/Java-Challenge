public class LeetCode744 {
    public static void main(String[] args) {
        //You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
        //Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.
//         Example 1:
// Input: letters = ["c","f","j"], target = "a"
// Output: "c"
// Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
// Example 2:
// Input: letters = ["c","f","j"], target = "c"
// Output: "f"
// Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.

   char[]arr={'c','f','j'};
   char target = 'c';
   System.out.println(nextGreatestLetter(arr,target));

    }


    static char nextGreatestLetter(char []arr, char target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end - start)/2;
            
            if(target<arr[mid]){
                end = mid -1;
                 
            }else if(target >arr[mid]){
                
                start = mid + 1;
            }else{
                return arr[mid];
            }
        }

        return arr[start % arr.length];

    }
    
}
