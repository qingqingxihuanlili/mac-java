package demo.linked;

/**
 * 功能描述:【部件码-适用环境-功能模块】
 *  
 * 【】
 *  
 * 创建人: qingqing
 * 创建时间: 2021/3/30 14:10
 **/
public class Node20210330 {

    int data;
    Node20210330 next;

    int getData(){
        return this.data;
    }

    Node20210330 getNext(){
        return this.next;
    }

    void show(){
        Node20210330 concurrent = this;
        while (concurrent != null){
            System.out.println(concurrent.getData());
            concurrent = concurrent.getNext();
        }
    }

    boolean isLast(Node20210330 node20210330){
        if (node20210330.getNext() == null){
            return true;
        }else {
            return false;
        }
    }

    Node20210330 append(Node20210330 node20210330){
        Node20210330 concurrent = this;
        while (true){
            Node20210330 next = concurrent.getNext();
            if (next == null){
                break;
            }
            concurrent = next;
        }

        concurrent.next = node20210330;
        return this;
    }

    void remove(){
        Node20210330 next = this.next.next;
        this.next = next;
    }

    void insert(Node20210330 node20210330){
        Node20210330 next = this.next;
        this.next = node20210330;
        node20210330.next = next;
    }

}
