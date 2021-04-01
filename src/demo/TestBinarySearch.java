package src.demo;

public class TestBinarySearch {

    public static void main(String[] args) {
        // 目标数组
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        // 目标元素
        int target = 6;
        // 记录开始和结束,和中间
        int begin = 0;
        int end = arr.length-1;
        int mid = (begin+end)/2;
        //记录结果位置
        int index = -1;
        // 循环查找
        while (true){
            // 判断中间元素是不是
            if(arr[mid] == target){
                index = mid;
                break;
            }else{
                // 中间元素比目标元素大
                if(arr[mid]>target){
                    end = mid-1;
                }else{
                    begin = mid+1;
                }
            }
            // 取出新位置
            mid = (begin+end)/2;
        }
        System.out.println(index);
    }
}
