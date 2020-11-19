package com.test;

public class MyLinkedList {
    private  Node head;
    private  Node lastNode;
    private int lenght;
    MyLinkedList(){
        head=null;
    }
    public void addNode(int value){
        if (head==null) {
            head = new Node(value,null);
            lenght++;
            lastNode = head;
        }else{
            lastNode.nextNode=new Node(value,null);
            lastNode=lastNode.nextNode;
            lenght++;
        }
    }

    public  void addAtFirst(int value){
        Node node = new Node(value,head);
        head=node;
        lenght++;
    }
    public  void addAtLast(int value){
        Node node = new Node(value,null);
        lastNode.nextNode=node;
        lastNode=node;
        lenght++;
    }
    public Node getHead(){
        return this.head;
    }
    public int getLenght(){
        return this.lenght;
    }
    public Node reverse()
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.nextNode;
            current.nextNode = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", lastNode=" + lastNode +
                '}';
    }
}




