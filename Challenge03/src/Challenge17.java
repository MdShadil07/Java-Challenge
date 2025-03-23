import java.util.Scanner;

public class Challenge17 {
    public static void main(String[] args) {
        //Create a progaram to find the least common multiple of two number

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : " );
        int first = sc.nextInt();
        System.out.print("Enter Second Number : " );
        int second = sc.nextInt();
        int result = lcm(first,second);
        System.out.println("LCM of two number is: " + result);
    }

    public static int lcm(int first, int second){
        int i =1;
        while (true){
            int factor = first*i;
            if(factor % second == 0){
                return factor;
            }
            i++;
        }
    }
}
