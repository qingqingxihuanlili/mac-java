package demo.test.testarray;

import java.util.Arrays;

public class TestOpArray {

    public static void main(String[] args) {
        f20200330();
        System.out.println("-------------------------");
        // 数组的长度不可变
        int[] arr = new int[]{9,8,7};
        // 快速查看数组中的元素
        System.out.println(Arrays.toString(arr));
        // 要加入的元素
        int dst = 6;
        // 创建一个新的数组，长度是原数组加一
        int[] newArr = new int[arr.length+1];
        // 把原数组中的数据全部复制到新数组中
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        // 把目标元素加入新数组的最后
        newArr[arr.length] = dst;
        // 新数组替换原数组
        arr = newArr;
        System.out.println(Arrays.toString(arr));

        // 删除数组元素，第2个 9 8 7 6
        int value = 2;
        // 创建一个新的数组，长度是原数组减一
        int[] newArr2 = new int[arr.length-1];
        // 复制原数组除了要删除的那个元素的其他元素
        for (int i = 0; i < newArr2.length; i++) {
            // 要删除的元素，是之前的元素
            if(i<value){
                newArr2[i] = arr[i];
            }else {
                // 要删除的元素，是之后的元素
                newArr2[i] = arr[i+1];
            }
        }
        // 新数组替换原数组
        arr = newArr2;
        System.out.println(Arrays.toString(arr));
    }


    /**
     *  2020-03-30 数组元素的添加和删除
     *  实现步骤：创建一个新数组，进行赋值，在转换回来
     */
    static void f20200330(){

        int[] arr = new int[]{9,8,7,6,5,4,3,2};
        System.out.println(Arrays.toString(arr));

        //插入一个数据 1
        int dst = 1;
        int[] newArrAdd = new int[arr.length + 1];

        for (int i = 0; i<arr.length;i++){
            newArrAdd[i] = arr[i];
        }

        newArrAdd[arr.length] = dst;
        arr = newArrAdd;
        System.out.println(Arrays.toString(arr));

        // 删除一个数据
        int value = 2;
        int[] newArrAdd2 = new int[arr.length - 1];

        for (int i = 0; i<newArrAdd2.length;i++){

            if (i < value){
                newArrAdd2[i] = arr[i];
            }else {
                newArrAdd2[i] = arr[i+1];
            }
        }
        arr = newArrAdd2;
        System.out.println(Arrays.toString(arr));

        // 插入元素
        int index = 2;
        int indexValue = 40;
        int[] newArrInsert = new int[arr.length + 1];

        for (int i =0;i<arr.length;i++){

            if (i<index){
                newArrInsert[i] = arr[i];
            }else {
                newArrInsert[i+1] = arr[i];
            }

        }

        newArrInsert[index] = indexValue;
        arr = newArrInsert;
        System.out.println(Arrays.toString(arr));

    }

}
