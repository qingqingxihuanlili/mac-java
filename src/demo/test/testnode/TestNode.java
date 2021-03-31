package src.demo.test.testnode;

import src.demo.linked.Node;

public class TestNode {

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.append(node2);
        node1.append(node3).append(node4);

        node1.show();
        node2.removeNext();
        node1.show();
        node2.insertNode(new Node(5));
        node1.show();
        //System.out.println(node1.getNext().getNext().getData());

    }
}
