
public class leetCode1295{
     public static void main(String[] args) {
        int []arr= {555,901,482,1771};

        //find the number with even number of digits 

        //for example if you have a number llike 345 it has 3 number of digits so we have to find the num with even 
        //number of digits here 3 is not even so it will return false and we have to return the number of digits 
       int []result = CountDigits(arr);
       System.out.println(result.toString());
        System.out.println(EvenDigits(arr));
     }

     static int   EvenDigits(int[]arr){
        int []res = CountDigits(arr);
        int count= 0;
        
        for (int i = 0; i < res.length; i++) {
            
            if(res[i]%2==0){
                count ++;
            }
        }
        return count;
     }


     static int[] CountDigits(int []arr){
        
        int[]countDigits=new int[arr.length];
        for(int i=0; i<arr.length; i++){
            int count=0;
            int num = arr[i];
            while(num > 0){
                count++;
                num=num/10;
                countDigits[i]=count;
            }
        }
        
        return countDigits;
     }
}