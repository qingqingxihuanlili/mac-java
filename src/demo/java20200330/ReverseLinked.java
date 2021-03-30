package demo.java20200330;

import demo.linked.Node;

/**
 * 功能描述:【部件码-适用环境-功能模块】
 *  
 * 【反转链表】
 *  
 * 创建人: qingqing
 * 创建时间: 2021/3/30 15:57
 **/
public class ReverseLinked {


    public static void main(String[] args) {

        // 生成链表
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.append(node2).append(node3).append(node4).append(node5);
        node1.show();

        // 遍历实现
        Node nodeResult = reverse(node1);
        nodeResult.show();

    }

    /*
    *    遍历实现 在反转当前节点之前先反转后续节点
    * */
    private static Node reverse(Node head) {

        if (head == null)
            return head;

        Node next = head.getNext();  //一直代表  下一个的节点b
        Node cur = head; //一直代表  当前的节点a                   通过遍历的核心模式就是 原：当前节点a -》 下一个的节点b ， 反转后  下一个的节点b -》 当前节点a
        Node temp;  // 下一个的节点b的下一个节点c，要存进临时变量，要不然的话，下一个的节点b的-》丢失之后，c就找不到了

        // 结束循环条件  下一个的节点b为null，已经没有下一个节点了
        while (next != null){

            /*
            *  需要做的步骤 当前节点a -》 下一个的节点b ， 反转后  下一个的节点b -》 当前节点a
            */

            temp = next.getNext(); //下一个的节点b的下一个节点c，要存进临时变量，要不然找不到了

            next.setNext(cur);  // 下一个的节点b -》 当前节点a

            cur = next;  // 将当前的节点a的值 变成a的下一个节点b  用于一直往下遍历

            next = temp; // 将下一个的节点b的值  变成下一个节点b的下一个节点c 设为临时

        }

        head.setNext(null);  // 为什么把这置空，因为此时是12345变成了5432 1 21212121212121212 其中1就是head，它关联2这个节点，2这个节点因为
        // 链表反转指向1，造成循环链表，要把它置空不再关联原有的链表

        return cur; //为什么返回a,因为此时a是末尾节点，毕竟b为null


    }

}
