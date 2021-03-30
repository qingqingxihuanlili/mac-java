package demo.linked;

// 节点
public class LoopNode {

    // 数据
    int data;

    // 连接下一个
    public LoopNode next = this;

    public LoopNode(int data) {
        this.data = data;
    }


    // 删除下一个节点 获取要删除的节点的下一个，和下下一个节点
    public void removeNext(){
        // 取出下下一个节点
        LoopNode newNext = this.next.next;
        //设置为当前节点的下一个节点
        this.next =newNext;
    }

    // 插入一个节点
    public void insertNode(LoopNode node){
        // 取出下一个节点  作为下下一个节点
        LoopNode nextNext = this.next;
        // 把新节点作为当前节点的下一个节点
        this.next = node;
        //把下下节点作为新节点的新节点
        node.next = nextNext;
    }

    // 获取下一个节点
    public LoopNode getNext(){
        return this.next;
    }

    // 获取数据
    public int getData(){
        return this.data;
    }


}
