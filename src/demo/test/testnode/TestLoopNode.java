package demo.test.testnode;

import demo.linked.LoopNode;

public class TestLoopNode {
    public static void main(String[] args) {
        LoopNode n1 = new LoopNode(1);
        LoopNode n2 = new LoopNode(2);
        LoopNode n3 = new LoopNode(3);
        LoopNode n4 = new LoopNode(4);
        LoopNode n5 = new LoopNode(5);
        LoopNode n6 = new LoopNode(6);

        n1.insertNode(n2);
        n2.insertNode(n3);
        n3.insertNode(n4);
        System.out.println(n1.next.getData());
        System.out.println(n4.next.getData());
    }
}
