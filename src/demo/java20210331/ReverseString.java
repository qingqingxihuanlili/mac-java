package src.demo.java20210331;

import java.util.Stack;

/**
 * 功能描述:【部件码-适用环境-功能模块】
 *  
 * 【字符串反转（全部翻转和单词翻转)】
 *  
 * 创建人: qingqing
 * 创建时间: 2021/3/31 15:05
 **/
public class ReverseString {

    public static void main(String[] args) {

        String s1 = "ReverseString";
        long start = System.currentTimeMillis();
        String result= reverseString(s1);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println(result);
    }

    private static String reverseString(String s1) {

        // 第一种方法  StringBuffer或者StringBuilder
        String reverse = new StringBuffer(s1).reverse().toString();


        // 第二种方法  栈先进先出
        char[] array = s1.toCharArray();
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < array.length; i++){
            stack.push(array[i]);
        }

        String reverse2 = "";
        for (int i = 0; i < array.length; i++){
            reverse2 += stack.pop();
        }

        return reverse;
    }
}
