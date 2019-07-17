package com.dm.example.linked;

/**
 * 链表
 * 火车头节点+下节车厢
 *  ______
 * |_1|_2|
 */
public class MyLinked {

    //节点内容
    private int data;

    //下一个节点
    private MyLinked next;

    public MyLinked(int data){
        this.data = data;
    }

    /**
     * 追加节点
     * @param linked
     */
    public MyLinked append(MyLinked linked){
        //获得当前节点
        MyLinked currentLinked = this;
        while(true){
            //无限追加下一个节点
            MyLinked nextLinked =  currentLinked.next;
            if(nextLinked == null){
                break;
            }
            //获取最后一个节点
            currentLinked = nextLinked;
        }
        //赋值
        currentLinked.next = linked;
        return this;
    }

    /**
     * 删除当前节点的下一个节点
     * 操作都是以当前节点为对象
      */
    public void remove(){
        //取出下下个节点
        MyLinked nextNext =  this.next.next;
        //将下一个节点接入下下个节点
        this.next = nextNext;
    }

    public void show(){
        MyLinked currentLinked = this.next;
        System.out.println(this.getData());
        while(true){
            if(currentLinked == null){
                break;
            }
            System.out.println(currentLinked.getData());
            currentLinked = currentLinked.next;
        }
    }

    /**
     * 插入当前节点的下一个节点
     * @param linked
     */
    public void after(MyLinked linked){
        //取出下一个节点
        MyLinked next = this.next;
        linked.next = next;
        this.next = linked;
    }


    //获取下一个节点
    public MyLinked next(){
        return this.next;
    }

    //获取节点中的数据
    public int getData(){
        return this.data;
    }

    public static void main(String[] args) {
        MyLinked linked = new MyLinked(1);
        linked.append(new MyLinked(2)).append(new MyLinked(3));
        //System.out.println(linked.getData());
        //System.out.println(linked.next().getData());
        //System.out.println(linked.next().next().getData());
        //linked.remove();
        linked.after(new MyLinked(5));
        linked.after(new MyLinked(6));
        linked.show();
    }

}
