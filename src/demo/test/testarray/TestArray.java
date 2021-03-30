package demo.test.testarray;

public class TestArray {

    public static void main(String[] args) {

        // 创建数组
        int[] arr = new int[3];
        // 获取数组长度
        int length = arr.length;
        System.out.println("arr's length："+length);
        // 访问数组元素
        int element = arr[0];
        System.out.println("element："+element);
        // 访问数组元素
        arr[1] = 99;
        System.out.println("arr[1]："+arr[1]);
        // 遍历数组
        for (int i=0;i<length;i++){
            System.out.println("arr[i]："+arr[i]);
        }
        // 创建数组赋值
        int[] arr2 = new int[]{90,80,70,60,50};
        System.out.println("arr2's length："+arr2.length);
    }
}
