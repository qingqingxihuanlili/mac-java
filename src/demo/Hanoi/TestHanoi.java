package src.demo.Hanoi;

public class TestHanoi {
    public static void main(String[] args) {
        /*
        *       汉诺塔问题
        *
        *       函数参数有四个  n个圆盘 from初始位置 in 中间位置 to 目标位置
        *
        *       递归思路，将n-1个圆盘 放到中间位置，将第n个放到目标位置,将第n-1个圆盘放到目标位置
        *
        * */
        hanoi(3, 'A', 'B', 'C');
    }

    public static void hanoi(int n,char from,char in,char to){
        if( n == 1){
            System.out.println("将第"+n+"个圆盘从"+from+"放到"+to);
        }
        else {
            // 将n-1 个圆盘放到中间位置
            hanoi(n-1,from,to,in);
            // 将第n个圆盘放到目标位置
            System.out.println("将第"+n+"个圆盘从"+from+"放到"+to);
            // 将n-1 个圆盘放到目标位置
            hanoi(n-1,in,from,to);
        }
    }
}
