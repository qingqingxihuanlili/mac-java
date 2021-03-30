package demo.Fibonacci;

public class TestFibonacci {
    public static void main(String[] args) {
        /*
        * 斐波那契数列
        *
        * 1 1 2 3 5 8 13 21
        *
        * 第n项等于 第n-1项和第n-2项的和
        *
        * 递归 有两个部分 一个部分是循环调用，一个部分是结束标志
        *
        * */
        System.out.println(fibonacci(8));

    }
    public static int fibonacci(int n){

        if(n == 1 || n ==2){
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
