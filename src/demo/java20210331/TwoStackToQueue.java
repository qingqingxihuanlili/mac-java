package src.demo.java20210331;

import java.util.Stack;

/**
 * 功能描述:【部件码-适用环境-功能模块】
 *  
 * 【两个栈实现队列：且线程安全：一个栈入，一个栈出】
 *  
 * 创建人: qingqing
 * 创建时间: 2021/3/31 16:45
 **/
public class TwoStackToQueue {

    Stack<Character> stack1 = new Stack<Character>();  // 栈一负责进
    Stack<Character> stack2 = new Stack<Character>();  // 栈二负责出

    public void push(Character c){
        stack1.push(c);  // 栈一负责进
    }

    public Character pop(){
        // 栈二负责出

        if (stack2.size() == 0){
            // 需要从栈一取
            Character c = stack1.pop();
            stack2.push(c);
        }

        return stack2.pop();

    }


    public static void main(String[] args) {

    }
}
