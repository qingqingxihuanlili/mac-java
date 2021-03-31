package src.demo.java20200330;

import src.demo.linked.Node;

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
        Node node6 = new Node(6);

        node1.append(node3);
        node1.append(node6);   // node1 : 1->3->6
        node2.append(node4).append(node6);  // node2 : 1->4->6

        // 递归合并链表
        Node result = mergeLinked(node1,node2);
        result.show();
    }

    /*
     *  做一条新链表，遍历node1和node2两个链表，小的排前面，并且拥有小的链表往下走，然后接着比，直到
     * 一个链表走到头，之后把另外的那个没走完的链表附加到新链表的尾巴上
     */
    private static Node mergeLinked(Node node1, Node node2) {

        // 如果node1，node2有一条是空的，直接返回另外一条
        if (node1 == null) {
            return node2;
        }

        if (node2 == null) {
            return node1;
        }

        Node result = new Node(0);
        Node nodeResult = result;


        // 循环结束条件，一个链表走到头了
        while (node1 != null && node2 != null){

            //临时变量用于存储临时节点！！！！！！为什么呢因为next是null的好赋值
            Node temp = new Node(0);

            if (node1.getData() <= node2.getData()) {

                //将小的值赋给临时节点
                temp.setData(node1.getData());
                //较小的链表指针往下移
                node1 = node1.next;

            }else {

                temp.setData(node2.getData());
                node2 = node2.next;

            }

            // 将临时节点赋值给结果集，结果集往下走等待下一轮赋值
            result.next = temp;
            result = result.next;

        }

        // 判断出没走完的链表，将其添加到新链表到尾巴上面
        if (node1 == null) {
            result.next = node2;
        }

        if (node2 == null) {
            result.next = node1;
        }

        // 因为result第一位是无效位
        return nodeResult.next;
    }
}
