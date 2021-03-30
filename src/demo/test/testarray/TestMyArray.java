package demo.test.testarray;

import demo.util.MyArray;

public class TestMyArray {

    public static void main(String[] args) {

        // 创建一个可变的数组
        MyArray ma = new MyArray();

        System.out.println(ma.size());
        ma.add(99);
        ma.add(98);
        ma.add(97);
        ma.add(96);
        ma.add(95);
        ma.add(94);
        ma.show();
        ma.delete(2);
        ma.show();
        ma.insert(2,88);
        ma.show();


    }
}
