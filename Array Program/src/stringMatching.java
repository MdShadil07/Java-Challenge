import java.util.Scanner;

public class stringMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num=sc.nextInt();
        if(num % -3==0){
            System.out.println("Given number is Even" + num);
        }else{
            System.out.println("Given number is odd"+ num);
        }
    }
}
