package demo.linked;

public class DoubleNode {

    // 上一个节点
    DoubleNode pre = this;
    // 数据
    int data;
    // 下一个节点
    DoubleNode next = this;

    public DoubleNode(int data) {
        this.data = data;
    }

    // 获取数据
    public int getData(){
        return this.data;
    }

    // 删除一个节点
    public void remove(){
        // 取出下下一个节点
        DoubleNode doubleNode = this.next.next;
        //设置为当前节点的下一个节点
        this.next = doubleNode;
        // 设置新节点的上一个节点为this
        doubleNode.pre = this;

    }

    // 增加一个节点
    public void insert(DoubleNode doubleNode){
        // 找到原来当前的下一个节点
        DoubleNode nextNext = this.next;
        // 把新节点作为当前的节点的下一个节点
        this.next = doubleNode;
        // 把当前节点 作为 新节点的 前节点
        doubleNode.pre = this;
        // 把下下节点 与新节点关系 首先是next
        doubleNode.next = nextNext;
        // 再然后是pre
        nextNext.pre = doubleNode;

    }

    // 获取下一个节点
    public DoubleNode getNext(){
        return this.next;
    }

    // 获取上一个节点
    public DoubleNode getPre(){
        return this.pre;
    }
}
