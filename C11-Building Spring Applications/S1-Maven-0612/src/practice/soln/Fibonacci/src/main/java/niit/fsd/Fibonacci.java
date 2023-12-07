package niit.fsd;

public class Fibonacci {
    public static int get(int n) {
        int fn = 1;
        int fn_1 = 0;

        if (n == 0) {
            return fn_1;
        }
        if (n == 1) {
            return fn;
        }

        for (int i = 2; i <= n; i++) {
            int sum = fn + fn_1;
            fn_1 = fn;
            fn = sum;
        }
        return fn;
    }

    public static void main(String[] args) {
        for(int i =0; i < 10; i++){
            int num = Fibonacci.get(i);
            System.out.print(num + " ");
        }
    }
}
