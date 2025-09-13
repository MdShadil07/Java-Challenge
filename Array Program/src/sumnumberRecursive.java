public class sumnumberRecursive {
    public static void main(String[] args) {
        int num = 908766;
        System.out.println(Sum(num));
    }

    static  int Sum(int num) {
        if (num == 0) {
            return 0;
    }return  (num %10)+ Sum(num/10);
    }

}
