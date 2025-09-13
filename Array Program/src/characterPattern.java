import java.util.Scanner;

public class characterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input size :");
        int size = sc.nextInt();
        for(int i =0; i<size; i++){
            char c = '@';
            for(int j=0; j<i; j++){
                System.out.print((char)(c+i));
                c++;
            }
            System.out.println();
        }
    }
}
