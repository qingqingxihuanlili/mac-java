package demo.sort;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
        int[] arr = new int[]{5,8,9,6,4,5,2,3,10,52,14,36,48,100,2,7};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {

        /*
        *  默认之前的都是有序的
        *
        * 当一个新的数字来的时候（i） 与当前最末尾的数字比较（i-1） 如果大于就还是有序，如果小于就要操作
        * 操作就是，找到这个i应该存在的位置，因为之前的数组已经排好序了，遍历这个数字找到这个位置
        * 这个位置就是前面的数字比i小，后面的数字比i大，然后插入。
        *
        * */

        // 遍历所有的数字,因为是默认之前是有序的，从1开始，因为前面的零只有一个，就肯定是有序的。
        for (int i = 1; i < arr.length; i++) {
            // 如果当前数字比前一个数字小
            if (arr[i] < arr[i-1]){
                // 先把当前数字保存起来
                int temp = arr[i];
                // 遍历当前数字前面的所有数字，用于找到temp的位置好插入进去。
                int j;
                for ( j= i-1;j>=0 && temp < arr[j]; j--){
                    // 把前一个元素赋值给后一个数字,直到找到temp应该存在的位置
                    arr[j+1] = arr[j];
                }
                // 直到找到了这个位置，即前面的都小于，后面的都大于，然后插入
                // 为什么是j+1,因为是插入嘛, j是哪个小于temp的值，j+1是那个大于temp的值已经被移到j+1+1了
                // 所以j+1空给了temp
                arr[j+1] = temp;
            }
        }
    }
}
