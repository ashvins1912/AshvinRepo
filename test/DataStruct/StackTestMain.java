package test.DataStruct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class StackTestMain {
    public static void main(String args[] )
    {
        MyStack myStack =  new MyStack();
        myStack.push(10);
        myStack.push(12);
        myStack.push(14);
        myStack.push(16);
        myStack.push(19);
        myStack.push(1);
        myStack.push(12);
        myStack.push(4);
        myStack.push(6);
        myStack.push(9);
        myStack.showStack();

        System.out.println("\n Removing all");

        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        System.out.println("check is empty : ");
        System.out.println(myStack.isEmpty());
        myStack.peek();
        System.out.println("added 34 at 0 : ");
        myStack.push(34);
        System.out.println(myStack.isEmpty());
        myStack.peek();
        myStack.showStack();

        System.out.println("\n removed one at 0");
        System.out.println(myStack.removeFromIndex(0));
        System.out.println(myStack.isEmpty());
        myStack.peek();
        myStack.showStack();
        System.out.println("added 34 4 3");
        //Pushed one
        myStack.push(34);
        myStack.push(4);
        myStack.push(3);
        System.out.println(myStack.isEmpty());
        myStack.peek();
        myStack.showStack();


    }
}
