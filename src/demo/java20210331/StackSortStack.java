package src.demo.java20210331;

import java.util.Stack;

/**
 * 功能描述:【部件码-适用环境-功能模块】
 *  
 * 【用一个栈对另一个栈进行排序】
 *  
 * 创建人: qingqing
 * 创建时间: 2021/3/31 17:05
 **/
public class StackSortStack {

    public static void main(String[] args) {

        //初始化栈，入栈21324
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(2);
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(4);

        Stack<Integer> result = new Stack<Integer>();

        // 循环结束标志，stack为空，全部排序好
        while (!stack.isEmpty()){

            int pop = stack.pop();

            // 第一个直接进去
            if (result.isEmpty()){
                result.push(pop);
            }

            //栈顶是最小元素，栈底是最大元素排序
            if (pop <= result.peek()){

                result.push(pop);  // 小于直接进去

            }else {

                // pop大于栈顶元素，那么栈顶元素需要弹出来给pop让路,进入循环条件，result不是空并且pop依旧大于result的栈顶元素
                while (pop > result.peek() && !result.isEmpty()){

                    int pop1 = result.pop();
                    stack.push(pop1);

                }

                result.push(pop);

            }

        }


        System.out.println(result.pop());
        System.out.println(result.pop());
        System.out.println(result.pop());
        System.out.println(result.pop());
        System.out.println(result.pop());


    }
}
