package src.demo.sort;

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {

        int[] arr = new int[]{5,8,9,6,4,5,2,3,10,52,14,36,48,100,2,7};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void selectSort(int[] arr) {

        // 遍历所有的数字
        for (int i = 0; i < arr.length - 1; i++) {

            // 找到最小的
            int minIndex = i ;

            for (int j = i + 1; j<arr.length;j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }

            // 如果相等，证明本身就是最小的不需要交换
            if (i != minIndex){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
