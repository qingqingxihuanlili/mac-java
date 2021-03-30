package demo.util;

import java.util.Arrays;

public class MyArray {

    private int[] elements;

    public MyArray() {
        elements = new int[0];
    }

    // 获取数组长度
    public int size(){
        return elements.length;
    }

    // 添加元素
    public void add(int element){
        // 创建一个新的数组，长度是原数组加一
        int[] newArr = new int[elements.length+1];
        // 把原数组中的数据全部复制到新数组中
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        // 把目标元素加入新数组的最后
        newArr[elements.length] = element;
        // 新数组替换原数组
        elements = newArr;
    }

    // 删除元素
    public void delete(int index){

        // 判断
        if(index < 0 || index > elements.length-1){
            throw new RuntimeException("下标越界");
        }
        // 创建一个新的数组，长度是原数组减一
        int[] newArr2 = new int[elements.length-1];
        // 复制原数组除了要删除的那个元素的其他元素
        for (int i = 0; i < newArr2.length; i++) {
            // 要删除的元素，是之前的元素
            if(i<index){
                newArr2[i] = elements[i];
            }else {
                // 要删除的元素，是之后的元素
                newArr2[i] = elements[i+1];
            }
        }
        // 新数组替换原数组
        elements = newArr2;
    }

    // 获取元素
    public int get(int index){
        return elements[index];
    }

    // 插入元素
    public void insert(int index,int element){
        // 创建一个新的数组，长度是原数组加一
        int[] newArr2 = new int[elements.length+1];
        // 复制原数组除了要删除的那个元素的其他元素
        for (int i = 0; i < elements.length; i++) {
            // 要删除的元素，是之前的元素
            if(i<index){
                newArr2[i] = elements[i];
            }else {
                // 要删除的元素，是之后的元素
                newArr2[i+1] = elements[i];
            }
        }
        newArr2[index] = element;
        // 新数组替换原数组
        elements = newArr2;
    }

    // 替换元素
    public void set(int index,int element){
        elements[index] = element;
    }

    // 打印元素
    public void show(){
        System.out.println(Arrays.toString(elements));
    }
}
