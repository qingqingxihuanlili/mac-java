package src.demo.java20200330;

import src.demo.linked.Node;

/**
 * 功能描述:【部件码-适用环境-功能模块】
 *  
 * 【链表相加：两个链表同时遍历】
 *  
 * 创建人: qingqing
 * 创建时间: 2021/3/31 11:46
 **/
public class AddTwoLinked {


    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node1.append(node3).append(node6);
        node2.append(node4).append(node5);

        /*
        *   两个链表相加   node1[ 1 3 6 ]  node2[ 2 4 5 ]
        *   542 + 631 = 1173
        *   输出链表位 [ 3 7 1 1]
        *
        * */
        Node result = AddTwoLink(node1,node2);
        result.show();
    }

    /*
     *      将两个链表看成是相同长度的进行遍历，如果一个链表较短则在前面补0，比如 987 + 23 = 987 + 023 = 1010
     *      每一位计算的同时需要考虑上一位的进位问题，而当前位计算结束后同样需要更新进位值
     *      如果两个链表全部遍历完毕后，进位值为 1，则在新链表最前方添加节点 1
     *      对于链表问题，返回结果为头结点时，通常需要先初始化一个预先指针 pre，该指针的下一个节点指向真正的头结点head。
     *      使用预先指针的目的在于链表初始化时无可用节点值，而且链表构造过程需要指针移动，进而会导致头指针丢失，无法返回结果
     */
    private static Node AddTwoLink(Node node1, Node node2) {

        Node result = new Node(0); // 目标结果，但是先声明一个预先指点而且链表构造过程需要指针移动，进而会导致头指针丢失，无法返回结果
        Node temp = result;           //  操作节点，代替result进行移动，防止result丢失
        int value = 0;               // 进位符，用来表示相加超过10的时候，下一个节点还要多加一

        //退出循环条件是都走空
        while(node1 != null || node2 != null) {

            // 一个链表较短则在前面补0,相加之后，在加上进位符
            int x = node1 == null ? 0 : node1.getData();
            int y = node2 == null ? 0 : node2.getData();
            int sum = x + y + value;

            value = sum / 10;  // 判断进位符
            sum = sum % 10;    // 相加的结果
            temp.next = new Node(sum); // 赋值给temp
            temp = temp.next;

            // 相加赋值后 继续往下走
            if(node1 != null)
                node1 = node1.next;
            if(node2 != null)
                node2 = node2.next;
        }

        // 循环完之后还有就 在加一
        if(value == 1) {
            temp.next = new Node(value);
        }
        return result.next;
    }

}
