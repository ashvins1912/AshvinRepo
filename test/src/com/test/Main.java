package com.test;

public class Main {
    public static void main(String[] args) throws Exception {
    MyLinkedList linkedList =  new MyLinkedList();
    linkedList.addNode(2);
    linkedList.addNode(4);
    linkedList.addNode(5);
    linkedList.addNode(12);
    linkedList.addNode(41);
    linkedList.addNode(23);
    linkedList.addNode(52);
    linkedList.addNode(44);
    linkedList.addNode(56);
    linkedList.addAtFirst(99);
    linkedList.addAtLast(80);
    Node node = linkedList.getHead();
    for (int i = 0 ; i<linkedList.getLenght();i++){
    System.out.print(node.value+"\t");
    node= node.nextNode;
    }
    System.out.println();
    Node nodeNew = linkedList.reverse();
        for (int i = 0 ; i<linkedList.getLenght();i++){
            System.out.print(nodeNew.value+"\t");
            nodeNew= nodeNew.nextNode;
        }
      }


}
