package src.demo.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = new int[]{5,8,9,6,4,5,2,3,10,52,14,36,48,100,2,7};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start, int end) {

        /*
         *   递归结束条件：参数传入的起始位置大于结束位置，证明已经全部排序完成
         * */
        if (start < end){

            // 定义基准位置，用于比较，把比它大的放后面，比它小的放前面.通常要排序的第一个位置
            int standard = arr[start];

            // 定义前后浮标位置，用于移动，进行数据比较
            int low = start;
            int high = end;

            while (low < high){

                /*
                 *  将比基准大的数字放到基准后面
                 * */
                while (low < high && standard <= arr[high]){
                    high--;
                }

                /*
                 * 如果比基准小，就要换位置
                 * */
                arr[low] = arr[high];

                /*
                 *  将比基准小的数字放到基准前面
                 * */
                while (low < high && standard >= arr[low]){
                    low++;
                }

                /*
                 * 如果比基准小，就要换位置
                 * */
                arr[high] = arr[low];
            }
            // 将基准赋值给两个已经相等的high或者low
            arr[low] = standard;
            /*
             * 分别递归调用，基准之前的数组，基准之后的数组。
             * 分支排序
             * */

            quickSort(arr,start,low-1);
            quickSort(arr,low+1,end);
        }


    }
}
