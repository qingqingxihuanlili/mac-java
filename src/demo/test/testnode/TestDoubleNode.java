package demo.test.testnode;

import demo.linked.DoubleNode;

public class TestDoubleNode {
    public static void main(String[] args) {
        DoubleNode d1 = new DoubleNode(1);
        DoubleNode d2 = new DoubleNode(2);
        DoubleNode d3 = new DoubleNode(3);
        d1.insert(d2);
        d2.insert(d3);

        System.out.println(d2.getPre().getData());
        System.out.println(d2.getNext().getData());
        d1.remove();
        System.out.println(d1.getNext().getData());
        System.out.println(d3.getPre().getData());

    }
}
