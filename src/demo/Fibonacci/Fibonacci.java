package src.demo.Fibonacci;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {

        int[] arr = new int[]{2,6,7,24,36,65,88,1000};

        int result = searchFibonacci(arr,100);

        System.out.println("要查找的位置是第 " +result+ " 位");

    }

    /*
    *
    *   1. 找到k值
    *   2. 根据k值，补全arr数组
    *   3. 将多余的位置全部变成arr的最后一位
    *   4. 查找
    *       4-1. 根据公式 low + [k-1] - 1 找到mid
    *       4-2. 如果要查询的值，在temp[mid] 左侧
    *       4-3. 如果要查询的值，在temp[mid] 右侧
    *       4-4. 如果找到了 = temp[mid]
    * */
    private static int searchFibonacci(int[] arr, int target) {

        int[] fibonacci = getFibonacci(10);
        int k =0;
        int low = 0;
        int high = arr.length - 1;

        // 1. 找到k值
        while (high > fibonacci[k] - 1){
            k++;
        }

        // 2. 根据k值，补全arr数组

        int[] temp = Arrays.copyOf(arr,fibonacci[k]);

        // 3. 将多余的位置全部变成arr的最后一位
        for (int i = high +1; i < temp.length; i++) {

            temp[i] = arr[high];
        }

        int mid = 0;
        // 4. 查找
        while (low <= high){

            // 4-1. 根据公式 low + [k-1] - 1 找到mid
            if (k == 0){
                // 如果 k = 0 的话，就只有一个元素了，mid 则就是这个元素
                mid = low;
            }else {
                mid = low + fibonacci[k-1] - 1;

            }

            // 4-2. 如果要查询的值，在temp[mid] 左侧
            if (target < temp[mid]){
                high = mid - 1;
                k--;
            }

            // 4-3. 如果要查询的值，在temp[mid] 右侧
            else if (target > temp[mid]){
                low = mid + 1;
                k -= 2;
            }

            // 4-4. 如果找到了 = temp[mid]
            else {
                if (mid <= high){
                    return mid;
                }else {
                    return high;
                }
            }



        }

        return -1;
    }

    static int[] getFibonacci(int n){

        int[] fibonacci = new int[n];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        return fibonacci;
    }
}
