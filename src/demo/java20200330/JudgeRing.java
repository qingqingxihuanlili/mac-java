package src.demo.java20200330;


import src.demo.linked.Node;

/**
 * 功能描述:【部件码-适用环境-功能模块】
 *  
 * 【判断是否有环：快慢指针】
 *  
 * 创建人: qingqing
 * 创建时间: 2021/3/30 17:31
 **/
public class JudgeRing {

    public static void main(String[] args) {
        // 生成链表
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.append(node2).append(node3).append(node4).append(node5);
        node5.setNext(node2);

        // 判断是否有环
        boolean b = checkRing(node1);
        System.out.println(b);
    }


    /*
     *      声明两个指针，一个指针走一次经过两个节点(快指针quick)，另一个走一次经过一个节点(慢指针slow)
     *      方法说明：快指针走的比较快，若链表有环，则一定会追上慢指针，若无环，则会走到链表末端。
    */
    private static boolean checkRing(Node node1) {

        Node quick = node1;
        Node slow = node1;

        //当快指针能够走到头表示无环
        while(quick != null && quick.next!=null){

            quick = quick.next.next; // 快指针一次走两格
            slow = slow.next; // 慢指针一次走一格

            // 如果quick等于slow，说明有环因为quick追上了slow
            if(quick == slow){
                return true;
            }

        }

        return false;

    }
}
