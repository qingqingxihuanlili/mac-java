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

        // 循环结束条件，一个链表走到头了
        while (node1 != null && node2 != null){

            if (node1.getData() <= node2.getData()) {

                result.next = node1;
                node1 = node1.next;

            }else {

                result.next = node2;
                node2 = node2.next;

            }

            result = result.next;

        }

        // 判断出没走完的链表，将其添加到新链表到尾巴上面
        if (node1 == null) {
            result.next = node2;
        }

        if (node2 == null) {
            result.next = node1;
        }

        return result.next;
    }
}
