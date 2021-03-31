package src.demo.linked;

// 节点
public class Node {

    // 数据
    int data;

    // 连接下一个
    public Node next;

    public Node(int data) {
        this.data = data;
    }

    // 为节点 追加节点，一直追加
    public Node append(Node node){
        Node currentNode = this;
        while (true){
            // 取出下一个节点
            Node nextNode = currentNode.getNext();
            //  确定当前节点是否是最后一个节点
            if(nextNode == null){
                break;
            }
            //赋给当前节点
            currentNode = nextNode;
        }
        // 追加新的节点
        currentNode.next = node;
        return this;
    }

    // 删除下一个节点 获取要删除的节点的下一个，和下下一个节点
    public void removeNext(){
        // 取出下下一个节点
        Node newNext = this.next.next;
        //设置为当前节点的下一个节点
        this.next =newNext;
    }

    // 插入一个节点
    public void insertNode(Node node){
        // 取出下一个节点  作为下下一个节点
        Node nextNext = this.next;
        // 把新节点作为当前节点的下一个节点
        this.next = node;
        //把下下节点作为新节点的新节点
        node.next = nextNext;
    }

    // 获取下一个节点
    public Node getNext(){
        return this.next;
    }

    // 获取数据
    public int getData(){
        return this.data;
    }

    // 查看当前节点是否是最后一个节点
    public boolean isLast(){
        return this.next == null;
    }

    // 显示所有节点
    public void show(){
        Node currentNode = this;
        while (currentNode != null){
            System.out.println(currentNode.getData());
            currentNode = currentNode.next;
        }
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
