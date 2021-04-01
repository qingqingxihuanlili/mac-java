package src.demo.sort;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = new int[]{1,5,8,9,7,5,6,3,10,8,9};

        for (int i=0;i<arr.length;i++){
            System.out.printf("   "+arr[i]);
        }

        System.out.println();
        System.out.println();

        // 比较轮数 n-1 轮
        for (int i = 0; i < arr.length-1 ; i++) {
            // 每轮比较的次数，但是要去掉当前的i，因为每比较一次，i就会固定一个位置，所以j就可以少比较一轮
            for(int j = 0; j<arr.length - 1 - i;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i=0;i<arr.length;i++){
            System.out.printf("   "+arr[i]);
        }
    }


}
