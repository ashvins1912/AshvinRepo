package com.test;

public  final class Node {
 Node nextNode;
 int value;
    Node(int d,Node node)
    {
        value = d;
        nextNode = node;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "nextNode=" + nextNode +
                ", value=" + value +
                '}';
    }
}
