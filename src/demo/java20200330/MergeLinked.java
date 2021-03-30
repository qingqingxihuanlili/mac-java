package demo.java20200330;

import demo.linked.Node;

/**
 * 功能描述:【部件码-适用环境-功能模块】
 *  
 * 【链表合并】
 *  
 * 创建人: qingqing
 * 创建时间: 2021/3/30 18:25
 **/
public class MergeLinked {

    public static void main(String[] args) {

        // 生成链表
        Node node1 = new Node(1);
        Node node2 = new Node(1);

        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.append(node3).append(node4);  // node1 : 1->3->4
        node2.append(node4).append(node5);  // node2 : 1->4->5

        // 递归合并链表
        Node result = mergeLinked(node1,node2);
        result.show();
    }

    /*
     *
     */
    private static Node mergeLinked(Node node1, Node node2) {

        if (node1 == null)
            return node2;

        if (node2 == null)
            return node1;

        Node head = null;

        if (node1.getData() <= node2.getData()){

            head = node1;
            head.next = mergeLinked(node1.next, node2);

        } else {

            head = node2;
            head.next = mergeLinked(node1, node2.next);

        }

        return head;

    }
}
