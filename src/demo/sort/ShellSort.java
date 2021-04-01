package src.demo.sort;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {

        int[] arr = new int[]{5,8,9,6,4,5,2,3,10,52,14,36,48,100,2,7,99,51,18,36};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void shellSort(int[] arr) {

        /*
        *  希尔排序：插入排序的加强版，在插入排序之前，按照步长进行筛选，三个for循环，一个if
        *
        *  步长 = 元素个数/2 不断的/2 直到为0，第一层循环，循环次数就是n个步长
        *  根据步长分组，以步长为间距的同一个为同一组，即第二层循环
        *  一个分组内进行比较，小的排前面，进行组内排序，即第三层循环
        * */

        // 第一次循环，元素个数/2，直到为0
        for(int d = arr.length/2;d>0;d=d/2){

            // i从d开始，通过减法进行运算
            for (int i = d;i<arr.length;i++){

                // j从i-d开始，也就是0开始，如果不这样做 2 1 0 这种只会做一次循环结果为 1 0 2
                // 这是不对的，我们需要的是 0 1 2 所以不能只过一次，通过减法这种方式，我们过了几次，让 1 0也可以交换为 0 1
                // 精髓就是 j = j - d ，这样可以进行多次，只要j>=0都可以进行比较
                for (int j = i- d;j>=0;j-=d){
                    if (arr[j] > arr[j+d]){
                        int temp = arr[j];
                        arr[j] = arr[j+d];
                        arr[j+d] = temp;
                    }
                }
            }

        }
    }
}
